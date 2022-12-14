package br.com.unisagrado.appqueimaduras.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import br.com.unisagrado.appqueimaduras.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        views();
    }

    private void views() {
        CardView cardHistorias = findViewById(R.id.cardHistorias);
        CardView cardQuiz = findViewById(R.id.cardQuiz);
        CardView cardCreditos = findViewById(R.id.cardCreditos);

        cardHistorias.setOnClickListener(this::abrir);
        cardQuiz.setOnClickListener(this::abrir);
        cardCreditos.setOnClickListener(this::abrir);
    }

    private void abrir(View view) {
        if(view.getId() == R.id.cardHistorias) {
            Intent intent = new Intent(this, HistoriasActivity.class);
            startActivity(intent);
        } else if(view.getId() == R.id.cardQuiz) {
            Intent intent = new Intent(this, SelecaoQuizActivity.class);
            startActivity(intent);
        } else if(view.getId() == R.id.cardCreditos) {
            Intent intent = new Intent(this, CreditosActivity.class);
            startActivity(intent);
        }
    }
}
package br.com.unisagrado.appqueimaduras;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardHistorias = findViewById(R.id.cardHistorias);
        CardView cardQuiz = findViewById(R.id.cardQuiz);
        CardView cardCreditos = findViewById(R.id.cardCreditos);

        cardHistorias.setOnClickListener(this::abrirHistorias);

    }

    private void abrirHistorias(View view){
        Intent intent = new Intent(this, HistoriasActivity.class);
        startActivity(intent);
    }
}
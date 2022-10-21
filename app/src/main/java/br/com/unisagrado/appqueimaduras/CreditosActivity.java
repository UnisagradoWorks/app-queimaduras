package br.com.unisagrado.appqueimaduras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CreditosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        ImageView menuPrincipal = findViewById(R.id.home);
        menuPrincipal.setOnClickListener(this::abrirMenuPrincipal);
    }

    private void abrirMenuPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
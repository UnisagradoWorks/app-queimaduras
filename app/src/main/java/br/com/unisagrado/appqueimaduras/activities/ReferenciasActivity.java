package br.com.unisagrado.appqueimaduras.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.unisagrado.appqueimaduras.R;

public class ReferenciasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referencias);

        ImageView menuPrincipal = findViewById(R.id.home);
        menuPrincipal.setOnClickListener(this::abrirMenuPrincipal);
    }

    private void abrirMenuPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
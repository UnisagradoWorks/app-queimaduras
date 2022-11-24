package br.com.unisagrado.appqueimaduras.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.unisagrado.appqueimaduras.R;
import br.com.unisagrado.appqueimaduras.utils.AppUtils;

public class CreditosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);
        views();
    }

    private void views() {
        ImageView menuPrincipal = findViewById(R.id.home);
        menuPrincipal.setOnClickListener(AppUtils::abrirHome);

        ImageView desenvolvedores = findViewById(R.id.desenvolvedores);
        desenvolvedores.setOnClickListener(this::abrirTela);

        ImageView instituicao = findViewById(R.id.instituicao);
        instituicao.setOnClickListener(this::abrirTela);

        ImageView referencias = findViewById(R.id.referencias);
        referencias.setOnClickListener(this::abrirTela);
    }

    private void abrirTela(View view) {
        if(view.getId() == R.id.desenvolvedores) {
            Intent intent = new Intent(this, DesenvolvedoresActivity.class);
            startActivity(intent);
        } else if(view.getId() == R.id.instituicao) {
            Intent intent = new Intent(this, InstituicaoActivity.class);
            startActivity(intent);
        } else if(view.getId() == R.id.referencias) {
            Intent intent = new Intent(this, ReferenciasActivity.class);
            startActivity(intent);
        }
    }
}
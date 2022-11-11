package br.com.unisagrado.appqueimaduras.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.unisagrado.appqueimaduras.R;

public class ReferenciasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referencias);

        views();
    }

    private void views() {
        ImageButton referencia1 = findViewById(R.id.referencia1);
        ImageButton referencia2 = findViewById(R.id.referencia2);
        ImageButton referencia3 = findViewById(R.id.referencia3);
        ImageButton referencia4 = findViewById(R.id.referencia4);
        ImageView menuPrincipal = findViewById(R.id.home);

        referencia1.setOnClickListener(this::abrirUrl);
        referencia2.setOnClickListener(this::abrirUrl);
        referencia3.setOnClickListener(this::abrirUrl);
        referencia4.setOnClickListener(this::abrirUrl);
        menuPrincipal.setOnClickListener(this::abrirMenuPrincipal);
    }

    private void abrirMenuPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void abrirUrl(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        if(view.getId() == R.id.referencia1){
            String url = "https://www.istockphoto.com/br/search/stack/804510049?assettype=image";
            intent.setData(android.net.Uri.parse(url));
        } else if (view.getId() == R.id.referencia2){
            String url = "http://anaviq.org.br/";
            intent.setData(android.net.Uri.parse(url));
        } else if (view.getId() == R.id.referencia3){
            String url = "https://www.msdmanuals.com/pt-br/profissional/les%C3%B5es-intoxica%C3%A7%C3%A3o/queimaduras/queimaduras";
            intent.setData(android.net.Uri.parse(url));
        } else if (view.getId() == R.id.referencia4){
            String url = "https://www.einstein.br/doencas-sintomas/queimaduras";
            intent.setData(android.net.Uri.parse(url));
        }
        startActivity(intent);
    }
}
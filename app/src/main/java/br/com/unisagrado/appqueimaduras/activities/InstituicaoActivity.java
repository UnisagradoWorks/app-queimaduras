package br.com.unisagrado.appqueimaduras.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.unisagrado.appqueimaduras.R;

public class InstituicaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instituicao);
        views();
    }

    private void views() {
        TextView nomeApp = findViewById(R.id.nomeApp);
        nomeApp.setOnClickListener(this::abrirUrl);

        ImageView logoUnisagrado = findViewById(R.id.logoUnisagrado);
        logoUnisagrado.setOnClickListener(this::abrirUrl);

        ImageView logoProjetoExtensao = findViewById(R.id.logoProjetoExtensao);
        logoProjetoExtensao.setOnClickListener(this::abrirUrl);

        ImageView linkedInElvio = findViewById(R.id.linkedInElvio);
        linkedInElvio.setOnClickListener(this::abrirUrl);

        ImageView menuCreditos = findViewById(R.id.home);
        menuCreditos.setOnClickListener(this::abrirMenuCreditos);
    }

    private void abrirMenuCreditos(View view) {
        Intent intent = new Intent(this, CreditosActivity.class);
        startActivity(intent);
    }

    private void abrirUrl(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        if (view.getId() == R.id.logoUnisagrado) {
            String url = "https://www.unisagrado.edu.br/";
            intent.setData(android.net.Uri.parse(url));
        } else if (view.getId() == R.id.logoProjetoExtensao) {
            String url = "https://unisagrado.edu.br/site/conteudo/11162-unisagrado-tem-nova-pro-reitora-de-extensao-.html";
            intent.setData(android.net.Uri.parse(url));
        } else if (view.getId() == R.id.linkedInElvio) {
            String url = "https://www.linkedin.com/in/elvio-gilberto-da-silva-643699191/";
            intent.setData(android.net.Uri.parse(url));
        } else if (view.getId() == R.id.nomeApp) {
            String url = "https://github.com/UnisagradoWorks";
            intent.setData(android.net.Uri.parse(url));
        }
        startActivity(intent);
    }
}
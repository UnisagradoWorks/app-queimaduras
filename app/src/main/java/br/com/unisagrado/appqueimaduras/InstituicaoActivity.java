package br.com.unisagrado.appqueimaduras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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

        ImageView linkedInElvio = findViewById(R.id.linkedInElvio);
        linkedInElvio.setOnClickListener(this::abrirUrl);

        ImageView menuPrincipal = findViewById(R.id.home);
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

        if(view.getId() == R.id.logoUnisagrado){
            String url = "https://www.unisagrado.edu.br/";
            intent.setData(android.net.Uri.parse(url));
        } else if (view.getId() == R.id.linkedInElvio){
            String url = "https://www.linkedin.com/in/elvio-gilberto-da-silva-643699191/";
            intent.setData(android.net.Uri.parse(url));
        } else if(view.getId() == R.id.nomeApp){
            String url = "https://github.com/UnisagradoWorks";
            intent.setData(android.net.Uri.parse(url));
        }
        startActivity(intent);
    }
}
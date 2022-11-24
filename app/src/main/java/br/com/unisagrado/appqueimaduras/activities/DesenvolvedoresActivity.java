package br.com.unisagrado.appqueimaduras.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.unisagrado.appqueimaduras.R;
import br.com.unisagrado.appqueimaduras.utils.AppUtils;

public class DesenvolvedoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desenvolvedores);
        views();
    }

    private void views() {
        ImageView felipe = findViewById(R.id.felipe);
        felipe.setOnClickListener(this::abrirUrl);

        ImageView jessica = findViewById(R.id.jessica);
        jessica.setOnClickListener(this::abrirUrl);

        ImageView mariana = findViewById(R.id.mariana);
        mariana.setOnClickListener(this::abrirUrl);

        ImageView paulo = findViewById(R.id.paulo);
        paulo.setOnClickListener(this::abrirUrl);

        ImageView bueno = findViewById(R.id.bueno);
        bueno.setOnClickListener(this::abrirUrl);

        ImageView marcos = findViewById(R.id.marcos);
        marcos.setOnClickListener(this::abrirUrl);

        ImageView menuPrincipal = findViewById(R.id.home);
        menuPrincipal.setOnClickListener(AppUtils::abrirHome);
    }

    private void abrirUrl(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        if(view.getId() == R.id.felipe){
            String url = "https://github.com/LipeGabriell";
            intent.setData(android.net.Uri.parse(url));
        } else if (view.getId() == R.id.jessica){
            String url = "https://github.com/jescacelestino";
            intent.setData(android.net.Uri.parse(url));
        } else if (view.getId() == R.id.mariana){
            String url = "https://github.com/mariferndes";
            intent.setData(android.net.Uri.parse(url));
        } else if (view.getId() == R.id.paulo){
            String url = "https://github.com/pauloferrarez";
            intent.setData(android.net.Uri.parse(url));
        } else if (view.getId() == R.id.bueno){
            String url = "https://github.com/BuenoBueno";
            intent.setData(android.net.Uri.parse(url));
        } else if (view.getId() == R.id.marcos){
            String url = "https://www.linkedin.com/in/mv-rangel";
            intent.setData(android.net.Uri.parse(url));
        }
        startActivity(intent);
    }
}
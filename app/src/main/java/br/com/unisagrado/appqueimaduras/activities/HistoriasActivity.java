package br.com.unisagrado.appqueimaduras.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.unisagrado.appqueimaduras.R;
import br.com.unisagrado.appqueimaduras.utils.AppUtils;

public class HistoriasActivity extends AppCompatActivity {

    public static final String HISTORIA_SELECIONADA = "HistoriasActivity.HISTORIA_SELECIONADA";
    public static final String AGENTES = "HistoriasActivity.AGENTES";
    public static final String GRAUS = "HistoriasActivity.GRAUS";
    public static final String PREVENCOES = "HistoriasActivity.PREVENCOES";
    public static final String SOCORROS = "HistoriasActivity.SOCORROS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historias);

        ImageView cardAgentes = findViewById(R.id.cardAgentes);
        ImageView cardGraus = findViewById(R.id.cardGraus);
        ImageView cardPrevencoes = findViewById(R.id.cardPrevencoes);
        ImageView cardSocorros = findViewById(R.id.cardSocorros);

        ImageView imgHome = findViewById(R.id.imgHome);

        imgHome.setOnClickListener(AppUtils::abrirHome);
        cardAgentes.setOnClickListener(this::abrirHistoriaAgentes);
        cardGraus.setOnClickListener(this::abrirHistoriaGraus);
        cardPrevencoes.setOnClickListener(this::abrirHistoriaPrevencoes);
        cardSocorros.setOnClickListener(this::abrirHistoriaSocorros);
    }

    private void abrirHistoriaAgentes(View view) {
        Intent intent = new Intent(this, HistoriaInfoActivity.class);
        intent.putExtra(HISTORIA_SELECIONADA, AGENTES);
        startActivity(intent);
    }

    private void abrirHistoriaGraus(View view) {
        Intent intent = new Intent(this, HistoriaInfoActivity.class);
        intent.putExtra(HISTORIA_SELECIONADA, GRAUS);
        startActivity(intent);
    }

    private void abrirHistoriaPrevencoes(View view) {
        Intent intent = new Intent(this, HistoriaInfoActivity.class);
        intent.putExtra(HISTORIA_SELECIONADA, PREVENCOES);
        startActivity(intent);
    }

    private void abrirHistoriaSocorros(View view) {
        Intent intent = new Intent(this, HistoriaInfoActivity.class);
        intent.putExtra(HISTORIA_SELECIONADA, SOCORROS);
        startActivity(intent);
    }
}
package br.com.unisagrado.appqueimaduras;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HistoriasActivity extends AppCompatActivity {

    public static final String HISTORIA = "HistoriasActivity.AGENTES";
    public static final String AGENTES = "HistoriasActivity.AGENTES";
    public static final String GRAUS = "HistoriasActivity.GRAUS";
    public static final String PREVENCOES = "HistoriasActivity.PREVENCOES";
    public static final String SOCORROS = "HistoriasActivity.SOCORROS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historias);

        CardView cardAgentes = findViewById(R.id.cardAgentes);
        CardView cardGraus = findViewById(R.id.cardGraus);
        CardView cardPrevencoes = findViewById(R.id.cardPrevencoes);
        CardView cardSocorros = findViewById(R.id.cardSocorros);

        cardAgentes.setOnClickListener(this::abrirHistoriaAgentes);
        cardGraus.setOnClickListener(this::abrirHistoriaGraus);
        cardPrevencoes.setOnClickListener(this::abrirHistoriaPrevencoes);
        cardSocorros.setOnClickListener(this::abrirHistoriaSocorros);
    }

    private void abrirHistoriaAgentes(View view) {
        Intent intent = new Intent(this, HistoriaInfoActivity.class);
        intent.putExtra(HISTORIA, AGENTES);
        startActivity(intent);
    }

    private void abrirHistoriaGraus(View view) {
        Intent intent = new Intent(this, HistoriaInfoActivity.class);
        intent.putExtra(HISTORIA, GRAUS);
        startActivity(intent);
    }

    private void abrirHistoriaPrevencoes(View view) {
        Intent intent = new Intent(this, HistoriaInfoActivity.class);
        intent.putExtra(HISTORIA, PREVENCOES);
        startActivity(intent);
    }

    private void abrirHistoriaSocorros(View view) {
        Intent intent = new Intent(this, HistoriaInfoActivity.class);
        intent.putExtra(HISTORIA, SOCORROS);
        startActivity(intent);
    }
}
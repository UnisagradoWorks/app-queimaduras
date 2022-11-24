package br.com.unisagrado.appqueimaduras.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.unisagrado.appqueimaduras.R;
import br.com.unisagrado.appqueimaduras.utils.AppUtils;

public class SelecaoQuizActivity extends AppCompatActivity {

    public static final String QUIZ_SELECIONADO = "SelecaoQuizActivity.QUIZ_SELECIONADO";
    public static final String AGENTES = "SelecaoQuizActivity.AGENTES";
    public static final String GRAUS = "SelecaoQuizActivity.GRAUS";
    public static final String PREVENCOES = "SelecaoQuizActivity.PREVENCOES";
    public static final String SOCORROS = "SelecaoQuizActivity.SOCORROS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao_quiz);

        ImageView imgAgentes = findViewById(R.id.imgAgentes);
        ImageView imgGraus = findViewById(R.id.imgGraus);
        ImageView imgPrevencoes = findViewById(R.id.imgPrevencoes);
        ImageView imgSocorros = findViewById(R.id.imgSocorros);
        ImageView imgHome = findViewById(R.id.imgHome);

        imgHome.setOnClickListener(AppUtils::abrirHome);
        imgAgentes.setOnClickListener(this::abrirQuizAgentes);
        imgGraus.setOnClickListener(this::abrirQuizGraus);
        imgPrevencoes.setOnClickListener(this::abrirQuizPrevencoes);
        imgSocorros.setOnClickListener(this::abrirQuizSocorros);
    }

    private void abrirQuizAgentes(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtra(QUIZ_SELECIONADO, AGENTES);
        startActivity(intent);
    }

    private void abrirQuizGraus(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtra(QUIZ_SELECIONADO, GRAUS);
        startActivity(intent);
    }

    private void abrirQuizPrevencoes(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtra(QUIZ_SELECIONADO, PREVENCOES);
        startActivity(intent);
    }

    private void abrirQuizSocorros(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtra(QUIZ_SELECIONADO, SOCORROS);
        startActivity(intent);
    }
}
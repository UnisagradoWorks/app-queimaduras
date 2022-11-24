package br.com.unisagrado.appqueimaduras.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.unisagrado.appqueimaduras.R;
import br.com.unisagrado.appqueimaduras.model.Quiz;
import br.com.unisagrado.appqueimaduras.service.QuizService;
import br.com.unisagrado.appqueimaduras.utils.AppUtils;

public class QuizActivity extends AppCompatActivity {

    private final Handler handler = new Handler();
    private List<CardView> cardList;
    private TextView quiz, pergunta, txtOpcao1, txtOpcao2, txtOpcao3, txtOpcao4;
    private final QuizService quizService = new QuizService();
    private int pagina = 1;
    private List<Quiz> quizList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        quiz = findViewById(R.id.txtQuiz);
        pergunta = findViewById(R.id.txtPergunta);
        txtOpcao1 = findViewById(R.id.txtOpcao1);
        txtOpcao2 = findViewById(R.id.txtOpcao2);
        txtOpcao3 = findViewById(R.id.txtOpcao3);
        txtOpcao4 = findViewById(R.id.txtOpcao4);

        CardView cardOpcao1 = findViewById(R.id.cardOpcao1);
        CardView cardOpcao2 = findViewById(R.id.cardOpcao2);
        CardView cardOpcao3 = findViewById(R.id.cardOpcao3);
        CardView cardOpcao4 = findViewById(R.id.cardOpcao4);

        ImageView imgHome = findViewById(R.id.imgHome);
        imgHome.setOnClickListener(AppUtils::abrirHome);

        cardList = new ArrayList<>(Arrays.asList(cardOpcao1, cardOpcao2, cardOpcao3, cardOpcao4));

        for (CardView card : cardList){
            card.setOnClickListener(this::analisaResposta);
        }

        Intent intent = getIntent();

        switch (intent.getStringExtra(SelecaoQuizActivity.QUIZ_SELECIONADO)) {
            case SelecaoQuizActivity.AGENTES:
                quizList = quizService.findQuizAgentes();
                atualizarPagina();
                break;
            case SelecaoQuizActivity.GRAUS:
                quizList = quizService.findQuizGraus();
                atualizarPagina();
                break;
            case SelecaoQuizActivity.PREVENCOES:
                quizList = quizService.findQuizPrevencoes();
                atualizarPagina();
                break;
            case SelecaoQuizActivity.SOCORROS:
                quizList = quizService.findQuizSocorros();
                atualizarPagina();
                break;
        }

    }

    private void analisaResposta(View view) {
        CardView card = (CardView) view;

        if (verificaAcerto(view)){
            for (CardView cards : cardList)
                cards.setClickable(false);
            card.setCardBackgroundColor(getResources().getColor(R.color.default_blue));
            pagina++;
            Snackbar snackbar = Snackbar.make(findViewById(R.id.constraintLayout),
                    "Resposta Certa!",
                    Snackbar.LENGTH_SHORT);
            snackbar.show();
            handler.postDelayed(this::atualizarPagina, 1000);
        } else {
            card.setCardBackgroundColor(getResources().getColor(R.color.default_red));
        }
    }

    public void atualizarPagina(){

        if (pagina > quizList.size()){
            pagina--;
            return;
        }

        quiz.setText(new String("QUIZ " + pagina));
        pergunta.setText(quizList.get(pagina-1).getPergunta());
        txtOpcao1.setText(quizList.get(pagina-1).getAlternativas().get(0).getTexto());
        txtOpcao2.setText(quizList.get(pagina-1).getAlternativas().get(1).getTexto());
        txtOpcao3.setText(quizList.get(pagina-1).getAlternativas().get(2).getTexto());
        txtOpcao4.setText(quizList.get(pagina-1).getAlternativas().get(3).getTexto());

        for (CardView card : cardList){
            card.setCardBackgroundColor(getResources().getColor(R.color.default_green));
            card.setClickable(true);
        }

    }

    public boolean verificaAcerto(View view){

        for (int i=0; i<cardList.size(); i++){
            if (cardList.get(i).equals(view))
                return quizList.get(pagina-1).getAlternativas().get(i).isCorreto();
        }

        return false;
    }
}
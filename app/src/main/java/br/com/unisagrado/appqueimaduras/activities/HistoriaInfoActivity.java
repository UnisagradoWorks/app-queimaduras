package br.com.unisagrado.appqueimaduras.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import br.com.unisagrado.appqueimaduras.R;
import br.com.unisagrado.appqueimaduras.service.HistoriaService;

public class HistoriaInfoActivity extends AppCompatActivity {

    private final HistoriaService historiaService = new HistoriaService();
    private TextView txtHistoria;
    private ImageView setaEsq;
    private ImageView setaDir;
    private int pagina = 1;
    private List<String> historia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_info);

        ImageView imgHome = findViewById(R.id.imgHome2);
        TextView txtTituloHistoria = findViewById(R.id.txtTituloHist);

        imgHome.setOnClickListener(this::abrirHome);
        txtHistoria = findViewById(R.id.txtHistoria);
        setaEsq = findViewById(R.id.seta_esq);
        setaDir = findViewById(R.id.seta_dir);

        setaDir.setOnClickListener(view -> {
            pagina++;
            atualizarPagina();
        });
        setaEsq.setOnClickListener(view -> {
            pagina--;
            atualizarPagina();
        });

        setaEsq.setVisibility(View.INVISIBLE);
        setaEsq.setClickable(false);
        setaDir.setVisibility(View.INVISIBLE);
        setaDir.setClickable(false);

        switch (getIntent().getStringExtra(HistoriasActivity.HISTORIA_SELECIONADA)) {
            case HistoriasActivity.AGENTES:
                txtTituloHistoria.setText("AGENTES CAUSADORES");
                historia = historiaService.findHistoriaAgente();
                atualizarPagina();
                break;
            case HistoriasActivity.GRAUS:
                txtTituloHistoria.setText("GRAUS DE QUEIMADURA");
                historia = historiaService.findHistoriaGraus();
                atualizarPagina();
                break;
            case HistoriasActivity.PREVENCOES:
                txtTituloHistoria.setText("PREVENCOES");
                historia = historiaService.findHistoriaPrevencao();
                atualizarPagina();
                break;
            case HistoriasActivity.SOCORROS:
                txtTituloHistoria.setText("SOCORROS");
                historia = historiaService.findHistoriaSocorro();
                atualizarPagina();
                break;
        }
    }

    private void atualizarPagina() {
        if (pagina <= 1){
            setaEsq.setVisibility(View.INVISIBLE);
            setaEsq.setClickable(false);
        } else {
            setaEsq.setVisibility(View.VISIBLE);
            setaEsq.setClickable(true);
        }

        if (historia != null){
            txtHistoria.setText(historia.get(pagina-1));

            if (pagina >= historia.size()){
                setaDir.setVisibility(View.INVISIBLE);
                setaDir.setClickable(false);
            } else {
                setaDir.setVisibility(View.VISIBLE);
                setaDir.setClickable(true);
            }
        }
    }

    public void abrirHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
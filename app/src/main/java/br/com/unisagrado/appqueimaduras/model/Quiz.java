package br.com.unisagrado.appqueimaduras.model;

import java.io.Serializable;
import java.util.List;

public class Quiz implements Serializable {

    private String pergunta;
    private List<Alternativa> alternativas;

    public Quiz(String pergunta, List<Alternativa> alternativas){
        this.pergunta = pergunta;
        this.alternativas = alternativas;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public List<Alternativa> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(List<Alternativa> alternativas) {
        this.alternativas = alternativas;
    }
}

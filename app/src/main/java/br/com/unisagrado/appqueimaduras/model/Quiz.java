package br.com.unisagrado.appqueimaduras.model;

import java.io.Serializable;
import java.util.List;

public class Quiz implements Serializable {

    private final String pergunta;
    private final List<Alternativa> alternativas;

    public Quiz(String pergunta, List<Alternativa> alternativas){
        this.pergunta = pergunta;
        this.alternativas = alternativas;
    }

    public String getPergunta() {
        return pergunta;
    }

    public List<Alternativa> getAlternativas() {
        return alternativas;
    }
}

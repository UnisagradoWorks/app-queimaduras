package br.com.unisagrado.appqueimaduras.model;

import java.io.Serializable;

public class Alternativa implements Serializable {

    private String texto;
    private boolean correto;

    public Alternativa(String texto, boolean correto) {
        this.texto = texto;
        this.correto = correto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isCorreto() {
        return correto;
    }

    public void setCorreto(boolean correto) {
        this.correto = correto;
    }
}

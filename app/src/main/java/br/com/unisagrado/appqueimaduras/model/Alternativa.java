package br.com.unisagrado.appqueimaduras.model;

import java.io.Serializable;

public class Alternativa implements Serializable {

    private final String texto;
    private final boolean correto;

    public Alternativa(String texto, boolean correto) {
        this.texto = texto;
        this.correto = correto;
    }

    public String getTexto() {
        return texto;
    }

    public boolean isCorreto() {
        return correto;
    }
}

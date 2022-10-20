package br.com.unisagrado.appqueimaduras.service;

import java.util.ArrayList;
import java.util.List;

public class HistoriaService {

    public List<String> findHistoriaAgente(){
        List<String> historia = new ArrayList<>();

        historia.add("As queimaduras são um importante problema de saúde pública, " +
                "pois além dos problemas físicos, elas ocasionam danos psicológicos e sociais. " +
                "Queimaduras são lesões decorrentes de agentes, tais como a energia térmica, química ou elétrica, " +
                "(ou ainda biológicos) capazes de produzir calor excessivo que danifica os " +
                "tecidos corporais e causa a morte celular.");

        historia.add("o agente causador do tipo físico é UM dos que vamos conhecer hoje! ele é " +
                "classificado em três etapas: temperatura, eletricidade e radiação. " +
                "Alguns exemplos de queimadura por: \n" +
                "\n\t-temperatura: vapor, objetos aquecidos, água quente, fogos de artifícios, frio. \n" +
                "\t-eletricidade: corrente elétrica, raio.\n" +
                "\t-radiação: sol, aparelhos de raios X, raios ultra-violetas, nucleares.");
        return historia;
    }
}

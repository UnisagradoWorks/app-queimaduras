package br.com.unisagrado.appqueimaduras.service;

import java.util.ArrayList;
import java.util.List;

public class HistoriaService {

    public List<String> findHistoriaAgente() {
        List<String> historia = new ArrayList<>();

        historia.add("As queimaduras são um importante problema de saúde pública, " +
                "pois além dos problemas físicos, elas ocasionam danos psicológicos e sociais. " +
                "Queimaduras são lesões decorrentes de agentes, tais como a energia térmica, química ou elétrica, " +
                "(ou ainda biológicos) capazes de produzir calor excessivo que danifica os " +
                "tecidos corporais e causa a morte celular.");

        historia.add("o agente causador do tipo físico é UM dos que vamos conhecer hoje! ele é " +
                "classificado em três etapas: temperatura, eletricidade e radiação. " +
                "Alguns exemplos de queimadura por: \n" +
                "\t-temperatura: vapor, objetos aquecidos, água quente, fogos de artifícios, frio. \n" +
                "\t-eletricidade: corrente elétrica, raio.\n" +
                "\t-radiação: sol, aparelhos de raios X, raios ultra-violetas, nucleares.");
        historia.add("Outro tipo de agente causador é o químico. É possível reconhecer esse tipo " +
                "de queimadura quando se tem contato com produtos químicos como por exemplo: " +
                "ácidos, bases, álcool, gasolina.\n" +
                "\n" +
                "É importante tomar muito cuidado ao ter contato com algum " +
                "desses produtos! Fique atento.\n");
        historia.add("O tipo de queimadura biológico é causado por seres vivos! " +
                "Alguns animais que podem te machucar caso você não esteja atento é a " +
                "água-viva, ou até mesmo uma lagarta-de-fogo, conhecida como taturana. \n" +
                "Já nos vegetais é possível ser queimado pelo o látex de certas plantas.");
        return historia;
    }

    public List<String> findHistoriaGraus() {
        List<String> historia = new ArrayList<>();

        historia.add("O que vai influenciar na gravidade do ferimento é a profundidade da " +
                "queimadura, ou seja, o número de camadas da pele ou outras estruturas " +
                "abaixo da pele, que foram atingidos. O processo de reparação " +
                "tecidual do queimado dependerá de vários fatores, entre eles a " +
                "profundidade da lesão. A queimadura também afeta o sistema " +
                "imunológico da vítima, com consequências " +
                "sobre o quadro clínico geral do paciente.");
        historia.add("O primeiro grau consiste em uma queimadura na superfície da pele.\n" +
                "Afeta somente a epiderme e não forma bolhas. \n" +
                "Quando atingido, apresenta vermelhidão, dor, endema e descama de 4 a 6 dias.");
        historia.add("Já no segundo grau, atinge a pele de uma forma um pouco mais profunda. " +
                "Atinge a epiderme e uma parte da derme, causando bolhas. Se for uma queimadura " +
                "mais superficial, a base da bolha é rósea, caso seja mais profunda, a " +
                "base da bolha é branca! \n" +
                "A restauração das lesões ocorrem de 7 a 21 dias.");
        historia.add("O terceiro e último grau, é o tipo de queimadura mais profunda. " +
                "Atinge a espessura total da pele e não é possível reepitalizar e necessita " +
                "de enxerto na pele. \n" +
                "Afeta a epiderme, a derme, estruturas profundas da pele e é indolor.");

        return historia;
    }

    public List<String> findHistoriaPrevencao() {
        List<String> prevencao = new ArrayList<>();

        prevencao.add("Infelizmente, acidentes podem acontecer em qualquer idade, " +
                "mas as crianças são sempre mais vulneráveis. As crianças são ainda " +
                "as mais afetadas, sendo as queimaduras a quarta causa de internação " +
                "por sequelas gravíssimas entre 5 e 9 anos, segundo o Ministério da Saúde.");
        prevencao.add("Quando esses acidentes acontecem, ausam danos muitas vezes irreparáveis," +
                " prejudicam seu desenvolvimento intelectual, coordenação motora e " +
                "desfiguram sua aparência. O que interfere na vida social e escolar," +
                " sem falar em toda a dor e sofrimento, só pode ser compreendido por " +
                "quem fica com as consequências.\n");
        prevencao.add("A Organização Mundial da Saúde (OMS) revelou que 320.000 crianças morrem" +
                " todos os anos pelas mesmas causas. Por isso, pequenos cuidados são importantes" +
                " para salvar vidas. Temos alguns exemplos como: \n" +
                "• Mantenha as crianças fora da cozinha enquanto cozinhamos.\n" +
                "• Fósforos e isqueiros devem ser mantidos longe das crianças.\n" +
                "• Sempre tente educar e educar as crianças sobre os perigos das queimaduras.");
        prevencao.add("Além de outras situações comuns que todos nós encontramos:\n" +
                "• Nunca acenda uma churrasqueira com álcool, principalmente líquidos.\n" +
                "• Tenha cuidado ao deixar o telefone na tomada por longos" +
                " períodos de tempo para carregar, pois isso pode causar choque" +
                " elétrico e pequenos incêndios. O protetor solar deve ser usado diariamente." +
                " Isso funciona para todos: crianças e adultos, porque não protege" +
                " apenas contra a exposição ao sol.");

        return prevencao;
    }

    public List<String> findHistoriaSocorro() {
        List<String> socorro = new ArrayList<>();

        socorro.add("DEUS");
        socorro.add("ME");
        socorro.add("AJUDE");
        socorro.add("\uD83D\uDE4F");

        return socorro;
    }
}

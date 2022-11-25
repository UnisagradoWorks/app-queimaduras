package br.com.unisagrado.appqueimaduras.service;

import java.util.ArrayList;
import java.util.List;

public class HistoriaService {

    public List<String> findHistoriaAgente() {
        List<String> historia = new ArrayList<>();

        historia.add("As queimaduras são consideradas, um importante problema de saúde pública, pois, além dos problemas físicos, capazes de levar o paciente a óbito, elas ocasionam danos de ordem psicológica e social. \n" +
                    "Queimaduras são lesões decorrentes de agentes químicos, elétricos, biológicos e de energia térmica capazes de produzir calor excessivo que danifica os tecidos corporais e acarreta a morte celular.\n");
        historia.add("O agente causador do tipo físico é um dos que vamos conhecer hoje. Ele é classificado em três etapas: temperatura, eletricidade e radiação.\n" +
                "Alguns exemplos de queimaduras:\n" +
                "\n" +
                "• Temperatura: vapor, objetos aquecidos, água quente, fogos de artifícios, frio;\n" +
                "\n" +
                "• Eletricidade: corrente elétrica, raio;\n" +
                "\n" +
                "• Radiação: sol, aparelhos de raios X, raios ultra-violetas, nucleares.\n" +
                "\n" +
                "Outro tipo de agente causador é o químico. É possível reconhecer esse tipo de queimadura quando se tem contato com produtos químicos como ácidos, bases, álcool, gasolina.\n");
        historia.add("É importante tomar muito cuidado ao ter contato com algum desses produtos, fique atento.\n" +
                "\n" +
                "O tipo de queimadura biológica é causado por seres vivos. Alguns animais que podem te machucar caso você não esteja atento são a água-viva e a lagarta-de-fogo, conhecida como taturana. \n" +
                "\n" +
                "Já nos vegetais é possível ser queimado pelo o látex de certas plantas.\n");
        return historia;
    }

    public List<String> findHistoriaGraus() {
        List<String> graus = new ArrayList<>();

        graus.add("O que vai influenciar na gravidade do ferimento é a profundidade da queimadura, ou seja, o número de camadas da pele ou outras estruturas abaixo da pele, que foram atingidos. O processo de reparação tecidual do queimado dependerá de vários fatores, entre eles a profundidade da lesão. " +
                "A queimadura também afeta o sistema imunológico com consequências sobre o quadro clínico geral do paciente.");
        graus.add("O primeiro grau consiste em uma queimadura na superfície da pele." +
                "Afeta somente a epiderme e não forma bolhas." +
                "Quando atingido, apresenta vermelhidão, dor, edema e descamação de 4 a 6 dias.");
        graus.add("Já no segundo grau, a queimadura atinge a pele de uma forma um pouco mais profunda. Atinge a epiderme e uma parte da derme, causando bolhas. Se for uma queimadura mais superficial, a base da bolha é rósea, caso seja mais profunda, a base da bolha é branca.\n" +
                "A restauração das lesões ocorrem de 7 a 21 dias.");
        graus.add("O terceiro e último grau, é o tipo de queimadura mais profunda. Atinge a espessura total da pele e não é possível reepitelizar e necessita de enxerto na pele.\n" +
                "Afeta a epiderme, a derme, estruturas profundas da pele e é indolor.");

        return graus;
    }

    public List<String> findHistoriaPrevencao() {
        List<String> prevencao = new ArrayList<>();

        prevencao.add("Infelizmente, acidentes podem acontecer em qualquer idade, mas crianças são ainda as mais afetadas, sendo as queimaduras, a quarta causa de internação por sequelas gravíssimas entre 5 e 9 anos (BRASIL, 2012).");
        prevencao.add("Quando esses acidentes acontecem, causam danos, muitas vezes irreparáveis, prejudicam seu desenvolvimento intelectual, coordenação motora e causam danos a sua aparência. O que interfere na vida social e escolar gerando dor e sofrimento.");
        prevencao.add("A Organização Mundial da Saúde (OMS) revelou que 320.000 crianças morrem todos os anos pelas mesmas causas. Por isso, alguns cuidados importantes para salvar vidas são:\n" +
                "\n" +
                "• Manter as crianças fora da cozinha enquanto cozinha;\n" +
                "• Fósforos e isqueiro devem ser mantidos longe das crianças;\n" +
                "• Sempre oriente as crianças sobre os perigos das queimaduras.\n");
        prevencao.add("Outras situações comuns são:\n" +
                "\n" +
                "• Nunca acenda uma churrasqueira com álcool ou líquidos inflamáveis;\n" +
                "\n" +
                "• Tenha cuidado ao deixar o telefone na tomada em superfícies que esquentam por longos períodos para carregar, pois isso pode causar choque elétrico e pequenos incêndios;\n" +
                "\n" +
                "Além disso, o protetor solar deve ser usado por todos diariamente.\n");

        return prevencao;
    }

    public List<String> findHistoriaSocorro() {
        List<String> socorro = new ArrayList<>();

        socorro.add("Embora existam meios de prevenção à queimaduras, elas infelizmente ocorrem com certa frequência, sendo cerca de 224 mil casos de acidentes por queimadura no Brasil por ano, sendo 40% em crianças e 80% em locais domésticos.");
        socorro.add("No caso de crianças, elas devem alertar um adulto responsável e, portanto, precisam ser instruídas com antecedência. Feito isso, a melhor escolha será tomada para o tratamento da queimadura.");
        socorro.add("Para tratar queimaduras de primeiro grau:\n" +
                "• Interrompa o processo de queimadura;\n" +
                "• Remova roupas, joias, anéis, piercings e próteses;\n" +
                "• Lave com água corrente com sabonete neutro ou de glicerina \n" +
                "• Aplique filtro solar FPS 30 ou maior e um hidratante de pH neutro.\n" +
                "\n" +
                "Curativos não são necessários.");
        socorro.add("Queimaduras de segundo grau:\n" +
                "•  Interrompa o processo de queimadura;\n" +
                "• Remova roupas, joias, anéis, piercings e próteses;\n" +
                "• Lave com água corrente;\n" +
                "• Não exponha a queimadura a sujeira ou umidade\n" +
                "• Aplique filtro solar  FPS 30 ou maior e um hidratante de pH neutro após a cicatrização;\n" +
                "• Procure um médico para a drenagem das bolhas.\n" +
                "\n" +
                "Curativos são necessários.");
        socorro.add("Queimaduras de terceiro grau:\n" +
                "• Devem ser tratadas em hospitais com o auxílio de profissionais da saúde.\n");
        socorro.add("Além disso, após o tratamento, podemos acelerar o processo de cicatrização das feridas por outros meios. Nesse sentido, podemos comer alimentos que auxiliam na cicatrização das feridas como verduras de coloração escura, leguminosas, frutas, vegetais, castanhas, nozes e carne magra. ");
        socorro.add("Ademais, outros cuidados, como refazer os curativos umedecidos e sempre manter a ferida longe de poeira e outros agentes físicos ou químicos que possam agravar a situação não podem ser dispensados. \n" +
                "• Evite temperaturas extremas;\n" +
                "• Não toque ou coce a ferida;\n" +
                "• Não estourar as bolhas;\n" +
                "• Procure e siga as orientações médicas.\n");
        return socorro;
    }
}

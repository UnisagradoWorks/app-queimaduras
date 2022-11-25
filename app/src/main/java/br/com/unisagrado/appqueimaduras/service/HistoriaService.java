package br.com.unisagrado.appqueimaduras.service;

import java.util.ArrayList;
import java.util.List;

public class HistoriaService {

    public List<String> findHistoriaAgente() {
        List<String> historia = new ArrayList<>();

        historia.add("\tAs queimaduras são um importante problema de saúde pública, " +
                "pois além dos problemas físicos, elas ocasionam danos psicológicos e sociais. " +
                "Queimaduras são lesões decorrentes de agentes, tais como a energia térmica, química ou elétrica, " +
                "(ou ainda biológicos) capazes de produzir calor excessivo que danifica os " +
                "tecidos corporais e causa a morte celular.");

        historia.add("\tO agente causador do tipo físico é UM dos que vamos conhecer hoje! Ele é " +
                "classificado em três etapas: temperatura, eletricidade e radiação. " +
                "Alguns exemplos de queimadura: \n" +
                "\t• Temperatura: vapor, objetos aquecidos, água quente, fogos de artifícios, frio. \n" +
                "\t• Eletricidade: corrente elétrica, raio.\n" +
                "\t• Radiação: sol, aparelhos de raios X, raios ultra-violetas, nucleares.");
        historia.add("\tOutro tipo de agente causador é o químico. É possível reconhecer esse tipo " +
                "de queimadura quando se tem contato com produtos químicos como por exemplo: " +
                " ácidos, bases, álcool, gasolina.\n\t" +
                "É importante tomar muito cuidado ao ter contato com algum " +
                "desses produtos! Fique atento.\n");
        historia.add("\tO tipo de queimadura biológico é causado por seres vivos! " +
                "Alguns animais que podem te machucar caso você não esteja atento é a " +
                "água-viva, ou até mesmo uma lagarta-de-fogo, conhecida como taturana. \n\t" +
                "Já nos vegetais é possível ser queimado pelo látex de certas plantas.");
        return historia;
    }

    public List<String> findHistoriaGraus() {
        List<String> historia = new ArrayList<>();

        historia.add("\tO que vai influenciar na gravidade do ferimento é a profundidade da " +
                "queimadura, ou seja, o número de camadas da pele ou outras estruturas " +
                "abaixo da pele, que foram atingidos. \n\tO processo de reparação " +
                "tecidual do queimado dependerá de vários fatores, entre eles a " +
                "profundidade da lesão. \n\tA queimadura também afeta o sistema " +
                "imunológico da vítima, com consequências " +
                "sobre o quadro clínico geral do paciente.");
        historia.add("\tO primeiro grau consiste em uma queimadura na superfície da pele.\n\t" +
                "Afeta somente a epiderme e não forma bolhas. \n\t" +
                "Quando atingido, apresenta vermelhidão, dor, endema e descama de 4 a 6 dias.");
        historia.add("\tJá no segundo grau, atinge a pele de uma forma um pouco mais profunda.\n" +
                "Atinge a epiderme e uma parte da derme, causando bolhas. \nSe for uma queimadura " +
                "mais superficial, a base da bolha é rósea, caso seja mais profunda, a " +
                "base da bolha é branca! \n" +
                "A restauração das lesões ocorrem de 7 a 21 dias.");
        historia.add("\tO terceiro e último grau, é o tipo de queimadura mais profunda.\n" +
                "Atinge a espessura total da pele, não é possível cicatrizar e necessita " +
                "de enxerto na pele. \n" +
                "Afeta a epiderme, a derme, estruturas profundas da pele e é " +
                "indolor na área da queimadura pois danifica os nervos.");

        return historia;
    }

    public List<String> findHistoriaPrevencao() {
        List<String> prevencao = new ArrayList<>();

        prevencao.add("\tInfelizmente, acidentes podem acontecer em qualquer idade, " +
                "mas as crianças são sempre mais vulneráveis. \nAs crianças são ainda " +
                "as mais afetadas, sendo as queimaduras a quarta causa de internação " +
                "por sequelas gravíssimas entre 5 e 9 anos, segundo o Ministério da Saúde.");
        prevencao.add("\tQuando esses acidentes acontecem, causam danos muitas vezes irreparáveis," +
                " prejudicam seu desenvolvimento intelectual, coordenação motora e " +
                "desfiguram sua aparência. \nO que interfere na vida social e escolar," +
                " sem falar em toda a dor e sofrimento, só pode ser compreendido por " +
                "quem fica com as consequências.\n");
        prevencao.add("\tA Organização Mundial da Saúde (OMS) revelou que 320.000 crianças morrem" +
                " todos os anos pelas mesmas causas. Por isso, pequenos cuidados são importantes" +
                " para salvar vidas. Temos alguns exemplos como: \n\t" +
                "-Mantenha as crianças fora da cozinha enquanto cozinhamos.\n\t" +
                "-Fósforos e isqueiros devem ser mantidos longe das crianças.\n\t" +
                "-Sempre tente educar e educar as crianças sobre os perigos das queimaduras.");
        prevencao.add("\tAlém de outras situações comuns que todos nós encontramos:\n\t" +
                "Nunca acenda uma churrasqueira com álcool, principalmente líquidos.\n\t" +
                "Tenha cuidado ao deixar o telefone na tomada por longos" +
                " períodos de tempo para carregar, pois isso pode causar choque" +
                " elétrico e pequenos incêndios. \nO protetor solar deve ser usado diariamente.\n\t" +
                " Isso funciona para todos: crianças e adultos, porque não protege" +
                " apenas contra a exposição ao sol.");

        return prevencao;
    }

    public List<String> findHistoriaSocorro() {
        List<String> socorro = new ArrayList<>();

        socorro.add("\tEmbora existam meios de prevenção á queimaduras, elas infelizmente ocorrem " +
                "com certa frequência, sendo cerca de 224 mil casos de acidentes por queimadura " +
                "no Brasil por ano, sendo 40% em crianças e 80% em locais domésticos.");
        socorro.add("\tNo caso de crianças, elas devem alertar um adulto responsável e, portanto, " +
                "precisam ser instruídas com antecedência. \n\tFeito isso, a melhor escolha será " +
                "tomada para o tratamento da queimadura. \n\tAs queimaduras de primeiro grau devem " +
                "ser lavadas com água corrente, sabonete neutro ou de glicerina e, em seguida, " +
                "aplicar filtro solar FPS 30 ou maior e um hidratante de pH neutro; " +
                "curativos não são necessários.");
        socorro.add("\tQueimaduras de segundo grau precisam ser limpas, ter aplicada sobre toda " +
                "sua área creme sulfadiazina de prata e não ser exposta a sujeira ou umidade, " +
                "aplicar protetor solar e hidratante neutro; curativos são necessários. \n\t" +
                "Por fim, as queimaduras de terceiro grau devem ser tratadas em hospitais com o " +
                "auxílio de profissionais da saúde.");
        socorro.add("\tAlém disso, após o tratamento, podemos acelerar o processo de cicatrização " +
                "das feridas por outros meios, sendo um deles a dieta. \n\tPara começar, podemos " +
                "comer alimentos que auxiliam na cicatrização das feridas como verduras de " +
                "coloração escura, leguminosas, frutas, vegetais, castanhas, nozes e carne magra. \n\t" +
                "Outros cuidados, como refazer os curativos umedecidos e sempre manter a ferida " +
                "longe de poeira e outros agentes físicos ou químicos que possam agravar a " +
                "situação não podem ser dispensados.\n\t Evitar temperaturas extremas, " +
                "tocar ou coçar a ferida.\n\t Não é recomendado estourar as bolhas, mas sim utilizar " +
                "as pomadas corretas com orientação médica.");
        return socorro;
    }
}

package br.com.unisagrado.appqueimaduras.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.unisagrado.appqueimaduras.model.Alternativa;
import br.com.unisagrado.appqueimaduras.model.Quiz;

public class QuizService {

    public List<Quiz> findQuizAgentes() {
        List<Quiz> quizzes = new ArrayList<>();

        quizzes.add(new Quiz("Quais são os tipos de agentes causadores de queimadura?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("Físicos e biológicos", false),
                        new Alternativa("Físicos, quimicos e natural", false),
                        new Alternativa("Físicos, quimicos e biológicos", true),
                        new Alternativa("Físico e quimicos", false)
                ))));
        quizzes.add(new Quiz("O agente físico é dividido em 3 etapas. Quais são elas?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("Físico, químico e biológico.", false),
                        new Alternativa("Temperatura, eletrecidade e radiação.", true),
                        new Alternativa("Seres-vivos, produtos químicos e fumaça", false),
                        new Alternativa("Todas as alternativas estão corretas.", false)
                ))));
        quizzes.add(new Quiz("Escolha a alternativa que mostra um exemplo de produto químico capaz de causar queimadura.",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("Água", false),
                        new Alternativa("Raio", false),
                        new Alternativa("Luz solar", false),
                        new Alternativa("Gasolina", true)
                ))));
        quizzes.add(new Quiz("O tipo de queimadura biológica é causada por seres-vivos. Quais são os que você aprendeu?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("Animais e vegetais", true),
                        new Alternativa("Raio", false),
                        new Alternativa("Luz solar", false),
                        new Alternativa("Gelo", false)
                ))));

        return quizzes;
    }

    public List<Quiz> findQuizGraus() {
        List<Quiz> quizzes = new ArrayList<>();

        quizzes.add(new Quiz("A queimadura é um problema sério para a nossa pele e pode chegar em vários graus. Quais são eles?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("É possível atingir inúmeros graus", false),
                        new Alternativa("1º e 2º grau", false),
                        new Alternativa("1º, 2º e 3º grau", true),
                        new Alternativa("Nenhuma das alternativas", false)
                ))));
        quizzes.add(new Quiz("O primeiro grau de queimadura descama em quanto tempo?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("De 2 a 4 dias", false),
                        new Alternativa("De 4 a 6 dias", true),
                        new Alternativa("De 6 a 8 dias", false),
                        new Alternativa("De 8 a 10 dias", false)
                ))));
        quizzes.add(new Quiz("No segundo grau de queimadura as lesões ocorrem de 7 a 21 dias. Quais são as partes que esse grau atinge?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("Epiderme, derme e estruturas profundas", false),
                        new Alternativa("Somente a epiderme", false),
                        new Alternativa("Somente a derme", false),
                        new Alternativa("Epiderme e derme", true)
                ))));
        quizzes.add(new Quiz("O 3º graus é o mais perigoso. Escolha uma alternativa que justifique essa afirmação.",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("É o mais perigoso porque não é possível reepitelizar e necessita de enxerto na pele", true),
                        new Alternativa("É o mais perigoso porque demora de 7 a 21 dias para cicatrizar", false),
                        new Alternativa("É o mais perigoso porque atinge somente a derme", false),
                        new Alternativa("É o mais perigoso porque forma bolhas brancas", false)
                ))));

        return quizzes;
    }

    public List<Quiz> findQuizPrevencoes() {
        List<Quiz> quizzes = new ArrayList<>();

        quizzes.add(new Quiz("Infelizmente os acidentes podem acontecer com qualquer um, mas aprendemos que eles ocorrem mais com:",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("Adultos", false),
                        new Alternativa("Idosos", false),
                        new Alternativa("Crianças", true),
                        new Alternativa("Adolescentes", false)
                ))));
        quizzes.add(new Quiz("Pequenos cuidados são importantes para salvar vidas de crianças. Quais das ações a seguir está incorreta?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("Manter crianças longe de lugares com fogo", false),
                        new Alternativa("Produtos químicos devem ser armazenados adequadamente", false),
                        new Alternativa("Entregar fósforos para crianças", true),
                        new Alternativa("Testar a temperatura da água antes de entrar no banho", false)
                ))));
        quizzes.add(new Quiz("Segundo a OMS, as crianças entre 5 e 9 anos sofrem de sequelas gravíssimas de queimaduras. Quais das alternativas a seguir não representa uma dessas sequelas?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("Prejudicam o desenvolvimento intelectual", false),
                        new Alternativa("Prejudicam a coordenação motora", false),
                        new Alternativa("Olhos amarelados", true),
                        new Alternativa("Desfiguração da aparência", false)
                ))));
        quizzes.add(new Quiz("Festas juninas são muito populares em nosso país, entretanto, é necessário tomar muito cuidado em ocasiões como essa. Qual alternativa a seguir mostra cuidados necessários?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("Adquirir fogos de artifício em lojas não autorizadas", false),
                        new Alternativa("Ficar ou brincar com crianças próximas à fogueira para esquentar do frio", false),
                        new Alternativa("Ter muito cuidado ao soltar balões e fazer fogueira", true),
                        new Alternativa("Tomar cuidado ao estourar a pipoca na cozinha", false)
                ))));

        return quizzes;
    }

    public List<Quiz> findQuizSocorros() {
        List<Quiz> quizzes = new ArrayList<>();

        quizzes.add(new Quiz("Em caso de uma queimadura leve, sem presença de bolhas, qual é o procedimento correto a se realizar?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("Colocar um gelo sobre a queimadura", false),
                        new Alternativa("Passar pomada sobre toda a ferida", false),
                        new Alternativa("Lavar a ferida com água corrente com temperatura ambiente", true),
                        new Alternativa("Enfaixar a ferida", false)
                ))));
        quizzes.add(new Quiz("Quais produtos podem ser aplicados sobre as feridas, no caso de uma queimadura de segundo grau?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("Óleo de cozinha e vinagre", false),
                        new Alternativa("Manteiga ou óleo vegetal", false),
                        new Alternativa("Pasta de dente ou sabonete neutro", false),
                        new Alternativa("Creme sulfadiazina de prata e pomada hidratante neutra", true)
                ))));
        quizzes.add(new Quiz("Quais os tipos de queimaduras que, respectivamente, precisam de atendimento médico e de curativos umedecidos?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("Queimadura de Terceiro Grau e de Segundo Grau", true),
                        new Alternativa("Queimadura de Primeiro Grau e Segundo Grau", false),
                        new Alternativa("Queimadura de Terceiro Grau e Primeiro Grau", false),
                        new Alternativa("Queimadura de Segundo Grau e Primeiro Grau", false)
                ))));
        quizzes.add(new Quiz("Quais alimentos auxiliam na cicatrização de queimaduras?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("Bolachas recheadas e alimentos com bastante óleo", false),
                        new Alternativa("Uvas, banana nanica e batata frita", false),
                        new Alternativa("Feijão, carnes brancas e frutas ricas em vitaminas", true),
                        new Alternativa("Grão-de-bico, azeitonas, mamão papaia e pastel de queijo", false)
                ))));

        return quizzes;
    }
}

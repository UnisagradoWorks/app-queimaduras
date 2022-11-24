package br.com.unisagrado.appqueimaduras.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.unisagrado.appqueimaduras.model.Alternativa;
import br.com.unisagrado.appqueimaduras.model.Quiz;

public class QuizService {

    public List<Quiz> findQuizAgentes(){
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
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false)
                ))));
        quizzes.add(new Quiz("O primeiro grau de queimadura descama em quanto tempo?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false)
                ))));
        quizzes.add(new Quiz("No segundo grau de queimadura as lesões ocorrem de 7 a 21 dias. Quais são as partes que esse grau atinge?",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false)
                ))));
        quizzes.add(new Quiz("O 3º graus é o mais perigoso. Escolha uma alternativa que justifique essa afirmação.",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("É o mais perigoso porque não é possível reepitelizar e necessita de enxerto na pele.", true),
                        new Alternativa("É o mais perigoso porque demora de 7 a 21 dias para cicatrizar.", false),
                        new Alternativa("É o mais perigoso porque atinge somente a derme.", false),
                        new Alternativa("É o mais perigoso porque forma bolhas brancas.", false)
                ))));

        return quizzes;
    }

    public List<Quiz> findQuizPrevencoes() {
        List<Quiz> quizzes = new ArrayList<>();

        quizzes.add(new Quiz("",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false)
                ))));
        quizzes.add(new Quiz("",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false)
                ))));
        quizzes.add(new Quiz("",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false)
                ))));
        quizzes.add(new Quiz("",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false)
                ))));

        return quizzes;
    }

    public List<Quiz> findQuizSocorros() {
        List<Quiz> quizzes = new ArrayList<>();

        quizzes.add(new Quiz("",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false)
                ))));
        quizzes.add(new Quiz("",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false)
                ))));
        quizzes.add(new Quiz("",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false)
                ))));
        quizzes.add(new Quiz("",
                new ArrayList<>(Arrays.asList(
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false),
                        new Alternativa("", false)
                ))));

        return quizzes;
    }
}

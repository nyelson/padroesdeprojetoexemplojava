package br.padroes.gof.estrutural.bridge;

import java.util.ArrayList;
import java.util.List;

class OracleQuestions implements QuestionBridge {
	  
    private List<String> questions = new ArrayList<String>();
    private int current = 0;

    public OracleQuestions() {
        //load from a database and fill in the container
        questions.add("What is Sequence? ");
        questions.add("What is an tabel space? ");
    }

    public void nextQuestion() {
        if( current <= questions.size() - 1 )
            current++;
    }

    public void priorQuestion() {
        if( current > 0 )
            current--;
    }

    public void newQuestion(String quest) {
        questions.add(quest);
    }

    public void deleteQuestion(String quest) {
        questions.remove(quest);
    }

    public void displayQuestion() {
        System.out.println( questions.get(current) );
    }

    public void displayAllQuestions() {
        for (String quest : questions) {
            System.out.println(quest);
        }
    }
}
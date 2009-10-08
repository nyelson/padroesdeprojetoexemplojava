package br.padroes.gof.estrutural.bridge;

import java.util.ArrayList;
import java.util.List;

class JavaQuestions implements QuestionBridge {
	  
    private List<String> questions = new ArrayList<String>();
    private int current = 0;

    public JavaQuestions() {
        //load from a database and fill in the container
        questions.add("What is Java? ");
        questions.add("What is an interface? ");
        questions.add("What is cross-platform? ");
        questions.add("What is UFT-8? ");
        questions.add("What is abstract? ");
        questions.add("What is Thread? ");
        questions.add("What is multi-threading? ");
 
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
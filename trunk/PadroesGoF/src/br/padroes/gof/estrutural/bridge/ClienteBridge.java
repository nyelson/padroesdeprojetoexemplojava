package br.padroes.gof.estrutural.bridge;

class ClienteBridge {
    public static void main(String[] args) {
 
    	QuestionBridge question = QuestionFactory.getInstance();
        QuestionFormatAbstraction questions = new QuestionFormatAbstraction("Java Language");

        questions.questDB = question;//can be hooked up with other question class
        //questions.questDB = new CsharpQuestions();
        //questions.questDB = new CplusplusQuestions();

        questions.display();
        questions.next();
    
        questions.newOne("What is object? ");
        questions.newOne("What is reference type?");

        questions.displayAll();
  }
}


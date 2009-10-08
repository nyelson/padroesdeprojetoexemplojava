package br.padroes.gof.estrutural.bridge;

interface QuestionBridge {
	  
    public void nextQuestion();
    public void priorQuestion();
    public void newQuestion(String q);
    public void deleteQuestion(String q);
    public void displayQuestion();
    public void displayAllQuestions();
}
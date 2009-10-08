package br.padroes.gof.estrutural.bridge;


class QuestionManagerAbstraction {

	protected QuestionBridge questDB; //instantiate it later 
	public String catalog;

	public QuestionManagerAbstraction(String catalog) {
		this.catalog = catalog;
	}

	public void next() {
		questDB.nextQuestion();
	}

	public void prior() {
		questDB.priorQuestion();
	}

	public void newOne(String quest) {
		questDB.newQuestion(quest);
	}

	public void delete(String quest) {
		questDB.deleteQuestion(quest);
	}

	public void display() {
		questDB.displayQuestion();
	}

	public void displayAll() {
		System.out.println("Question Catalog: " + catalog);
		questDB.displayAllQuestions();
	}
}
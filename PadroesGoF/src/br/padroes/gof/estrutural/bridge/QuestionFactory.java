package br.padroes.gof.estrutural.bridge;

public class QuestionFactory {
	
	public static QuestionBridge getInstance() {
		return new JavaQuestions();
	}

}

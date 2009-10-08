package br.padroes.gof.estrutural.bridge;

class QuestionFormatAbstraction extends QuestionManagerAbstraction {
	  
    public QuestionFormatAbstraction(String catalog){
        super(catalog);
    }

    public void displayAll() {
    
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~");
        super.displayAll();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
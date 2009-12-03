package br.padroes.gof.comportamental.strategy;

public class ClienteStrategy {
	
    public static void main(String[] args) {
        Context context;
 
        // Three contexts following different strategies
        context = new Context(new ConcreteStrategyAdd());
        int resultA = context.executeStrategy(3,4);
        showResultado(resultA);
 
        context = new Context(new ConcreteStrategySubtract());
        int resultB = context.executeStrategy(3,4);
        showResultado(resultB);
 
        context = new Context(new ConcreteStrategyMultiply());
        int resultC = context.executeStrategy(3,4);
        showResultado(resultC);
    }
    
    public static void showResultado(int resultado) {
    	System.out.println("Resultado: " + resultado);
    }
    
}
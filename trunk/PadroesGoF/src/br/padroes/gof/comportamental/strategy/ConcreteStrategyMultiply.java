package br.padroes.gof.comportamental.strategy;

public class ConcreteStrategyMultiply implements Strategy {
 
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyC's execute()");
        return a  * b;   // Do a multiplication with a and b
    }
 
}
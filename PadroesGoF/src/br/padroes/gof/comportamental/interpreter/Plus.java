package br.padroes.gof.comportamental.interpreter;

import java.util.HashMap;

public class Plus implements Expression {
    Expression leftOperand;
    Expression rightOperand;
    public Plus(Expression left, Expression right) { 
        leftOperand = left; 
        rightOperand = right;
    }
 
    public int interpret(HashMap<String,Integer> variables)  { 
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}

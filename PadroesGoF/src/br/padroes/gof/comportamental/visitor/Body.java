package br.padroes.gof.comportamental.visitor;

public class Body implements CarElement {
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}


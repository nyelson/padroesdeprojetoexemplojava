package br.padroes.gof.comportamental.visitor;

public interface CarElement {
    void accept(CarElementVisitor visitor); // CarElements have to provide accept().
}
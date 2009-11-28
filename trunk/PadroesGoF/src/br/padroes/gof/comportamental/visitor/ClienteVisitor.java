package br.padroes.gof.comportamental.visitor;

public class ClienteVisitor {
    static public void main(String[] args){
        Car car = new Car();
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }

}

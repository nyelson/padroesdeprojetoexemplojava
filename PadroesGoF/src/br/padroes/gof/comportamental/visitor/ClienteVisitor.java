package br.padroes.gof.comportamental.visitor;

/**
 * @uml.dependency   supplier="br.padroes.gof.comportamental.visitor.CarElementPrintVisitor"
 */
public class ClienteVisitor {
    static public void main(String[] args){
    	//ao criar um instância de Car, é construído os seus elementos (Engine, Wheel e Body)
        Car car = new Car();
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }

}

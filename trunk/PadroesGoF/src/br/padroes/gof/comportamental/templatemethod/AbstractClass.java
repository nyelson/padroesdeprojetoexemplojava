package br.padroes.gof.comportamental.templatemethod;

public abstract class AbstractClass {
	 
	public final void templateMethod() {
		System.out.println("AbstractClass.templateMethod() called");
		primitiveOperation1();
		primitiveOperation2();
 
	}
 
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
}
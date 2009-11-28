package br.padroes.gof.comportamental.templatemethod;

public class ClienteTemplateMethod {
	public static void main(String[] args) {
		System.out.println("Test TemplateMethod");
		System.out.println("-------------------------");
 
		AbstractClass class1 = new Concrete1();
		AbstractClass class2 = new Concrete2();
 
		class1.templateMethod();
		class2.templateMethod();
	}

}

package br.padroes.gof.comportamental.chainofresponsibility;

public class ClienteChainOfResposibility {
	
	public static void main(String[] texto) {
		/*
		 * Valida nome, faz a verificação se o nome é diferente de null e se não ultrapassa 10 caracteres
		 */
		ChainValidator validaNome = new NotNullValidator();
		validaNome.setSuccessor(new MaxLeghtValidator(10));
		
		System.out.println(validaNome.validate("Maria Silva Costa")); //FALSE - ultrapassa 10 caracteres
		System.out.println(validaNome.validate(null)); //FALSE - valor null
		System.out.println(validaNome.validate("Daniel")); //TRUE
	}

}

package br.padroes.gof.comportamental.chainofresponsibility;

public class MaxLeghtValidator extends ChainValidator {
	
	private int maximo = 0;
	
	public MaxLeghtValidator(int minimo) {
		this.maximo = minimo;
	}
	
	public boolean isValid(String valor) {
		return (valor != null && valor.length() <= maximo);
	}

}

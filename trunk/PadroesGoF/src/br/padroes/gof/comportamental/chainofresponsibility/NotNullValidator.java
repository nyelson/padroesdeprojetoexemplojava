package br.padroes.gof.comportamental.chainofresponsibility;

public class NotNullValidator extends ChainValidator {

	public boolean isValid(String valor) {
		return valor != null;
	}
	
}

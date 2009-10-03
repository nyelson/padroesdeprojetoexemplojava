package br.padroes.gof.criacao.builder;

public class Token {
	
	private char caractere;
	private Fonte fonte;
	private Tipo tipo;

	public enum Tipo {
		CARACTERE, PARAGRAFO, FONTE;
	}
	
	public Token(char c, Fonte fonte, Tipo tipo) {
		this.caractere = c;
		this.fonte = fonte;
		this.tipo = tipo;
	}

	public char getCaractere() {
		return caractere;
	}

	public Fonte getFonte() {
		return fonte;
	}

	public void setCaractere(char caractere) {
		this.caractere = caractere;
	}

	public void setFonte(Fonte fonte) {
		this.fonte = fonte;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public Tipo getTipo() {
		return this.tipo;
	}

}

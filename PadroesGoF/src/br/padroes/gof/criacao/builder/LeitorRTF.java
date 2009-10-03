package br.padroes.gof.criacao.builder;

import java.util.ArrayList;
import java.util.List;

class LeitorRTF {
	 
 	private ConversorTexto conversor;
 
 	LeitorRTF(ConversorTexto c) {
 		this.conversor = c;
 	}
 
 	public void lerRTF() {
 
 		List<Token> tokens = obterTokensDoTexto();
 
 		for (Token t : tokens) {
 			if (t.getTipo() == Token.Tipo.CARACTERE) {
 				conversor.converterCaractere(t.getCaractere());
 			}
 			if (t.getTipo() == Token.Tipo.PARAGRAFO) {
 				conversor.converterParagrafo();
 			}
 			if (t.getTipo() == Token.Tipo.FONTE) {
 				conversor.converterFonte(t.getFonte());
 			}
 		}
 	}

	private List<Token> obterTokensDoTexto() {
		List<Token> tokens = new ArrayList<Token>();
		tokens.add(new Token('T', Fonte.ARIAL, Token.Tipo.CARACTERE));
		tokens.add(new Token('E', Fonte.ARIAL, Token.Tipo.CARACTERE));
		tokens.add(new Token('S', Fonte.ARIAL, Token.Tipo.CARACTERE));
		tokens.add(new Token('T', Fonte.ARIAL, Token.Tipo.CARACTERE));
		tokens.add(new Token('E', Fonte.ARIAL, Token.Tipo.CARACTERE));
		return tokens;
	}
 }
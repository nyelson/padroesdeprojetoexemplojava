package br.padroes.gof.criacao.builder;

public class Cliente {
	 
 	public static void main(String[] args) {
 
 		ConversorTexto conversor;
 		if (args.length > 0 && args[0].equals("pdf")) {
 			conversor = new ConversorPDF();
 		} else if (args.length > 0 && args[0].equals("tex")) {
 			conversor = new ConversorTeX();
 		} else {
 			conversor = new ConversorASCII();
 		}
 		LeitorRTF leitor = new LeitorRTF(conversor);
 
 		leitor.lerRTF();
 	}
 }
package br.padroes.gof.criacao.sigleton;

public class ClienteSigleton {
	public static void main(String[] args) {
		SingletonLog.getInstance().doLog("Inicio da aplicação.");
	}
}

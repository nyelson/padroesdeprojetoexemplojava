package br.padroes.gof.criacao.sigleton;

public class ClienteSigleton {
	public static void main(String[] args) throws InterruptedException {
		SingletonLog.getInstance().doLog("Inicio da aplicação.");
		Thread.sleep(1000);
		SingletonLog.getInstance().doLog("Fim.");
	}
}

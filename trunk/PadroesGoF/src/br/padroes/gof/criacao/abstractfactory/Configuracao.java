package br.padroes.gof.criacao.abstractfactory;

public class Configuracao {

	public static final Configuracao MotifWidget = new Configuracao();

	public static Object obterInterfaceGraficaAtual() {
		return MotifWidget;
	}

}

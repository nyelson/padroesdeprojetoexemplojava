package br.padroes.gof.criacao.factorymethod;

public class CarroFactory {
	public static Carro getCarro(String tipoCarro) {
		if (tipoCarro == null) return null;
		else if (tipoCarro.equals("gol")) return new Gol();
		else if (tipoCarro.equals("omega")) return new Omega();
		else if (tipoCarro.equals("vectra")) return new Vectra();
		else throw new IllegalArgumentException("Tipo e carro inválido.");
	}
}

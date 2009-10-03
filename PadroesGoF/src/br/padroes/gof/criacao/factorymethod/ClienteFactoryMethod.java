package br.padroes.gof.criacao.factorymethod;

public class ClienteFactoryMethod {
	public static void main(String[] args) {
		Carro carro = CarroFactory.getCarro(args.length > 0 ? args[0] : "gol");
		System.out.println("Preço do carro: " + carro.getPreco());
	}
}

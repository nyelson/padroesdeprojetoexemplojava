package br.padroes.gof.estrutural.facade;

public class ClienteFacade {
	public static void main(String[] args) {
		Computer facade = new Computer(new CPU(), new Memory(), new HardDrive());
		facade.startComputer();
	}
}

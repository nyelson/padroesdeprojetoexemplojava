package br.padroes.gof.estrutural.facade;

/**
 * Classe Façade
 */
class Computer {
	private static final int SECTOR_SIZE = 0;
	private static final long BOOT_ADDRESS = 0;
	private static final long BOOT_SECTOR = 0;
	private CPU cpu=null;
	private Memory memory=null;
	private HardDrive hardDrive=null;
 
	public Computer(CPU c, Memory m, HardDrive hd) {
		this.cpu=c;
		this.memory=m;
		this.hardDrive=hd;
	}
 
	public void startComputer() {
		cpu.freeze();
		memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
		cpu.jump(BOOT_ADDRESS);
		cpu.execute();
	}
}

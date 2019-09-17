package fachada;

import componentes.*;

public class Computer {
	private long BOOT_ADDRESS = 1000;
	private long BOOT_SECTOR = 1500;
	private int SECTOR_SIZE = 300;
	private CPU cpu;
	private Memory memory;
	private HardDrive hd;
	
	public Computer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hd = new HardDrive();
	}
	
	public void startComputer() {
		cpu.freeze();
		memory.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
		cpu.jump(BOOT_ADDRESS);
		cpu.execute();
	}
}

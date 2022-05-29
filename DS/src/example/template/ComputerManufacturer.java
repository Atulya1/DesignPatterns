package example.template;

public abstract class ComputerManufacturer {
	
	void buildComputer() {
		addHardDisk();
		addRAM();
		addKeyboard();
	}
	
	abstract void addHardDisk();
	abstract void addRAM();
	abstract void addKeyboard();
	
}

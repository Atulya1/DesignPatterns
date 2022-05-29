package example.template;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	void addHardDisk() {
		System.out.println("Hard Disk added for Desktop");
	}

	@Override
	void addRAM() {
		System.out.println("RAM added for Desktop");
	}

	@Override
	void addKeyboard() {
		System.out.println("Keyboard added for Desktop");
	}

}

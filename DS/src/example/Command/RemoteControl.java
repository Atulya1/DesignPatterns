package example.Command;

public class RemoteControl {
	
	public Command command;
	
	
	public Command getCommand() {
		return command;
	}


	public void setCommand(Command command) {
		this.command = command;
	}


	void pressButton(Command command) {
		command.execute();
	}

}

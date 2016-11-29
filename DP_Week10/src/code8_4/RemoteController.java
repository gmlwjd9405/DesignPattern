package code8_4;

public class RemoteController {
	// private Command theCommand;
	//
	// public RemoteController(Command theCommand) {
	// setCommand(theCommand);
	// }
	//
	// public void setCommand(Command newCommand) {
	// this.theCommand = newCommand;
	// }
	//
	// public void pressed() {
	// theCommand.execute();
	// }

	private Command command1;
	private Command command2;

	public RemoteController(Command command1, Command command2) {
		this.command1 = command1;
		this.command2 = command2;
	}

	public void setCommand1(Command command1) {
		this.command1 = command1;
	}

	public void setCommand2(Command command2) {
		this.command2 = command2;
	}

	public void pressed1() {
		command1.execute();
	}

	public void pressed2() {
		command2.execute();
	}
}

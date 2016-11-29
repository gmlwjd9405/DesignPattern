package ex8_1_4;

public class TVMuteCommand implements Command {
	private TV tv;

	public TVMuteCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.mute();
	}
}

package ex8_1_4;

public class TVPowerCommand implements Command {
	private TV tv;

	// 구현X
	public TVPowerCommand() {
	}

	// 반드시 생성자 주입
	public TVPowerCommand(TV tv) {
		this.tv = tv;
	}

	// 구현X
	public void setTV(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.power();
	}
}

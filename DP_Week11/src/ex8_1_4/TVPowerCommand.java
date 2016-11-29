package ex8_1_4;

public class TVPowerCommand implements Command {
	private TV tv;

	// ����X
	public TVPowerCommand() {
	}

	// �ݵ�� ������ ����
	public TVPowerCommand(TV tv) {
		this.tv = tv;
	}

	// ����X
	public void setTV(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.power();
	}
}

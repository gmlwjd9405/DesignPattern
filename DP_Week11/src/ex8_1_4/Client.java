package ex8_1_4;

public class Client {
	public static void main(String[] args) {
		TV tv = new TV();
		Car car = new Car();

		/* �����ڷ� ���� */
		Command c1 = new TVPowerCommand(tv);
		Command c2 = new TVMuteCommand(tv);
		Command c4 = new CarEngineCommand(car);

		//TwoButtonController rc = new TwoButtonController(c1, c2);
		TwoButtonController rc = new TwoButtonController(c4, c4);

		// /* setter�� ���� */
		// Command c3 = new TVPowerCommand();
		// c3.setTV(tv); // interface ��ü�̹Ƿ� TVPowerCommand�� �޼��� ���Ұ�
		//
		// TwoButtonController rc = new TwoButtonController();
		// rc.setCommand1(c1);
		// rc.setCommand2(c2);

		/* ���� */
		rc.button1Pressed();
		rc.button2Pressed();

		rc.button1Pressed();
		rc.button2Pressed();
	}
}

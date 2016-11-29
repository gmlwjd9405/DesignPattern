package ex8_1_4;

public class Client {
	public static void main(String[] args) {
		TV tv = new TV();
		Car car = new Car();

		/* 생성자로 주입 */
		Command c1 = new TVPowerCommand(tv);
		Command c2 = new TVMuteCommand(tv);
		Command c4 = new CarEngineCommand(car);

		//TwoButtonController rc = new TwoButtonController(c1, c2);
		TwoButtonController rc = new TwoButtonController(c4, c4);

		// /* setter로 주입 */
		// Command c3 = new TVPowerCommand();
		// c3.setTV(tv); // interface 객체이므로 TVPowerCommand의 메서드 사용불가
		//
		// TwoButtonController rc = new TwoButtonController();
		// rc.setCommand1(c1);
		// rc.setCommand2(c2);

		/* 실행 */
		rc.button1Pressed();
		rc.button2Pressed();

		rc.button1Pressed();
		rc.button2Pressed();
	}
}

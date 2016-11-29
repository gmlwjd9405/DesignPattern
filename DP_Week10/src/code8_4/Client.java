package code8_4;

public class Client {

	public static void main(String[] args) {
		// Lamp lamp = new Lamp();
		// Command lampCommand = new LampOnCommand(lamp);
		//
		// Alarm alarm = new Alarm();
		// Command alarmCommand = new AlarmOnCommand(alarm);
		//
		// Car car = new Car();
		// Command carCommane = new CarOnCommand(car);
		//
		// RemoteController controller1 = new RemoteController(lampCommand);
		// //������ �Ѵ� Ŀ�ǵ带 ����
		// controller1.pressed(); //��ư�� ������ ���� �Ѵ� ��� ����
		// RemoteController controller2 = new RemoteController(alarmCommand);
		// //�˶��� �︮�� Ŀ�ǵ带 ����
		// controller2.pressed(); //��ư�� ������ �˶��� �︮�� ��� ����
		// RemoteController controller3 = new RemoteController(carCommane);
		// //�ڵ��� ������ �Ѵ� Ŀ�ǵ带 ����
		// controller3.pressed(); //��ư�� ������ �˶��� �︮�� ��� ����
		//
		// controller2.setCommand(lampCommand); //���� �Ѵ� ������� ����
		// controller2.pressed();

		// /* RemoteController 2��. �ϳ��� Lamp����, �ϳ��� Alarm���� ��� */
		// Command c1 = new AlarmOnCommand(new Alarm());
		// Command c2 = new LampOnCommand(new Lamp());
		//
		// RemoteController rc = new RemoteController(c1, c2);
		// rc.pressed1();
		// rc.pressed2();

		/* RemoteController 2��. �ϳ��� Alarm Off, �ϳ��� Alarm Off���� ��� */
		// 2���� command�� ������ �˶��� ����. -> Alarm �ٱ����� ����.
		Alarm alarm = new Alarm();
		Command c1 = new AlarmOnCommand(alarm);
		Command c2 = new AlarmOffCommand(alarm);

		RemoteController rc = new RemoteController(c1, c2);
		rc.pressed1();
		rc.pressed2();
	}
}

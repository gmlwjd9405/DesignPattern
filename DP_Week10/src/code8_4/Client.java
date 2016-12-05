package code8_4;

public class Client {

	public static void main(String[] args) {
		/* 1. ��ư�� �ϳ��� RemoteController */
		// Command lampCommand = new LampOnCommand(new Lamp());
		// Command alarmCommand = new AlarmOnCommand(new Alarm());
		// Command carCommane = new CarOnCommand(new Car());
		//
		// RemoteController controller1 = new RemoteController(lampCommand);
		// // ������ �Ѵ� Ŀ�ǵ带 ����
		// controller1.pressed(); // ��ư�� ������ ���� �Ѵ� ��� ����
		// RemoteController controller2 = new RemoteController(alarmCommand);
		// // �˶��� �︮�� Ŀ�ǵ带 ����
		// controller2.pressed(); // ��ư�� ������ �˶��� �︮�� ��� ����
		// RemoteController controller3 = new RemoteController(carCommane);
		// // �ڵ��� ������ �Ѵ� Ŀ�ǵ带 ����
		// controller3.pressed(); // ��ư�� ������ �˶��� �︮�� ��� ����
		//
		// controller2.setCommand(lampCommand); // ���� �Ѵ� ������� ����
		// controller2.pressed();

		/* 2. ��ư�� �ΰ��� RemoteController. �ϳ��� Lamp����, �ϳ��� Alarm���� ��� */
		// Command c1 = new AlarmOnCommand(new Alarm());
		// Command c2 = new LampOnCommand(new Lamp());
		//
		// RemoteController rc = new RemoteController(c1, c2);
		// rc.pressed1();
		// rc.pressed2();

		/*
		 * 3. ��ư�� �ΰ��� RemoteController. �ϳ��� Alarm On, �ϳ��� Alarm Off���� ��� 2����
		 * command�� ������ �˶��� ����. -> Alarm �ٱ����� ����.
		 */
		 Alarm alarm = new Alarm();
		 Command c1 = new AlarmOnCommand(alarm);
		 Command c2 = new AlarmOffCommand(alarm);
		
		 RemoteController rc = new RemoteController(c1, c2);
		 rc.pressed1();
		 rc.pressed2();
	}
}

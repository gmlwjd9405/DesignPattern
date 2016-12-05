package code8_4;

public class Client {

	public static void main(String[] args) {
		/* 1. 버튼이 하나인 RemoteController */
		// Command lampCommand = new LampOnCommand(new Lamp());
		// Command alarmCommand = new AlarmOnCommand(new Alarm());
		// Command carCommane = new CarOnCommand(new Car());
		//
		// RemoteController controller1 = new RemoteController(lampCommand);
		// // 램프를 켜는 커맨드를 설정
		// controller1.pressed(); // 버튼이 눌리면 램프 켜는 기능 실행
		// RemoteController controller2 = new RemoteController(alarmCommand);
		// // 알람이 울리는 커맨드를 설정
		// controller2.pressed(); // 버튼이 눌리면 알람이 울리는 기능 실행
		// RemoteController controller3 = new RemoteController(carCommane);
		// // 자동차 엔진을 켜는 커맨드를 설정
		// controller3.pressed(); // 버튼이 눌리면 알람이 울리는 기능 실행
		//
		// controller2.setCommand(lampCommand); // 램프 켜는 기능으로 변경
		// controller2.pressed();

		/* 2. 버튼이 두개인 RemoteController. 하나는 Lamp설정, 하나는 Alarm설정 기능 */
		// Command c1 = new AlarmOnCommand(new Alarm());
		// Command c2 = new LampOnCommand(new Lamp());
		//
		// RemoteController rc = new RemoteController(c1, c2);
		// rc.pressed1();
		// rc.pressed2();

		/*
		 * 3. 버튼이 두개인 RemoteController. 하나는 Alarm On, 하나는 Alarm Off설정 기능 2개의
		 * command가 동일한 알람에 접근. -> Alarm 바깥에서 생성.
		 */
		 Alarm alarm = new Alarm();
		 Command c1 = new AlarmOnCommand(alarm);
		 Command c2 = new AlarmOffCommand(alarm);
		
		 RemoteController rc = new RemoteController(c1, c2);
		 rc.pressed1();
		 rc.pressed2();
	}
}

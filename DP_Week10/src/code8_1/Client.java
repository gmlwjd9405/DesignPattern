package code8_1;

public class Client {
//	public static void main(String[] args) {
//		Lamp lamp = new Lamp();
//		Button lampButton = new Button(lamp);
//		lampButton.pressed();
//	}
	
	/* 통제대상이 바뀌면 모두 변경된다. */
	public static void main(String[] args) {
		Alarm alarm = new Alarm();
		Button alarmButton = new Button(alarm);
		alarmButton.pressed();
	}
}

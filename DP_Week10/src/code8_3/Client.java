package code8_3;

public class Client {

	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Alarm alarm = new Alarm();

		Button button = new Button(lamp, alarm);
		button.pressed();
		button.pressed();
		button.pressed();
		button.pressed();
		button.pressed();
	}
}

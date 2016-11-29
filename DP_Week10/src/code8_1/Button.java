package code8_1;

public class Button {
//	private Lamp theLamp;
//
//	public Button(Lamp theLamp) {
//		this.theLamp = theLamp;
//	}
//
//	public void pressed() {
//		theLamp.turnOn();
//	}
	
	/* 램프를 켜는 대신 알람을 시작 */
	private Alarm theAlarm;

	public Button(Alarm theAlarm) {
		this.theAlarm = theAlarm;
	}

	public void pressed() {
		theAlarm.start();
	}
	
	
}

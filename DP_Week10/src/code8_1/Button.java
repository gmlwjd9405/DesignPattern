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
	
	/* ������ �Ѵ� ��� �˶��� ���� */
	private Alarm theAlarm;

	public Button(Alarm theAlarm) {
		this.theAlarm = theAlarm;
	}

	public void pressed() {
		theAlarm.start();
	}
	
	
}

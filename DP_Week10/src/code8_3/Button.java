package code8_3;

public class Button {
	private Lamp theLamp;
	private Alarm theAlarm;

	private Mode theMode = Mode.LAMP; // default

	public Button(Lamp theLamp, Alarm theAlarm) {
		this.theLamp = theLamp;
		this.theAlarm = theAlarm;
	}

	public void pressed() {
		switch (theMode) {
		case LAMP:
			theLamp.turnOn();
			theMode = Mode.ALARM;
			break;
		case ALARM:
			theAlarm.start();
			theMode = Mode.LAMP;
			break;
		}
	}
}

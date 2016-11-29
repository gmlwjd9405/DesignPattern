package code8_4;

public class AlarmOffCommand implements Command {
	private Alarm theAlarm;

	public AlarmOffCommand(Alarm theAlarm) {
		this.theAlarm = theAlarm;
	}

	@Override
	public void execute() {
		theAlarm.off();
	}
}


package ex9_1_6;

public class BatteryChargeDone implements Observer {
	private Battery battery;

	public BatteryChargeDone(Battery battery) {
		this.battery = battery;
	}

	public void update() {
		int level = battery.getLevel();
		if(level >= 100)
		System.out.println("Charge Done! Level: " + level);
	}
}

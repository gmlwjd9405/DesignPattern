package ex9_1_6;

public class Client {
	public static void main(String[] args) {
		Battery battery = new Battery();

		// BatteryLevelDisplay batteryLevelDisplay = new
		// BatteryLevelDisplay(battery);
		// LowBatteryWarning lowBatteryWarning = new LowBatteryWarning(battery);
		// BatteryChargeDone batteryChargeDone = new BatteryChargeDone(battery);
		Observer batteryLevelDisplay = new BatteryLevelDisplay(battery);
		Observer lowBatteryWarning = new LowBatteryWarning(battery);
		Observer batteryChargeDone = new BatteryChargeDone(battery);

		// 원하는 출력 형태의 옵저버를 추가
		battery.addObserver(batteryLevelDisplay);
		battery.addObserver(lowBatteryWarning);
		battery.addObserver(batteryChargeDone);

		battery.consume(20);
		battery.consume(50);
		battery.consume(10);

		battery.charge(20);
		battery.charge(50);
		battery.charge(30);
	}
}

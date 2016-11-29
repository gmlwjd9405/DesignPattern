package code8_4;

public class CarOnCommand implements Command {
	private Car car;

	public CarOnCommand(Car car) {
		this.car = car;
	}

	@Override
	public void execute() {
		car.engineOn();
	}
}

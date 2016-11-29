package ex8_1_4;

public class CarEngineCommand implements Command {
	private Car car;

	public CarEngineCommand(Car car) {
		this.car = car;
	}

	@Override
	public void execute() {
		car.enginePower();
	}

}

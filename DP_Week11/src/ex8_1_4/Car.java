package ex8_1_4;

public class Car {
	private boolean engineOn = false;

	public void enginePower() {
		engineOn = !engineOn;

		if (engineOn)
			System.out.println("Engine On");
		else
			System.out.println("Engine Off");
	}

}

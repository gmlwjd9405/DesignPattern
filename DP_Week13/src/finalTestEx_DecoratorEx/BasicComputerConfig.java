package finalTestEx_DecoratorEx;

public class BasicComputerConfig extends ComputerConfig {

	@Override
	public int getPrice() {
		price = 500000;
		return price;
	}
}

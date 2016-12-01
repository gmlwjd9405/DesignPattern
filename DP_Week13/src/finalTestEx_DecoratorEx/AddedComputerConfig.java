package finalTestEx_DecoratorEx;

public class AddedComputerConfig extends ComputerConfig {
	private ComputerConfig decoratedComputer;
	
	public AddedComputerConfig(ComputerConfig decoratedComputer) {
		this.decoratedComputer = decoratedComputer;
	}
	
	@Override
	public int getPrice() {
		price = decoratedComputer.getPrice();
		return price;
	}
}

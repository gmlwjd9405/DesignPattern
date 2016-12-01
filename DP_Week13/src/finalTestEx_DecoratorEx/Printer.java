package finalTestEx_DecoratorEx;

public class Printer extends AddedComputerConfig {

	public Printer(ComputerConfig decoratedComputer) {
		super(decoratedComputer);
	}
	
	public int getPrice() {
		price = super.getPrice() + 200000;
		return price;
	}
}

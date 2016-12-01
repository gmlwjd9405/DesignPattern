package finalTestEx_DecoratorEx;

public class Speaker extends AddedComputerConfig {

	public Speaker(ComputerConfig decoratedComputer) {
		super(decoratedComputer);
	}
	
	public int getPrice() {
		price = super.getPrice() + 50000;
		return price;
	}
}

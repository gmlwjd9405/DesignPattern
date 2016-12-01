package finalTestEx_DecoratorEx;

public class VoiceRecognition extends AddedComputerConfig {

	public VoiceRecognition(ComputerConfig decoratedComputer) {
		super(decoratedComputer);
	}
	
	public int getPrice() {
		price = super.getPrice() + 50000;
		return price;
	}
}
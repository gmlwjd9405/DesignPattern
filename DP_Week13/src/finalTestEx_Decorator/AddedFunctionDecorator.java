package finalTestEx_Decorator;

// 다양한 추가 기능에 대한 공통 클래스
public abstract class AddedFunctionDecorator extends ComputerConfig {
	private ComputerConfig decoratedDisplay;

	public AddedFunctionDecorator(ComputerConfig decoratedDisplay) {
		this.decoratedDisplay = decoratedDisplay;
	}

	@Override
	public int getPrice() {
		return decoratedDisplay.getPrice();
	}

}

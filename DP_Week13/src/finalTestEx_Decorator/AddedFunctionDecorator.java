package finalTestEx_Decorator;

// �پ��� �߰� ��ɿ� ���� ���� Ŭ����
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

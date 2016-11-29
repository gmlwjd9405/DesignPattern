package finalTestEx_Decorator;

//����Ŀ ����� �߰��ϴ� Ŭ����
public class SpeakerDecorator extends AddedFunctionDecorator {
	private int price = 50000;
	
	// ���� ��ǻ�� ��� Ŭ������ ����
	public SpeakerDecorator(ComputerConfig decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public int getPrice() {
		this.price += super.getPrice(); // ������ ���� ��ǻ�� ����� ����
		speckerFunction(); // �߰������� ����Ŀ ���
		System.out.println("\t\t+�� �ݾ�: " + price);
		return this.price;
	}

	private void speckerFunction() {
		System.out.println("\t+����Ŀ ���: " + price);
	}
}
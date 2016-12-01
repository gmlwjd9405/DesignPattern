package finalTestEx_Decorator;

//�����ν� ����� �߰��ϴ� Ŭ����
public class VoiceRecognitionDecorator extends AddedFunctionDecorator {
	private int myPrice = 50000;
	
	// ���� ��ǻ�� ��� Ŭ������ ����
	public VoiceRecognitionDecorator(ComputerConfig decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public int getPrice() {
		price = super.getPrice() + this.myPrice; // ������ ���� ��ǻ�� ����� ����
		voiceRecognitionFunction(); // �߰������� �����ν� ���
		System.out.println("\t\t�� �ݾ�: " + price);
		return this.price;
	}

	private void voiceRecognitionFunction() {
		System.out.println("\t+�����ν� ���: " + this.myPrice);
	}
}

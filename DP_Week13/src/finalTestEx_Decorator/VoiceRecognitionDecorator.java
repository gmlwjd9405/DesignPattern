package finalTestEx_Decorator;

//�����ν� ����� �߰��ϴ� Ŭ����
public class VoiceRecognitionDecorator extends AddedFunctionDecorator {
	private int price = 50000;
	
	// ���� ��ǻ�� ��� Ŭ������ ����
	public VoiceRecognitionDecorator(ComputerConfig decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public int getPrice() {
		this.price += super.getPrice(); // ������ ���� ��ǻ�� ����� ����
		voiceRecognitionFunction(); // �߰������� �����ν� ���
		System.out.println("\t\t+�� �ݾ�: " + price);
		return this.price;
	}

	private void voiceRecognitionFunction() {
		System.out.println("\t+�����ν� ���: " + price);
	}
}

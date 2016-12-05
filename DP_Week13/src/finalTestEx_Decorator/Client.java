package finalTestEx_Decorator;

public class Client {
	/* code 10_8 */
	public static void main(String[] args) {
		// ��ǻ�� + ����Ŀ
		ComputerConfig computer = new SpeakerDecorator(new BasicComputerConfig());
		computer.getPrice();
		
		// ��ǻ�� + ����Ŀ + ������
		ComputerConfig computer1 = new PrinterDecorator(computer);
		computer1.getPrice();
		
		// ��ǻ�� + ����Ŀ + �����ν�
		ComputerConfig computer2 = new VoiceRecognitionDecorator(computer);
		computer2.getPrice();
	}
}

package finalTestEx_Decorator;

public class Client {
	/* code 10_8 */
	public static void main(String[] args) {
		// ��ǻ�� + ����Ŀ
		ComputerConfig computer = new SpeakerDecorator(new BasicComputerConfig());
		int totalPrice = computer.getPrice();
		
		// ��ǻ�� + ����Ŀ + ������
		ComputerConfig computer1 = new PrinterDecorator(computer);
		int totalPrice1 = computer1.getPrice();
		
		// ��ǻ�� + ����Ŀ + �����ν�
		ComputerConfig computer2 = new VoiceRecognitionDecorator(computer);
		int totalPrice2 = computer2.getPrice();
		
		System.out.println(totalPrice);
		System.out.println(totalPrice1);
		System.out.println(totalPrice2);
	}
}

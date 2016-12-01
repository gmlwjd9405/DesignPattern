package finalTestEx_DecoratorEx;

public class Client {
	public static void main(String[] args) {
		
		ComputerConfig computer = new BasicComputerConfig();
		System.out.println("�� ���� : " + computer.getPrice());
		
		ComputerConfig computerWithSpeaker = new Speaker(computer);
		System.out.println("�� ���� : " + computerWithSpeaker.getPrice());
		
		ComputerConfig computerWithPrinter = new Printer(new BasicComputerConfig());
		System.out.println("�� ���� : " + computerWithPrinter.getPrice());
		
		ComputerConfig computerWithSpeakerAndVoiceRecognition = new VoiceRecognition(new Speaker(new BasicComputerConfig()));
		System.out.println("�� ���� : " + computerWithSpeakerAndVoiceRecognition.getPrice());
		
		
		ComputerConfig myCom = new Speaker(new BasicComputerConfig());
		System.out.println("�� ���� : " + myCom.getPrice());
		
		ComputerConfig myCom2 = new Printer(myCom);
		System.out.println("�� ���� : " + myCom2.getPrice());
		
		ComputerConfig myCom3 = new VoiceRecognition(myCom);
		System.out.println("�� ���� : " + myCom3.getPrice());
		
	}
}

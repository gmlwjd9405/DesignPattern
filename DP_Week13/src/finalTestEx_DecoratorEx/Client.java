package finalTestEx_DecoratorEx;

public class Client {
	public static void main(String[] args) {
		
		ComputerConfig computer = new BasicComputerConfig();
		System.out.println("ÃÑ °¡°Ý : " + computer.getPrice());
		
		ComputerConfig computerWithSpeaker = new Speaker(computer);
		System.out.println("ÃÑ °¡°Ý : " + computerWithSpeaker.getPrice());
		
		ComputerConfig computerWithPrinter = new Printer(new BasicComputerConfig());
		System.out.println("ÃÑ °¡°Ý : " + computerWithPrinter.getPrice());
		
		ComputerConfig computerWithSpeakerAndVoiceRecognition = new VoiceRecognition(new Speaker(new BasicComputerConfig()));
		System.out.println("ÃÑ °¡°Ý : " + computerWithSpeakerAndVoiceRecognition.getPrice());
		
		
		ComputerConfig myCom = new Speaker(new BasicComputerConfig());
		System.out.println("ÃÑ °¡°Ý : " + myCom.getPrice());
		
		ComputerConfig myCom2 = new Printer(myCom);
		System.out.println("ÃÑ °¡°Ý : " + myCom2.getPrice());
		
		ComputerConfig myCom3 = new VoiceRecognition(myCom);
		System.out.println("ÃÑ °¡°Ý : " + myCom3.getPrice());
		
	}
}

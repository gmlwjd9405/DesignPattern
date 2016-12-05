package finalTestEx_Decorator;

public class Client {
	/* code 10_8 */
	public static void main(String[] args) {
		// 컴퓨터 + 스피커
		ComputerConfig computer = new SpeakerDecorator(new BasicComputerConfig());
		computer.getPrice();
		
		// 컴퓨터 + 스피커 + 프린터
		ComputerConfig computer1 = new PrinterDecorator(computer);
		computer1.getPrice();
		
		// 컴퓨터 + 스피커 + 음성인식
		ComputerConfig computer2 = new VoiceRecognitionDecorator(computer);
		computer2.getPrice();
	}
}

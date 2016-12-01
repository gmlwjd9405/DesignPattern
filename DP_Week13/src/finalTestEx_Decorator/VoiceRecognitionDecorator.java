package finalTestEx_Decorator;

//음성인식 기능을 추가하는 클래스
public class VoiceRecognitionDecorator extends AddedFunctionDecorator {
	private int myPrice = 50000;
	
	// 기존 컴퓨터 기능 클래스의 설정
	public VoiceRecognitionDecorator(ComputerConfig decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public int getPrice() {
		price = super.getPrice() + this.myPrice; // 설정된 기존 컴퓨터 기능을 수행
		voiceRecognitionFunction(); // 추가적으로 음성인식 기능
		System.out.println("\t\t총 금액: " + price);
		return this.price;
	}

	private void voiceRecognitionFunction() {
		System.out.println("\t+음성인식 기능: " + this.myPrice);
	}
}

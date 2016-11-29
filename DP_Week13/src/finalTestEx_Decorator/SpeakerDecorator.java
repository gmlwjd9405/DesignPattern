package finalTestEx_Decorator;

//스피커 기능을 추가하는 클래스
public class SpeakerDecorator extends AddedFunctionDecorator {
	private int price = 50000;
	
	// 기존 컴퓨터 기능 클래스의 설정
	public SpeakerDecorator(ComputerConfig decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public int getPrice() {
		this.price += super.getPrice(); // 설정된 기존 컴퓨터 기능을 수행
		speckerFunction(); // 추가적으로 스피커 기능
		System.out.println("\t\t+총 금액: " + price);
		return this.price;
	}

	private void speckerFunction() {
		System.out.println("\t+스피커 기능: " + price);
	}
}
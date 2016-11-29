package finalTestEx_Decorator;

// 프린터 기능을 추가하는 클래스
public class PrinterDecorator extends AddedFunctionDecorator {
	private int price = 200000;
	
	// 기존 컴퓨터 기능 클래스의 설정
	public PrinterDecorator(ComputerConfig decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public int getPrice() {
		this.price += super.getPrice(); // 설정된 기존 컴퓨터 기능을 수행
		printerFunction(); // 추가적으로 프린터 기능
		System.out.println("\t\t+총 금액: " + price);
		return this.price;
	}

	private void printerFunction() {
		System.out.println("\t+프린터 기능: " + price);
	}
}

package finalTestEx_Decorator;

// 기본 기능 + 추가 기능
public abstract class ComputerConfig {
	/* 기본 기능과 추가 기능을 더한 총 가격 */
	protected int price; // abstract는 불가능. 모두 상속받는다.
	public abstract int getPrice();
}

package finalTestEx_Decorator;

//기본 컴퓨터 기능
public class BasicComputerConfig extends ComputerConfig {
	private int myPrice = 500000;

	@Override
	public int getPrice() {
		System.out.println("기본 컴퓨터 기능: " + this.myPrice);
		return this.myPrice;
	}

}

package finalTestEx_Decorator;

//�⺻ ��ǻ�� ���
public class BasicComputerConfig extends ComputerConfig {
	private int myPrice = 500000;

	@Override
	public int getPrice() {
		System.out.println("�⺻ ��ǻ�� ���: " + this.myPrice);
		return this.myPrice;
	}

}

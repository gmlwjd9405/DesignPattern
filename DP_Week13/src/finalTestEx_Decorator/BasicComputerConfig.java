package finalTestEx_Decorator;

//�⺻ ��ǻ�� ���
public class BasicComputerConfig extends ComputerConfig {
	private int price = 500000;

	@Override
	public int getPrice() {
		System.out.println("�⺻ ��ǻ�� ���: " + price);
		return this.price;
	}

}

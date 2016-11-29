package finalTestEx_Decorator;

// ������ ����� �߰��ϴ� Ŭ����
public class PrinterDecorator extends AddedFunctionDecorator {
	private int price = 200000;
	
	// ���� ��ǻ�� ��� Ŭ������ ����
	public PrinterDecorator(ComputerConfig decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public int getPrice() {
		this.price += super.getPrice(); // ������ ���� ��ǻ�� ����� ����
		printerFunction(); // �߰������� ������ ���
		System.out.println("\t\t+�� �ݾ�: " + price);
		return this.price;
	}

	private void printerFunction() {
		System.out.println("\t+������ ���: " + price);
	}
}

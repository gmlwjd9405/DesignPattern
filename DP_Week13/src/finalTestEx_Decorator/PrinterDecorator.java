package finalTestEx_Decorator;

// ������ ����� �߰��ϴ� Ŭ����
public class PrinterDecorator extends AddedFunctionDecorator {
	private int myPrice = 200000;
	
	// ���� ��ǻ�� ��� Ŭ������ ����
	public PrinterDecorator(ComputerConfig decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public int getPrice() {
		price = super.getPrice() + this.myPrice; // ������ ���� ��ǻ�� ����� ����
		printerFunction(); // �߰������� ������ ���
		System.out.println("\t\t�� �ݾ�: " + price);
		return this.price;
	}

	private void printerFunction() {
		System.out.println("\t+������ ���: " + this.myPrice);
	}
}

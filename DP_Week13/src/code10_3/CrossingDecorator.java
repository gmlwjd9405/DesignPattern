package code10_3;

//������ ǥ�ø� �߰��ϴ� Ŭ����
public class CrossingDecorator extends DisplayDecorator {
	// ���� ǥ�� Ŭ������ ����
	public CrossingDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public void draw() {
		super.draw(); // ������ ���� ǥ�� ����� ����
		drawCrossing(); // �߰������� �����θ� ǥ��
	}

	private void drawCrossing() {
		System.out.println("\t���뷮 ǥ��");
	}
}

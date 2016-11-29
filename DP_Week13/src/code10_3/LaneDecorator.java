package code10_3;

//���� ǥ�ø� �߰��ϴ� Ŭ����
public class LaneDecorator extends DisplayDecorator {
	// ���� ǥ�� Ŭ������ ����
	public LaneDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public void draw() {
		super.draw(); // ������ ���� ǥ�� ����� ����
		drawLane(); // �߰������� ������ ǥ��
	}

	private void drawLane() {
		System.out.println("\t���� ǥ��");
	}
}

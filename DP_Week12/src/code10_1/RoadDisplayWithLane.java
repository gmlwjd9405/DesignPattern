package code10_1;

/** �⺻ ���� ǥ�� + ���� ǥ�� Ŭ���� */
public class RoadDisplayWithLane extends RoadDisplay {
	public void draw() {
		super.draw(); // ���� Ŭ����, �� RoadDisplay Ŭ������ draw �޼��带 ȣ���ؼ� �⺻ ���� ǥ��
		drawLane(); // �߰������� ���� ǥ��
	}

	private void drawLane() {
		System.out.println("���� ǥ��");
	}

}

package code10_2;

/** �⺻ ���� ǥ�� + ���뷮 ǥ�� Ŭ���� */
public class RoadDisplayWithTraffic extends RoadDisplay {
	public void draw() {
		super.draw(); // ���� Ŭ����, �� RoadDisplay Ŭ������ draw �޼��带 ȣ���ؼ� �⺻ ���� ǥ��
		drawTraffic(); // �߰������� ���뷮 ǥ��
	}

	private void drawTraffic() {
		System.out.println("���뷮 ǥ��");
	}
}
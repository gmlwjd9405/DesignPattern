package code10_3;

public class Client {
	/* code 10_4 */
//	public static void main(String[] args) {
//		Display road = new RoadDisplay();
//		road.draw(); // �⺻ ���� ǥ��
//
//		Display roadWithLane = new LaneDecorator(new RoadDisplay());
//		roadWithLane.draw(); // �⺻ ���� ǥ�� + ���� ǥ��
//
//		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
//		roadWithTraffic.draw(); // �⺻ ���� ǥ�� + ���뷮 ǥ��
//	}

	/* code 10_5 */
	// public static void main(String[] args) {
	// �⺻ ���� ǥ�� + ���� ǥ�� + ���뷮 ǥ��
	// Display roadWithLaneAndTraffic = new TrafficDecorator(new
	// LaneDecorator(new RoadDisplay()));
	// roadWithLaneAndTraffic.draw();
	// }

	/* code 10_7 */
	 public static void main(String[] args) {
	 //�⺻ ���� ǥ�� + ���� ǥ�� + ���뷮 ǥ�� + ������ ǥ��
	 Display roadWithCrossingLaneAndTraffic = new LaneDecorator(new
	 TrafficDecorator(new CrossingDecorator(new RoadDisplay())));
	 roadWithCrossingLaneAndTraffic.draw();
	 }

	/* code 10_8 */
	// public static void main(String[] args) {
	// Display road = new RoadDisplay();
	//
	// for (String decoratorName : args) {
	// if (decoratorName.equalsIgnoreCase("Lane"))
	// road = new LaneDecorator(road); // ���� ǥ�� ����� �������� �߰�
	// if (decoratorName.equalsIgnoreCase("Traffic"))
	// road = new TrafficDecorator(road); // ���뷮 ǥ�� ����� �������� �߰�
	// if (decoratorName.equalsIgnoreCase("Crossing"))
	// road = new CrossingDecorator(road); // ������ ǥ�� ����� �������� �߰�
	// }
	// road.draw();
	// }
}

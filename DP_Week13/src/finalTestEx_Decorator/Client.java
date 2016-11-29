package finalTestEx_Decorator;

public class Client {
	/* code 10_4 */
	// public static void main(String[] args) {
	// Display road = new RoadDisplay();
	// road.draw(); // �⺻ ���� ǥ��
	//
	// Display roadWithLane = new LaneDecorator(new RoadDisplay());
	// roadWithLane.draw(); // �⺻ ���� ǥ�� + ���� ǥ��
	//
	// Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
	// roadWithTraffic.draw(); // �⺻ ���� ǥ�� + ���뷮 ǥ��
	// }

	/* code 10_5 */
	// public static void main(String[] args) {
	// �⺻ ���� ǥ�� + ���� ǥ�� + ���뷮 ǥ��
	// Display roadWithLaneAndTraffic = new TrafficDecorator(new
	// LaneDecorator(new RoadDisplay()));
	// roadWithLaneAndTraffic.draw();
	// }

	/* code 10_7 */
	// public static void main(String[] args) {
	// �⺻ ���� ǥ�� + ���� ǥ�� + ���뷮 ǥ�� + ������ ǥ��
	// Display roadWithCrossingLaneAndTraffic = new LaneDecorator(new
	// TrafficDecorator(new CrossingDecorator(new RoadDisplay())));
	// roadWithCrossingLaneAndTraffic.draw();
	// }

	/* code 10_8 */
	public static void main(String[] args) {
		ComputerConfig computer = new SpeakerDecorator(new BasicComputerConfig());
		int totalPrice = computer.getPrice();
		
		ComputerConfig computer1 = new PrinterDecorator(computer);
		int totalPrice1 = computer1.getPrice();
		
		ComputerConfig computer2 = new VoiceRecognitionDecorator(computer);
		int totalPrice2 = computer2.getPrice();
		
		System.out.println(totalPrice);
		System.out.println(totalPrice1);
		System.out.println(totalPrice2);
	}
}

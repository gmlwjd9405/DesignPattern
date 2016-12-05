package code10_3;

public class Client {
	/* code 10_4 */
//	public static void main(String[] args) {
//		Display road = new RoadDisplay();
//		road.draw(); // 기본 도로 표시
//
//		Display roadWithLane = new LaneDecorator(new RoadDisplay());
//		roadWithLane.draw(); // 기본 도로 표시 + 차선 표시
//
//		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
//		roadWithTraffic.draw(); // 기본 도로 표시 + 교통량 표시
//	}

	/* code 10_5 */
	// public static void main(String[] args) {
	// 기본 도로 표시 + 차선 표시 + 교통량 표시
	// Display roadWithLaneAndTraffic = new TrafficDecorator(new
	// LaneDecorator(new RoadDisplay()));
	// roadWithLaneAndTraffic.draw();
	// }

	/* code 10_7 */
	 public static void main(String[] args) {
	 //기본 도로 표시 + 차선 표시 + 교통량 표시 + 교차로 표시
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
	// road = new LaneDecorator(road); // 차선 표시 기능을 동적으로 추가
	// if (decoratorName.equalsIgnoreCase("Traffic"))
	// road = new TrafficDecorator(road); // 교통량 표시 기능을 동적으로 추가
	// if (decoratorName.equalsIgnoreCase("Crossing"))
	// road = new CrossingDecorator(road); // 교차로 표시 기능을 동적으로 추가
	// }
	// road.draw();
	// }
}

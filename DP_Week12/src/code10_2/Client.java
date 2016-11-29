package code10_2;

public class Client {
	public static void main(String[] args) {
		RoadDisplay road = new RoadDisplay();
		road.draw();

		RoadDisplay roadWithLane = new RoadDisplayWithLane();
		roadWithLane.draw();
		
		RoadDisplay roadWithTraffic = new RoadDisplayWithTraffic();
		roadWithTraffic.draw();
	}
}

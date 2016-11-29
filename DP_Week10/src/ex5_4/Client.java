package ex5_4;

public class Client {
	private static final int INIT_LOCATION[] = { 50, 100, 150 };

	public static void main(String[] args) {
		Ball[] balls = new Ball[3];
		for (int i = 0; i < balls.length; i++) {
			balls[i] = new Ball(INIT_LOCATION[i], INIT_LOCATION[i]);
//			balls[i].setDirectionStrategy(new HorizonalMoveStrategy());
//			balls[i].setDrawStrategy(new RedDrawStrategy());
//
//			balls[i].start();
		}
		balls[0].setDirectionStrategy(new HorizonalMoveStrategy());
		balls[0].setDrawStrategy(new RedDrawStrategy());
		balls[0].start();

		balls[1].setDirectionStrategy(new VerticalMoveStrategy());
		balls[1].setDrawStrategy(new BlueDrawStrategy());
		balls[1].start();

		balls[2].setDirectionStrategy(new DiagonalMoveStrategy());
		balls[2].setDrawStrategy(new GreenDrawStrategy());
		balls[2].start();


		new BallFrame(balls);
	}
}

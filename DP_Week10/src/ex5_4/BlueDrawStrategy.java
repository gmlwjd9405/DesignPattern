package ex5_4;

import java.awt.Color;

public class BlueDrawStrategy implements DrawStrategy {

	@Override
	public void draw(Ball ball) {
		ball.setColor(Color.blue);
	}

}

package ex5_4;

import java.awt.Color;

public class YellowDrawStrategy extends DrawStrategy {

	@Override
	public void draw(Ball ball) {
		ball.setColor(Color.yellow);
	}

}


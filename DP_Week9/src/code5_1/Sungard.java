package code5_1;

public class Sungard extends Robot {
	public Sungard(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Missle attack");
	}

	@Override
	public void move() {
		System.out.println("Fly");
	}
}

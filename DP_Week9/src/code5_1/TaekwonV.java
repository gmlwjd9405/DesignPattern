package code5_1;

public class TaekwonV extends Robot {
	public TaekwonV(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Missile attack");
	}

	@Override
	public void move() {
		System.out.println("Walk");
	}
}

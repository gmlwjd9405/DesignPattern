package code5_1;

public class Atom extends Robot {
	public Atom(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Punch attack");
	}

	@Override
	public void move() {
		System.out.println("Fly");
	}

}

package code5_1;

public class Client {
	public static void main(String[] args) {
		Robot taekwonV = new TaekwonV("TackwonV");
		Robot atom = new Atom("Atom");

		System.out.println("My name is " + taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();

		System.out.println();

		System.out.println("My name is " + atom.getName());
		atom.move();
		atom.attack();
	}
}

package code5_3_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");

		Robot taekwonV = (Robot) context.getBean("taekwonV");
		System.out.println(taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();

		System.out.println();

		Robot atom = (Robot) context.getBean("atom");
		System.out.println(atom.getName());
		atom.move();
		atom.attack();

		System.out.println();

		Robot sungard = (Robot) context.getBean("sungard");
		System.out.println(sungard.getName());
		sungard.move();
		sungard.attack();

		
		// Robot robot1 = new Atom("atom");
		// robot1.setAttackStrategy(new Punch());
		// robot1.setMovingStrategy(new Walk());
		//
		// robot1.move();
		// robot1.attack();
	}
}

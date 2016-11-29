package observer_print1;

//Test program for ConcreteSubject, NameObserver and PriceObserver
public class TestObservers {
	public static void main(String args[]) {
		// Create the Subject and Observers.
		ConcreteSubject s = new ConcreteSubject("Corn Pops", 1.29f);
		NameObserver nameObs = new NameObserver();
		PriceObserver priceObs = new PriceObserver();
		
		// Add those Observers!
		s.addObserver(nameObs);
		s.addObserver(priceObs);
		
		// Make changes to the Subject.
		/* 타입 체크까지 한 결과의 변화(타입에 변화가 없으면 없다고 출력) */
		System.out.println();
		s.setName("Frosted Flakes");
		System.out.println();
		s.setPrice(4.57f);
		System.out.println();
		s.setPrice(9.22f);
		System.out.println();
		s.setName("Sugar Crispies");
	}
}
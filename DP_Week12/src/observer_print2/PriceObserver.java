package observer_print2;

import java.util.Observable;
import java.util.Observer;

//An observer of price changes.
public class PriceObserver implements Observer {
	private ConcreteSubject concreteSubject;
	private float price;

	public PriceObserver(ConcreteSubject concreteSubject) {
		this.concreteSubject = concreteSubject;
		price = 0;
		System.out.println("PriceObserver created: Price is " + price);
	}

	public void update(Observable obj, Object arg) {
		concreteSubject = (ConcreteSubject) obj;
		this.price = concreteSubject.getPrice();

		System.out.println("PriceObserver: Price changed to " + price);

	}
}
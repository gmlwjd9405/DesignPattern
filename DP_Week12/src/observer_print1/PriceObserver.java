package observer_print1;

import java.util.Observable;
import java.util.Observer;

//An observer of price changes.
public class PriceObserver implements Observer {
	private float price;

	public PriceObserver() {
		price = 0;
		System.out.println("PriceObserver created: Price is " + price);
	}

	public void update(Observable obj, Object arg) {
		//받아온 인지의 타입이 Float이면  변한것으로 생각
		if (arg instanceof Float) {
			price = ((Float) arg).floatValue();
			System.out.println("PriceObserver: Price changed to " + price);
		} else {
			System.out.println("PriceObserver: Some other change to subject!");
		}
	}
}
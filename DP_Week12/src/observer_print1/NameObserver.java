package observer_print1;

import java.util.Observable;
import java.util.Observer;

//An observer of name changes.
public class NameObserver implements Observer {
	private String name;

	public NameObserver() {
		name = null;
		System.out.println("NameObserver created: Name is " + name);
	}

	public void update(Observable obj, Object arg) {
		//받아온 인지의 타입이 String이면  변한것으로 생각
		if (arg instanceof String) {
			name = (String) arg;
			System.out.println("NameObserver: Name changed to " + name);
		} else {
			System.out.println("NameObserver: Some other change to subject!");
		}
	}
}

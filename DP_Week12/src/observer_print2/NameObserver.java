package observer_print2;

import java.util.Observable;
import java.util.Observer;

//An observer of name changes.
public class NameObserver implements Observer {
	private ConcreteSubject concreteSubject;
	private String name;

	public NameObserver(ConcreteSubject concreteSubject) {
		this.concreteSubject = concreteSubject;
		name = null;
		System.out.println("NameObserver created: Name is " + name);
	}

	public void update(Observable obj, Object arg) {
		concreteSubject = (ConcreteSubject) obj;
		this.name = concreteSubject.getName();

		System.out.println("NameObserver: Name changed to " + name);
	}
}

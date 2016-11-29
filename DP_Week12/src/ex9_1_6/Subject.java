package ex9_1_6;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	// ��� ���¿� ���� observer
	private List<Observer> observers = new ArrayList<Observer>();

	/** ���� ���� ���� setter */
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	/** List<Observer>��ü���� update�� ȣ�� */
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update();
		}
	}
}

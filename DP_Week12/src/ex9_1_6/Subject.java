package ex9_1_6;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	// 출력 형태에 대한 observer
	private List<Observer> observers = new ArrayList<Observer>();

	/** 여러 개에 대한 setter */
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	/** List<Observer>객체들의 update를 호출 */
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update();
		}
	}
}

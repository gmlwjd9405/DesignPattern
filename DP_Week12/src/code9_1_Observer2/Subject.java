package code9_1_Observer2;

import java.util.ArrayList;
import java.util.List;

// 데이터에 공통적으로 들어가야하는 메서드들 -> 일반화
public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>(); // 출력 형태에 대한
	// observer

	
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

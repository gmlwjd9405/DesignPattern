package code9_1_Observer2;

import java.util.ArrayList;
import java.util.List;

// �����Ϳ� ���������� �����ϴ� �޼���� -> �Ϲ�ȭ
public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>(); // ��� ���¿� ����
	// observer

	
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

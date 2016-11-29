package code9_1_Observer1;

import java.util.List;
import java.util.ArrayList;

public class ScoreRecord {
	/* 3. ������� 2���� ���� �� */
	private List<Integer> scores = new ArrayList<Integer>(); // ������ ������
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

	/** ���ο� ������ �߰� */
	public void addScore(int score) {
		scores.add(score); // scores ��Ͽ� �־��� ������ �߰���
		notifyObservers(); // scores�� ������� �뺸��
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}

package code9_1_Observer2;

import java.util.List;
import java.util.ArrayList;

public class ScoreRecord extends Subject{
	/* 3. ������� 2���� ���� �� */
	private List<Integer> scores = new ArrayList<Integer>(); // ������ ������
	private List<Observer> observers = new ArrayList<Observer>(); // ��� ���¿� ����
																	// observer

	/** ���ο� ������ �߰� */
	public void addScore(int score) {
		scores.add(score); // scores ��Ͽ� �־��� ������ �߰���
		notifyObservers(); // scores�� ������� �뺸��
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}

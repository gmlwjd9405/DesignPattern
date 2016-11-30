package code9_1_Observer2;

import java.util.List;
import java.util.ArrayList;

public class ScoreRecord extends Subject{
	/* 3. 출력형태 2개를 가질 때 */
	private List<Integer> scores = new ArrayList<Integer>(); // 점수를 저장함
	private List<Observer> observers = new ArrayList<Observer>(); // 출력 형태에 대한
																	// observer

	/** 새로운 점수를 추가 */
	public void addScore(int score) {
		scores.add(score); // scores 목록에 주어진 점수를 추가함
		notifyObservers(); // scores가 변경됨을 통보함
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}

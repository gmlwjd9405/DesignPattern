package code9_1_Observer1;

import java.util.Collections;
import java.util.List;

public class DataMinMaxView implements Observer{
	private ScoreRecord scoreRecord;

	public DataMinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	/** 점수의 변경을 통보받음 */
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord(); // 점수를 조회함
		displayScores(record); // 조회된 점수의 최대,최소값을 출력함
	}

	private void displayScores(List<Integer> record) {
		int min = Collections.min(record);
		int max = Collections.max(record);
		
		System.out.print("Min of entries: " + min);
		System.out.println(", Max of entries: " + max);
		System.out.println();
	}
}

package code9_1_Observer2;

import java.util.Collections;
import java.util.List;

public class DataSortedView implements Observer{
	private ScoreRecord scoreRecord;

	public DataSortedView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	/** 점수의 변경을 통보받음 */
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord(); // 점수를 조회함
		displayScores(record); // 조회된 점수를 정렬하여 출력함
	}

	private void displayScores(List<Integer> record) {
		Collections.sort(record);

		System.out.println("Sort all entries: ");
		for (int i = 0; i < record.size(); i++) {
			System.out.println(record.get(i) + " ");
		}
		System.out.println();
	}
}

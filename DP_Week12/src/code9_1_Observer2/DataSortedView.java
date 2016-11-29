package code9_1_Observer2;

import java.util.Collections;
import java.util.List;

public class DataSortedView implements Observer{
	private ScoreRecord scoreRecord;

	public DataSortedView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	/** ������ ������ �뺸���� */
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord(); // ������ ��ȸ��
		displayScores(record); // ��ȸ�� ������ �����Ͽ� �����
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

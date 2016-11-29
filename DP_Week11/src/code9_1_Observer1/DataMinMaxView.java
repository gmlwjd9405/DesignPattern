package code9_1_Observer1;

import java.util.Collections;
import java.util.List;

public class DataMinMaxView implements Observer{
	private ScoreRecord scoreRecord;

	public DataMinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	/** ������ ������ �뺸���� */
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord(); // ������ ��ȸ��
		displayScores(record); // ��ȸ�� ������ �ִ�,�ּҰ��� �����
	}

	private void displayScores(List<Integer> record) {
		int min = Collections.min(record);
		int max = Collections.max(record);
		
		System.out.print("Min of entries: " + min);
		System.out.println(", Max of entries: " + max);
		System.out.println();
	}
}

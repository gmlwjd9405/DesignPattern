package code9_1_Observer2;

import java.util.List;

public class DataSheetView implements Observer{
	private ScoreRecord scoreRecord;
	private int viewCount;

	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}

	/** ������ ������ �뺸���� */
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord(); // ������ ��ȸ��
		displayScores(record, viewCount); // ��ȸ�� ������ viewCount ��ŭ�� �����
	}

	private void displayScores(List<Integer> record, int viewCount) {
		System.out.println("List of " + viewCount + " entries: ");
		for (int i = 0; i < viewCount && i < record.size(); i++) {
			System.out.println(record.get(i) + " ");
		}
		System.out.println();
	}
}

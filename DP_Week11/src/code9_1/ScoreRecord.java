package code9_1;

import java.util.List;
import java.util.ArrayList;

public class ScoreRecord {
	/* 1. �������: ��� */
	// private List<Integer> scores = new ArrayList<Integer>(); // ������ ������
	// private DataSheetView dataSheetView; // ��� ���·� ������ ����ϴ� Ŭ����
	//
	// public void setDataSheetView(DataSheetView dataSheetView) {
	// this.dataSheetView = dataSheetView;
	// }
	//
	// /** ���ο� ������ �߰� */
	// public void addScore(int score) {
	// scores.add(score); // scores ��Ͽ� �־��� ������ �߰���
	// dataSheetView.update(); // scores�� ������� �뺸��
	// }
	//
	// public List<Integer> getScoreRecord() {
	// return scores;
	// }

	/* 2. �������: ���� */
	// private List<Integer> scores = new ArrayList<Integer>(); // ������ ������
	// private DataSortedView dataSortedView; // ������ �����Ͽ� ����ϴ� Ŭ����
	//
	// public void setDataSheetView(DataSortedView dataSortedView) {
	// this.dataSortedView = dataSortedView;
	// }
	//
	// /** ���ο� ������ �߰� */
	// public void addScore(int score) {
	// scores.add(score); // scores ��Ͽ� �־��� ������ �߰���
	// dataSortedView.update(); // scores�� ������� �뺸��
	// }
	//
	// public List<Integer> getScoreRecord() {
	// return scores;
	// }

	/* 3. ������� 2���� ���� �� */
	private List<Integer> scores = new ArrayList<Integer>(); // ������ ������
	private DataSheetView dataSheetView; // ��� ���·� ������ ����ϴ� Ŭ����
	private DataSortedView dataSortedView; // ������ �����Ͽ� ����ϴ� Ŭ����

	public void setDataSheetView(DataSheetView dataSheetView) {
		this.dataSheetView = dataSheetView;
	}

	public void setDataSortedView(DataSortedView dataSortedView) {
		this.dataSortedView = dataSortedView;
	}

	/** ���ο� ������ �߰� */
	public void addScore(int score) {
		scores.add(score); // scores ��Ͽ� �־��� ������ �߰���
		dataSheetView.update(); // scores�� ������� �뺸��
		dataSortedView.update(); // scores�� ������� �뺸��
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}

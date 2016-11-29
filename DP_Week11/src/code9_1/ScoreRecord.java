package code9_1;

import java.util.List;
import java.util.ArrayList;

public class ScoreRecord {
	/* 1. 출력형태: 목록 */
	// private List<Integer> scores = new ArrayList<Integer>(); // 점수를 저장함
	// private DataSheetView dataSheetView; // 목록 형태로 점수를 출력하는 클래스
	//
	// public void setDataSheetView(DataSheetView dataSheetView) {
	// this.dataSheetView = dataSheetView;
	// }
	//
	// /** 새로운 점수를 추가 */
	// public void addScore(int score) {
	// scores.add(score); // scores 목록에 주어진 점수를 추가함
	// dataSheetView.update(); // scores가 변경됨을 통보함
	// }
	//
	// public List<Integer> getScoreRecord() {
	// return scores;
	// }

	/* 2. 출력형태: 정렬 */
	// private List<Integer> scores = new ArrayList<Integer>(); // 점수를 저장함
	// private DataSortedView dataSortedView; // 점수를 정렬하여 출력하는 클래스
	//
	// public void setDataSheetView(DataSortedView dataSortedView) {
	// this.dataSortedView = dataSortedView;
	// }
	//
	// /** 새로운 점수를 추가 */
	// public void addScore(int score) {
	// scores.add(score); // scores 목록에 주어진 점수를 추가함
	// dataSortedView.update(); // scores가 변경됨을 통보함
	// }
	//
	// public List<Integer> getScoreRecord() {
	// return scores;
	// }

	/* 3. 출력형태 2개를 가질 때 */
	private List<Integer> scores = new ArrayList<Integer>(); // 점수를 저장함
	private DataSheetView dataSheetView; // 목록 형태로 점수를 출력하는 클래스
	private DataSortedView dataSortedView; // 점수를 정렬하여 출력하는 클래스

	public void setDataSheetView(DataSheetView dataSheetView) {
		this.dataSheetView = dataSheetView;
	}

	public void setDataSortedView(DataSortedView dataSortedView) {
		this.dataSortedView = dataSortedView;
	}

	/** 새로운 점수를 추가 */
	public void addScore(int score) {
		scores.add(score); // scores 목록에 주어진 점수를 추가함
		dataSheetView.update(); // scores가 변경됨을 통보함
		dataSortedView.update(); // scores가 변경됨을 통보함
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}

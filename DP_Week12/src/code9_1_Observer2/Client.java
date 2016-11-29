package code9_1_Observer2;

public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();

		// 3�������� ������ �����
		DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
		// �������� �����Ͽ� �����
		DataSortedView dataSortedView = new DataSortedView(scoreRecord);
		// �������� �ִ��ּҰ��� �����
		DataMinMaxView dataMinMaxView = new DataMinMaxView(scoreRecord);

		scoreRecord.addObserver(dataSheetView);
		scoreRecord.addObserver(dataSortedView);
		scoreRecord.addObserver(dataMinMaxView);

		// for (int index = 1; index <= 5; index++) {
		for (int index = 5; index >= 1; index--) {
			int score = index * 10;
			System.out.println("Adding " + score);

			// 10 20 30 40 50�� �߰���, �߰��� ������ �ִ� 3���� ������ �����
			scoreRecord.addScore(score);
		}
	}
}

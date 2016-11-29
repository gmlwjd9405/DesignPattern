package ex9_1_6;

public class Battery extends Subject {
	private int level = 100;

	/** ���� */
	public void consume(int amount) {
		level -= amount;
		notifyObservers(); //������update����
	}
	
	/** ����(�߰�) */
	public void charge(int amount){
		level += amount;
		notifyObservers(); //������update����
	}

	public int getLevel() {
		return level;
	}
}

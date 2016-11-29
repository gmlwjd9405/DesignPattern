package ex9_1_6;

public class Battery extends Subject {
	private int level = 100;

	/** 备概 */
	public void consume(int amount) {
		level -= amount;
		notifyObservers(); //可历滚update角青
	}
	
	/** 面傈(眠啊) */
	public void charge(int amount){
		level += amount;
		notifyObservers(); //可历滚update角青
	}

	public int getLevel() {
		return level;
	}
}

package ex14_1_solution;

public abstract class Item {
	/* 자식 클래스도 사용가능한 필드 */
	protected String name;
	protected int depth = 0;

	/* 자식 클래스에서 메서드 오버라이딩 */
	public abstract int getSize();

	public abstract void print();

	/* 자식 클래스가 상속받음 */
	public Item(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	};

}

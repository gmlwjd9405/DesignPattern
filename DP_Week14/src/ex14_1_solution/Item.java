package ex14_1_solution;

public abstract class Item {
	/* �ڽ� Ŭ������ ��밡���� �ʵ� */
	protected String name;
	protected int depth = 0;

	/* �ڽ� Ŭ�������� �޼��� �������̵� */
	public abstract int getSize();

	public abstract void print();

	/* �ڽ� Ŭ������ ��ӹ��� */
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

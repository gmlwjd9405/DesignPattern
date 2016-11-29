package ex14_1_solution;

public class File extends Item {
	private int size;

	public File(String name, int size) {
		super(name); // �θ𿡼� name ����
		this.size = size;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void print() {
		for (int i = 0; i < depth; i++) {
			System.out.print("\t");
		}

		System.out.println("[File] " + name + ", Size: " + size);
	}

}

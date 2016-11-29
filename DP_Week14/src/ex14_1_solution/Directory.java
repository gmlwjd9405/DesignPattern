package ex14_1_solution;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Item {
	private List<Item> items = new ArrayList<Item>();

	public Directory(String name) {
		super(name); // 부모에서 name 세팅
	}

	public void addItem(Item item) {
		items.add(item);
		item.setDepth(depth + 1);
	}

	public void removeItem(Item item) {
		items.remove(item);
	}

	@Override
	public int getSize() {
		int totalSize = 0;
		for (Item item : items) {
			totalSize += item.getSize();
		}

		return totalSize;
	}

	@Override
	public void print() {
		for (int i = 0; i < depth; i++) {
			System.out.print("\t");
		}
		System.out.println("[Directory] " + name + ", Size: " + getSize());

		for (Item item : items) {
			item.print();
		}
	}
}

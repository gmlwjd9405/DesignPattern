package ex14_1_solution;

public class Client {
	public static void main(String[] args) {
		// Directory dir1 = new Directory("root");
		// Directory dir2 = new Directory("Dir1");
		//
		// File f1 = new File("f1", 100);
		// File f2 = new File("f2", 200);
		// File f3 = new File("f3", 300);
		// File f4 = new File("f4", 400);
		//
		// dir1.addEntry(f1);
		// dir1.addEntry(dir2);
		// dir2.addEntry(f2);
		// dir2.addEntry(f3);
		// dir1.addEntry(f4);
		//
		// dir1.print();

		Item file1 = new File("file1", 10);
		Item file2 = new File("file2", 20);
		Directory dir1 = new Directory("dir1");
		Directory dir2 = new Directory("dir2");

		Item file3 = new File("file3", 10);
		Item file4 = new File("file4", 20);
		Item file5 = new File("file5", 30);

		dir1.addItem(file1);
		dir1.addItem(file2);
		dir1.addItem(dir2);

		dir2.addItem(file3);
		dir2.addItem(file4);
		dir2.addItem(file5);

		dir1.print();

		System.out.println(dir1.getName() + " Size: " + dir1.getSize());

	}
}

package singletonEx;

public class Main {
	// public static void main(String[] args) {
	// MyClass obj1 = MyClass.getInstance();
	// MyClass obj2 = MyClass.getInstance();
	//
	// System.out.println(obj1.toString());
	// System.out.println(obj2.toString());
	// }

	/* User Thread Test */
	public static void main(String[] args) {
		User[] users = new User[5];

		for (User user : users) {
			user = new User(); // 순차적으로 생성됨
			user.start();
		}

		// for (int i = 0; i < users.length; i++) {
		// users[i] = new User();
		// users[i].start();
		// }
	}
}

package singletonEx;

public class User extends Thread {
	public void run() {
		MyClass obj = MyClass.getInstance();
		System.out.println(obj + " " + Thread.currentThread().getName() + " print using " + ".");

	}

}

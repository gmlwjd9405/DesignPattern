package singletonEx;

public class MyClass {
	/* obj가 없으면 생성 */
	 private static MyClass obj = null;
	
	 private MyClass() {
	
	 }
	
	 public static MyClass getInstance() {
	 if (obj == null) {
	 obj = new MyClass();
	 }
	 return obj;
	
	 }

	/* 더 간단하게 class가 바인딩될 때 생성 */
	// private static MyClass obj = new MyClass();
	//
	// private MyClass() {
	//
	// }
	//
	// public static MyClass getInstance() {
	// return obj;
	// }

	/*
	 * 이 경우 // 스레드가 obj를 얻기 위해선 getInstance()를 불러야 함. // 여러 개의 멀티 스레드가 동시에 접근하면
	 * obj가 여러 개 생길 수 있음 // getInstance()를 임계구역으로 만든다. -> synchronized로!!
	 */
//	private static MyClass obj = null;
//
//	private MyClass() {
//
//	}
//
//	public static synchronized MyClass getInstance() {
//		if (obj == null) {
//			obj = new MyClass();
//		}
//		return obj;
//	}

}

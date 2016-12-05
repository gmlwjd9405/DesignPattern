package singletonEx;

public class MyClass {
	/* obj�� ������ ���� */
	 private static MyClass obj = null;
	
	 private MyClass() {
	
	 }
	
	 public static MyClass getInstance() {
	 if (obj == null) {
	 obj = new MyClass();
	 }
	 return obj;
	
	 }

	/* �� �����ϰ� class�� ���ε��� �� ���� */
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
	 * �� ��� // �����尡 obj�� ��� ���ؼ� getInstance()�� �ҷ��� ��. // ���� ���� ��Ƽ �����尡 ���ÿ� �����ϸ�
	 * obj�� ���� �� ���� �� ���� // getInstance()�� �Ӱ豸������ �����. -> synchronized��!!
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

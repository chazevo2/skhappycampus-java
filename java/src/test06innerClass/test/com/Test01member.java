package test06innerClass.test.com;

public class Test01member {

	String name = "kim";
	
	public void aaa() {
		Inner inner = new Inner();
		inner.test();
	}
	
	// ��� ���� �ڿ� ���� �ʿ�� inner class ���
	public class Inner {
		String tel = "010";
		
		public void test() {
			System.out.println(name);
		}
	}

}

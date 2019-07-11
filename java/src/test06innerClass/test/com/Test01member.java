package test06innerClass.test.com;

public class Test01member {

	String name = "kim";
	
	public void aaa() {
		Inner inner = new Inner();
		inner.test();
	}
	
	// 상속 없이 자원 공유 필요시 inner class 사용
	public class Inner {
		String tel = "010";
		
		public void test() {
			System.out.println(name);
		}
	}

}

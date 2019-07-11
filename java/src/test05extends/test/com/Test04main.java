package test05extends.test.com;

public class Test04main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello interface");

		System.out.println(Test04inter01.USER_NAME);
		Test04inter01.test02();

		Test04inter01 t01 = new Test04inter01() {

			@Override
			public void test03() {
				// TODO Auto-generated method stub
				System.out.println("override test03()");
			}
		};
		t01.test01();
		t01.test03();
		System.out.println();
		
		Test04inter01 t02 = new Test04inter01Impl();
		t02.test01();
		t02.test03();
		System.out.println();
		
		Test04inter01Impl t01impl = new Test04inter01Impl();
		t01impl.test01();
		t01impl.test03();
		System.out.println();
		
		Test04inter02 t02impl = new Test04inter02Impl();
		int result01 = t02impl.insert();
		int result02 = t02impl.update();
		int result03 = t02impl.delete();
		int result04 = t02impl.select();
		
	}

}

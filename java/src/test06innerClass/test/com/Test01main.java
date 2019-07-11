package test06innerClass.test.com;

import test06innerClass.test.com.Test01member.Inner;

public class Test01main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello Inner Class");

		// member inner class
		Inner inner = new Test01member().new Inner();
		inner.test();

		// static inner class
		System.out.println(Test02static.Inner.tel);
		Test02static.Inner inner2 = new Test02static.Inner();
		inner2.test();

		// local inner class
		class LocalInner {
			public void bbb() {
				System.out.println("bbb()");
			}
		}
		LocalInner localInner = new LocalInner();
		localInner.bbb();

		// anonymous inner class
		Test01main main = new Test01main() {
		};
		
		aaa(main);// main�� ���� ó���� ���� ��
		aaa(new Test01main() {// ������ �Ͽ� aaa�� ó�� �� ��
		});
		
	}

	public static void aaa(Test01main m) {

	}

}

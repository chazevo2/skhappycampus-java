package test05extends.test.com;

public class Test01extends /* extends Object */ {

	public void aaa() {
		System.out.println(toString());
		/* this. */bbb();
		/* Test01extends. */ccc();
	}

	public void bbb() {
		System.out.println("bbb()...");
	}

	public static void ccc() {
		System.out.println("ccc()...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello 상속!! extends/implements");

		// 단일 상속
		// class extends another class - 단 한개의 class만 상속
		// interface extends another interface - ~ interface만 상속
		// 다중 상속
		// class implements interface1, interface2... - 여러 개의 interface 상속 가능

		Test01extends test01extends = new Test01extends();
		test01extends.aaa();

		System.out.println(Test01aaa.name1);// static
		Test01aaa ta = new Test01aaa();
		System.out.println(ta.name2);
	}

}

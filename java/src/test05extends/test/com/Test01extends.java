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
		System.out.println("Hello ���!! extends/implements");

		// ���� ���
		// class extends another class - �� �Ѱ��� class�� ���
		// ���� ���
		// class implements interface1, interface2... - ���� ���� interface ��� ����
		// interface extends another interface, others, ... 

		Test01extends test01extends = new Test01extends();
		test01extends.aaa();

		System.out.println(Test01AAA.name1);// static
		Test01AAA ta = new Test01AAA();
		System.out.println(ta.name2);
	}

}

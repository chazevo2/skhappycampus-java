package test05extends.test.com;

public class Test03AbsEx extends Test03Abs {

	public Test03AbsEx() {
		System.out.println("Test03AbsEx()");
	}

	@Override
	public void run() {// �߻� �޼ҵ� ����
		// TODO Auto-generated method stub
		System.out.println("Test03Ex inner");
	}

}

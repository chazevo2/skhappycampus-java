package test05extends.test.com;

public class Test03main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abstract!!");

		Test02BBB tb = new Test02CCC();// ����� �̿��� ������

		Test02BBB tb2 = new Test02BBB() {
			int x;

			public void aaa() {
			}

			@Override
			public void bbb() {
				// TODO Auto-generated method stub
				super.bbb();
			}
		};

		// ĳ���� - �� ��ȯ
		// �ٿ� ĳ���� (child)parent, �� ĳ���� (parent)child

		Test03AbsEx absEx = new Test03AbsEx();
		absEx.run();
		System.out.println();

		// �߻�Ŭ������ ��ü ���� �Ұ���
		/* Test03Abs abs = new Test03Abs(); */
		Test03Abs abs = new Test03Abs() {// anonymous inner class

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("anonymous inner");
			}
		};
		abs.run();
		System.out.println();

		// ������
		Test03Abs abs2 = new Test03AbsEx();
		abs2.run();
	}
}

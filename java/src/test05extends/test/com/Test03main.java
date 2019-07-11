package test05extends.test.com;

public class Test03main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abstract!!");

		Test02BBB tb = new Test02CCC();// 상속을 이용한 다형성

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

		// 캐스팅 - 형 변환
		// 다운 캐스팅 (child)parent, 업 캐스팅 (parent)child

		Test03AbsEx absEx = new Test03AbsEx();
		absEx.run();
		System.out.println();

		// 추상클래스는 객체 생성 불가능
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

		// 다형성
		Test03Abs abs2 = new Test03AbsEx();
		abs2.run();
	}
}

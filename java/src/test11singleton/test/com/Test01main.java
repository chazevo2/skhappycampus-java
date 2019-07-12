package test11singleton.test.com;

public class Test01main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test01Singleton t1 = Test01Singleton.getInstance();
		Test01Singleton t2 = Test01Singleton.getInstance();

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1 == t2);

		System.out.println(TestEnum.BMW);
		TestEnum te = TestEnum.BMW;
		switch (te) {
		case BMW:
			System.out.println("good");
			break;
		case RL:
			System.out.println("oh oh oh good");
			break;
		default:
		}
	}

}

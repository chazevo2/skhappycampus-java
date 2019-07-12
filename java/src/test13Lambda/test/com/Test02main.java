package test13Lambda.test.com;

public class Test02main {

	public static void run(FunInter fi) {
		fi.test();
	}

	public static void run2(FunInter2 fi2) {
		System.out.println(fi2.test("kim"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Funtional Interface");

//		FunInter fi = new FunInter() {
//			@Override
//			public void test() {
//				// TODO Auto-generated method stub
//				System.out.println("test()...");
//			}
//		};

		FunInter fi = () -> System.out.println("test()...");
		run(fi);
		run(() -> System.out.println("test()..."));

		FunInter2 fi2 = ( x) -> {
			System.out.println(x);
			return "hello " + x;
		};
		run2(fi2);
		run2((x) -> {
			System.out.println(x);
			return "hello " + x;
		});
		
	}

}

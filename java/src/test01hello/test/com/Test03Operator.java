package test01hello.test.com;

public class Test03Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Operator...");

		// 1.대입(할당)연산자 =, +=, -=, *=, /=, %=, &=, |=, ^=, ...
		int x = 10;
		int y = 3;
		int z = x & y;
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println("z:" + z);

		x &= y;
		System.out.println("x:" + x);
		x += y;
		System.out.println("x:" + x);

		// 2.비트연산자 &, |, ^
		System.out.println(10 & 3);
		System.out.println(10 | 3);
		System.out.println(10 ^ 3);

		// 3.논리연산자 &, |, &&, ||
		System.out.println(true & false);
		System.out.println(false & true);

		System.out.println(true && false);
		System.out.println(false && true);

		System.out.println(true | false);
		System.out.println(true || false);

		// 4.비교연산자 ==, !=, >, <, >=, <=
		System.out.println(5 == 5);
		boolean bool = 5 == 5;
		bool = true & false;
		System.out.println((true & false) || true);
		
		// 5.쉬프트연산 >>, <<, >>>
		System.out.println(8>>2);
		
		// 6.삼항연산 (비교 or 논리)?(참값):(거짓값)
		System.out.println(5==55?"참":"거짓");
		System.out.println(5==55?"참1":5==5?"참2":"거짓");
	}

}

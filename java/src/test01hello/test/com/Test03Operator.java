package test01hello.test.com;

public class Test03Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Operator...");

		// 1.����(�Ҵ�)������ =, +=, -=, *=, /=, %=, &=, |=, ^=, ...
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

		// 2.��Ʈ������ &, |, ^
		System.out.println(10 & 3);
		System.out.println(10 | 3);
		System.out.println(10 ^ 3);

		// 3.�������� &, |, &&, ||
		System.out.println(true & false);
		System.out.println(false & true);

		System.out.println(true && false);
		System.out.println(false && true);

		System.out.println(true | false);
		System.out.println(true || false);

		// 4.�񱳿����� ==, !=, >, <, >=, <=
		System.out.println(5 == 5);
		boolean bool = 5 == 5;
		bool = true & false;
		System.out.println((true & false) || true);
		
		// 5.����Ʈ���� >>, <<, >>>
		System.out.println(8>>2);
		
		// 6.���׿��� (�� or ��)?(����):(������)
		System.out.println(5==55?"��":"����");
		System.out.println(5==55?"��1":5==5?"��2":"����");
	}

}

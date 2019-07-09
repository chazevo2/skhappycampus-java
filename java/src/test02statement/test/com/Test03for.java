package test02statement.test.com;

public class Test03for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for");

		int count = 3;
		for (int i = 0; i < count; i++) {
			System.out.println(i);
			for (int j = 0; j < count; j++) {
				System.out.println(j);
			}
		}

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
		}

		for (int i = 2; i < 10; i++) {
			System.out.print(i + "´Ü: ");
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j + " ");
			}
			System.out.println();
		}
	}

}

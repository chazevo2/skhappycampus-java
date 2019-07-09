package test02statement.test.com;

public class Test04while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("while");

		boolean x = true;
		int count = 0;
		while (x) {
			System.out.println("do while" + count);
			count++;
			if (count > 10)
				break;
		}

	}

}

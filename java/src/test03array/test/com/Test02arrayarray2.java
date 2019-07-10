package test03array.test.com;

public class Test02arrayarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("array array");

		String[][] strs = new String[4][3];
		for (int i = 0; i < strs.length; i++) {
			strs[i] = new String[] {"홍길동", "최길동", "박길동"};
		}
		
		for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < strs[i].length; j++) {
				System.out.print(strs[i][j] + " ");
			}
			System.out.println();
		}

	}

}

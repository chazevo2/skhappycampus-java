package test03array.test.com;

public class Test01array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("array2");

		// �迭 : ����(�ε���), ����(���-�⺻Ÿ��,����Ÿ��) Ű����[], �ش簪��{}

		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0)
				nums[i] = (i + 1) * 10;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		String[] names = new String[4];
		names[0] = "kim";
		names[1] = "lee";
		names[2] = "park";
		names[3] = "choi";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}

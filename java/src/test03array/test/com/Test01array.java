package test03array.test.com;

public class Test01array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("array");

		// �迭 : ����(�ε���), ����(���-�⺻Ÿ��,����Ÿ��) Ű����[], �ش簪��{}
		int[] nums = null;// �ּ� ���� �迭
		System.out.println(nums);
		// NullPointerException

		int nums1[] = { 10, 20, 30, 40 };
		System.out.println(nums1.length);
		System.out.println(nums1[0]);
		System.out.println(nums1[1]);
		System.out.println(nums1[2]);
		System.out.println(nums1[3]);
		// java.lang.ArrayIndexOutOfBoundsException

		int[] nums2 = /* new int[] */ { 10, 20, 30, 40 };
		nums2 = new int[] { 11, 22, 33, 44 };
		System.out.println(nums2[0]);
		System.out.println(nums2[1]);
		System.out.println(nums2[2]);
		System.out.println(nums2[3]);

		int[] nums3 = new int[] { 10, 20, 30, 40 };
		System.out.println(nums3);

		int[] nums4 = new int[4];
		System.out.println(nums4);
		System.out.println(nums4.length);
		System.out.println(nums4[0]);
		System.out.println(nums4[1]);
		System.out.println(nums4[2]);
		System.out.println(nums4[3]);
		
		// int �⺻�� 0
		
		boolean[] bools = new boolean[5];
		System.out.println(bools.length);
		System.out.println(bools[0]);
		System.out.println(bools[1]);
		System.out.println(bools[2]);
		System.out.println(bools[3]);
		System.out.println(bools[4]);
		
		// boolean �⺻�� false
		
		String[] strs = new String[3];
		System.out.println(strs.length);
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		System.out.println(strs[2]);
		
		// String �⺻�� null
	}

}

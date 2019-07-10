package test03array.test.com;

public class Test02arrayarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("array array");

		int[] num = new int[3];
		int[][] nums1 = new int[2][4];// 정적 배열
		System.out.println(nums1);

		int[][] nums2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6, 7 } };// 동적 배열
		System.out.println(nums2);
		System.out.println(nums2[0]);

		int[][] nums3 = new int[][] { num, new int[6], null };
		System.out.println(nums3[0]);
		System.out.println(nums3[1]);
		System.out.println(nums3[2]);

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums1[i].length; j++) {
				nums1[i][j] = nums1[i].length * i + j + 1;
			}
		}
		
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = new int[] { 11, 22, 33, 44, 55 };
		}
		
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums1[i].length; j++) {
				System.out.print(nums1[i][j] + " ");
			}
			System.out.println();
		}

	}

}

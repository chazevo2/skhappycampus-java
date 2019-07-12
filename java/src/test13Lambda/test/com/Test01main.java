package test13Lambda.test.com;

import java.util.Arrays;

public class Test01main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lambda Expression");

		Integer[] sus = new Integer[] { 3, 1, 4, 5, 2 };

//		Arrays.sort(sus);
//		System.out.println(Arrays.toString(sus));

//		Arrays.sort(sus, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o1 - o2;// 오름차순
////				return o2 - o1;// 내림차순
//			}
//		});
		
		// ctrl + 1 람다표현식으로 변경
		Arrays.sort(sus, (o1, o2) -> o1 - o2);
		
		System.out.println(Arrays.toString(sus));
		
		String[] strs = new String[] {"bbb", "ddd", "ccc", "aaa"};
//		Arrays.sort(strs);
//		System.out.println(Arrays.toString(strs));
		
//		Arrays.sort(strs, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
////				return o1.compareTo(o2);// 오름차순
////				return o2.compareTo(o1);// 내림차순
//				return o1.compareTo(o2)*-1;// 내림차순
//			}
//		});
		
		Arrays.sort(strs, (o1, o2) -> o1.compareTo(o2)*-1);
		System.out.println(Arrays.toString(strs));
		
	}

}

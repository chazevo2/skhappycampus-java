package test01hello.test.com;

public class Test02Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부분주석 ctrl + shift + / or \

		// type
		// 기본 타입
		// 1.1byte : byte 0000 0000 : 8bit
		byte byte1 = 0;
		System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);

		boolean bool1 = false;
		System.out.println(Boolean.FALSE + " or " + Boolean.TRUE);

		// 2.2byte
		short short1 = 30000;
		System.out.println(Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);

		char char1 = 0; // 음수 X
		char char2 = 'a';
		System.out.println(Character.MIN_VALUE + " ~ " + Character.MAX_VALUE);
		System.out.println((int) Character.MIN_VALUE + " ~ " + (int) Character.MAX_VALUE);

		// 3.4byte
		int x = 99;
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		float f1 = 3.14f;
		System.out.println(Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		
		// 4.8byte
		long bignum = 30000000000L;
		System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
		double db = 3.141592;
		System.out.println(Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
		
		// 참조 타입
		String name = new String("kim");
		System.out.println(name.hashCode());
		System.out.println("kime".hashCode());
		
		int[] nums = new int[3];
		System.out.println(nums);
		
	}

}

package test03array.test.com;

public class Test03array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("array");

		String string = new String("kim");
		String[] strings = new String[3];
		
		Integer[] integers = new Integer[4];
		for (int i = 0; i < integers.length; i++) {
			integers[i] = i;
		}
		for (int i = 0; i < integers.length; i++) {
			System.out.println(integers[i]);
		}
		
		Test03array[] test03array = new Test03array[2];
		for (int i = 0; i < test03array.length; i++) {
			test03array[i] = new Test03array();
		}
		for (int i = 0; i < test03array.length; i++) {
			System.out.println(test03array[i]);
		}
		
		// byte, short, char, int, long, float, double, boolean
		// String, Wrapper class(Byte, Short, Character, Integer, Long, Float, Double, Boolean)
		// Scanner, BufferedReader, InputStreamReader, InputStream
		// [], [][], {}, {{},{}}
		
		// function(함수, 메소드), 생성자(constructor)
	}

}

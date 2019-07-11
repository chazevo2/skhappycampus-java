package test05extends.test.com;

public class Test02main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("extends");

		Test02BBB tb = new Test02BBB();
		tb.bbb();
		System.out.println(tb.toString());
		System.out.println();

		Test02CCC tc = new Test02CCC();
		System.out.println(tc.name);
		tc.ccc();
		tc.bbb();
		System.out.println();
		
		Test02DDD td = new Test02DDD();
		System.out.println(td);
		System.out.println(td.name);
		System.out.println(td.tel);
		td.ccc();
		td.bbb();
		td.ddd();
	}
}

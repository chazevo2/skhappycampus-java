package test05extends.test.com;

public class Test02CCC extends Test02BBB {
	String name = "choi";

	public Test02CCC() {
		super(88);
		System.out.println("Test02CCC()");
		super.name = "han";
	}
	
	public void ccc() {
		System.out.println("Test02CCC ccc()");
	}
	
	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("Test02ccc bbb()..." + name);
	}

}

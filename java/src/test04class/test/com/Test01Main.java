package test04class.test.com;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("class & object");
		
		Test01Car test01Car = new Test01Car();
		System.out.println(test01Car);
		test01Car.modelName = "bmw";
		test01Car.wheelCnt = 4;
		System.out.println(test01Car.modelName);
		System.out.println(test01Car.wheelCnt);
		
		Test01Drive tDrive = new Test01Drive(test01Car);
		
		test01Car.openDoor("smartkey");
		test01Car.carStart();
		test01Car.carStop();
		boolean isStart = test01Car.eStart("aaaa");
		System.out.println(isStart);
		
		Test01Car test01Car2 = new Test01Car("bus");
		System.out.println(test01Car2);
		
		
	}

}

package test04class.test2.com;

import test04class.test.com.Test01Car;

public class Test01Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("class & object");

		Test01Car test01Car = new Test01Car();
		System.out.println(test01Car);
//		System.out.println(test01Car.modelName);
		// 접근 지정자 default
		Test01Car test01Car2 = new Test01Car("bus");
		System.out.println(test01Car2);


	}

}

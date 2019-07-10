package test04class.test2.com;

public class Test02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Person!!");

		Person person = new Person();
		Person person2 = new Person(1111, "aaa", 30, "011");

		Address address = new Address();
		address.insert(0, person2);
		Person[] persons = address.select();
		System.out.println(persons[0].toString());

	}

}

package test04class.test2.com;

public class Test02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Person!!");

		Person person = new Person();
		Person person2 = new Person(1111, "aaa", 30, "010");
		Person person3 = new Person(2222, "bbb", 28, "011");
		Person person4 = new Person(3333, "ccc", 29, "012");

		Address address = new Address();
		address.insert(person2);
		address.insert(person3);
		address.insert(person4);
		Person[] persons = address.select();
		System.out.println(persons[0].toString());
		System.out.println(persons[1].toString());
		System.out.println(persons[2].toString());

	}

}

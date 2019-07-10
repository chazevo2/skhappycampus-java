package test04class.test2.com;

public class Address {
	Person[] persons = new Person[3];
	
	// ����, �Է� : save, insert
	// ���� : update
	// ���� : delete, remove
	// �˻� : find, search, select

	public Address() {
		System.out.println("Address Book");
	}

	public void insert(int i, Person person) {
		System.out.println("insert Person " + person);
		System.out.println(person.getNum());
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getTel());
		persons[i] = person;
	}
	
	public Person[] select() {
		System.out.println("select");
		return persons;
	}

}

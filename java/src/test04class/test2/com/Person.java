package test04class.test2.com;

public class Person {
	// Test02Person
	private int num;// ��ȣ
	private String name;// �̸�
	private int age;// ����
	private String tel;// ��ȭ��ȣ

	public Person() {// �⺻ ������, �� �ʱ�ȭ
		System.out.println("Person()");
		num = 1234;
		name = "no name";
		age = 20;
		tel = "010";
		System.out.println(this.toString());
	}

	public Person(int num, String name, int age, String tel) {
		System.out.println("Person(int num, String name, int age, String tel)");
		this.num = num;
		this.name = name;
		this.age = age;
		this.tel = tel;
		System.out.println(this.toString());
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return ">> Person [num=" + num + ", name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}

}

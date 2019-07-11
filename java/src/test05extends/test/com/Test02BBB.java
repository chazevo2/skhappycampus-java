package test05extends.test.com;

public class Test02BBB {
	String name;
	int x;

	public Test02BBB() {
		System.out.println("Test02BBB()");
		name = "yang";
	}

	public Test02BBB(int x) {
		this();
		this.x = x;
		System.out.println("Test02BBB(int x)");
	}

	public Test02BBB(int x, int y) {
		this(99);
		System.out.println("Test02BBB(int x)");
	}

	public void bbb() {
		System.out.println("Test02BBB bbb()..." + name);
	}

	@Override // annotation
	public String toString() {
		return "Test02bbb [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test02BBB other = (Test02BBB) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

package test11singleton.test.com;

public class Test01Singleton {
	private static Test01Singleton singleton = new Test01Singleton();

	private Test01Singleton() {
	}

	public static Test01Singleton getInstance() {
		return singleton;
	}
}

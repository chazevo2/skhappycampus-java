package test05extends.test.com;

import java.io.Serializable;

public interface Test04inter01 extends Serializable {
	// 추상클래스 - 단일상속만 가능 / 인터페이스 - 다중상속 가능
	// interface 전역변수 - public static final
	/* public static final */String USER_NAME = "kim";

	// method - default, static, abstract
	public default void test01() {
		System.out.println("default test01()");
	}

	public static void test02() {
		System.out.println("static test02()");
	}

	public /* abstract */ void test03();
}

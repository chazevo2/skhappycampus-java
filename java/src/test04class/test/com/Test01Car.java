package test04class.test.com;

public class Test01Car {
	// 속성 : attribute, property, member field, 전역변수
	// 접근지정자
	// private - 같은 클래스
	// protected - 같은 패키지 내 상속
	// default - 같은 패키지
	// public - 모든 접근
	String modelName;// 모델명
	String color;// 색상
	int wheelCnt;// 바퀴수
	Double handle;// 핸들사이즈
	int power;// 마력
	String fuel;// 연료종류

	public Test01Car() {// 기본
	}

	public Test01Car(String type) {// 특수 자동차

	}

	void openDoor(String key) {// 문열기
		System.out.println("open door:" + key);
		if(key.equals("smartkey")) {
			System.out.println("open");
		} else {
			System.out.println("close");
		}
	}

	boolean eStart(String a) {// 시동
		System.out.println("eStart:" + a);
		return true;
	}

	void carStart() {// 출발
		System.out.println("car start");
	}

	void carStop() {// 정지
		System.out.println("car stop");
	}
}

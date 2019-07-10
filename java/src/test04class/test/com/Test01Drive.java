package test04class.test.com;

public class Test01Drive {// 운전연습
	Test01Car car;// 자동차

	// 형식 매개변수는 parameter이고 실제 전달인자는 argument이다
	public Test01Drive(/* parameter */) {// 기본
	}

	// 생성자, 메소드 오버로딩
	// 매개변수의 개수, 타입, 순서가 다르게 생성
	public Test01Drive(Test01Car car /* 매개변수 */) {// 차 선택
		// 전역변수의 초기화
		// this - 전역변수 지정
		this.car = car;
	}

}

package test02statement.test.com;

import java.util.Scanner;

public class Test03for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for");
		Scanner scanner = new Scanner(System.in);

		int count = 3;
		for (int i = 0; i < count; i++) {
			System.out.println("학생이름을 입력하세요:");
			String name = scanner.next();
			System.out.println("국어 점수를 입력하세요:");
			int kor = scanner.nextInt();
			System.out.println("수학 점수를 입력하세요:");
			int math = scanner.nextInt();
			System.out.println("영어 점수를 입력하세요:");
			int eng = scanner.nextInt();

			int total = kor + math + eng;
			System.out.println(name + "의 점수총합:" + total);
			double avg = total / 3.0;
			System.out.println(name + "의 평균점수:" + avg);

			System.out.print(name + "의 학점:");
			switch ((int) avg / 10) {
			case 10:
			case 9:
				System.out.println("A");
				break;// if를 제외한
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;

			default:
				System.out.println("other");
			}
			System.out.println();
		}

		scanner.close();
	}

}

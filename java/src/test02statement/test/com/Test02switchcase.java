package test02statement.test.com;

import java.util.Scanner;

public class Test02switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("switch~case");
		Scanner scanner = new Scanner(System.in);

		// 값분기
		System.out.println("국어 점수를 입력하세요:");
		int kor = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요:");
		int math = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요:");
		int eng = scanner.nextInt();
		
		int total = kor + math + eng;
		System.out.println("점수총합:" + total);
		double avg = total / 3.0;
		System.out.println("평균점수:" + avg);
		
		System.out.print("학점:");
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

		scanner.close();
	}

}

package test02statement.test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04while2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("while");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String flag = "";
		while (!flag.equals("y")) {
			System.out.println("학생 이름을 입력하세요:");
			String name = br.readLine();
			System.out.println("국어 점수를 입력하세요:");
			int kor = Integer.parseInt(br.readLine());
			System.out.println("수학 점수를 입력하세요:");
			int math = Integer.parseInt(br.readLine());
			System.out.println("영어 점수를 입력하세요:");
			int eng = Integer.parseInt(br.readLine());

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
			System.out.println("계속하려면 y가 아닌 문자 입력 / 종료시 y 입력:");
			flag = br.readLine();
			if (flag.equals("y"))
				break;
		}

	}

}

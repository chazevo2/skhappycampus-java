package test02statement.test.com;

import java.util.Scanner;

public class Test03for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for");
		Scanner scanner = new Scanner(System.in);

		int count = 3;
		for (int i = 0; i < count; i++) {
			System.out.println("�л��̸��� �Է��ϼ���:");
			String name = scanner.next();
			System.out.println("���� ������ �Է��ϼ���:");
			int kor = scanner.nextInt();
			System.out.println("���� ������ �Է��ϼ���:");
			int math = scanner.nextInt();
			System.out.println("���� ������ �Է��ϼ���:");
			int eng = scanner.nextInt();

			int total = kor + math + eng;
			System.out.println(name + "�� ��������:" + total);
			double avg = total / 3.0;
			System.out.println(name + "�� �������:" + avg);

			System.out.print(name + "�� ����:");
			switch ((int) avg / 10) {
			case 10:
			case 9:
				System.out.println("A");
				break;// if�� ������
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

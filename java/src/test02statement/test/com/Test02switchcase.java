package test02statement.test.com;

import java.util.Scanner;

public class Test02switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("switch~case");
		Scanner scanner = new Scanner(System.in);

		// ���б�
		System.out.println("���� ������ �Է��ϼ���:");
		int kor = scanner.nextInt();
		System.out.println("���� ������ �Է��ϼ���:");
		int math = scanner.nextInt();
		System.out.println("���� ������ �Է��ϼ���:");
		int eng = scanner.nextInt();
		
		int total = kor + math + eng;
		System.out.println("��������:" + total);
		double avg = total / 3.0;
		System.out.println("�������:" + avg);
		
		System.out.print("����:");
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

		scanner.close();
	}

}

package test02statement.test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02switchcase2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("switch~case");
		// I/O3�ѻ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ���б�
		System.out.println("���� ������ �Է��ϼ���:");
		int kor = Integer.parseInt(br.readLine());
		System.out.println("���� ������ �Է��ϼ���:");
		int math = Integer.parseInt(br.readLine());
		System.out.println("���� ������ �Է��ϼ���:");
		int eng = Integer.parseInt(br.readLine());
		
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

	}

}

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
			System.out.println("�л� �̸��� �Է��ϼ���:");
			String name = br.readLine();
			System.out.println("���� ������ �Է��ϼ���:");
			int kor = Integer.parseInt(br.readLine());
			System.out.println("���� ������ �Է��ϼ���:");
			int math = Integer.parseInt(br.readLine());
			System.out.println("���� ������ �Է��ϼ���:");
			int eng = Integer.parseInt(br.readLine());

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
			System.out.println("����Ϸ��� y�� �ƴ� ���� �Է� / ����� y �Է�:");
			flag = br.readLine();
			if (flag.equals("y"))
				break;
		}

	}

}

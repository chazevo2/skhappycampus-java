package test09Exception.test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01main {

	public static void main(String[] args) /* throws NumberFormatException, IOException */ {
		// TODO Auto-generated method stub
		System.out.println("Exception!!");

		// ���� ó��(����) : try~catch, throws
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		int x;

		try {
			is = System.in;
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			String name = br.readLine();
			System.out.println("111");
			int kor = Integer.parseInt(br.readLine());
			System.out.println("222");
			x = 30;
			int[] nums = new int[3];
			System.out.println(nums[3]);
		} catch (NumberFormatException e) {// ���� ����
			// TODO Auto-generated catch block
			System.out.println("������ ��������333");
			e.printStackTrace();
		} catch (IOException e) {// �����
			// TODO Auto-generated catch block
			System.out.println("�ȹٷ� �Է��ϼ���444");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("�ΰ��̳׿�~ �ּһ����ϼ���555");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ȹٷ� ��ФФ�");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("�����־�~ �� ã�ƺ�");
			e.printStackTrace();
		} finally {
			x = 100;
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
				}
			if (isr != null)
				try {
					isr.close();
				} catch (IOException e) {
				}
			if (is != null)
				try {
					is.close();
				} catch (IOException e) {
				}
		}
		System.out.println(x);

//		try {
//			String name = br.readLine();
//			int kor = Integer.parseInt(br.readLine());
//		} catch (Exception e) {// ��� ���� ó��
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println("end....");
	}

}

package test04class.test.com;

public class Test01Car {
	// �Ӽ� : attribute, property, member field, ��������
	// ����������
	// private - ���� Ŭ����
	// protected - ���� ��Ű�� �� ���
	// default - ���� ��Ű��
	// public - ��� ����
	String modelName;// �𵨸�
	String color;// ����
	int wheelCnt;// ������
	Double handle;// �ڵ������
	int power;// ����
	String fuel;// ��������

	public Test01Car() {// �⺻
	}

	public Test01Car(String type) {// Ư�� �ڵ���

	}

	void openDoor(String key) {// ������
		System.out.println("open door:" + key);
		if(key.equals("smartkey")) {
			System.out.println("open");
		} else {
			System.out.println("close");
		}
	}

	boolean eStart(String a) {// �õ�
		System.out.println("eStart:" + a);
		return true;
	}

	void carStart() {// ���
		System.out.println("car start");
	}

	void carStop() {// ����
		System.out.println("car stop");
	}
}

package test04class.test.com;

public class Test01Drive {// ��������
	Test01Car car;// �ڵ���

	// ���� �Ű������� parameter�̰� ���� �������ڴ� argument�̴�
	public Test01Drive(/* parameter */) {// �⺻
	}

	// ������, �޼ҵ� �����ε�
	// �Ű������� ����, Ÿ��, ������ �ٸ��� ����
	public Test01Drive(Test01Car car /* �Ű����� */) {// �� ����
		// ���������� �ʱ�ȭ
		// this - �������� ����
		this.car = car;
	}

}

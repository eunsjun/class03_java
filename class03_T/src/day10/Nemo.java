package day10;

public class Nemo {
	int garo, sero ;
	
	// JVM�� �⺻ ������ �Լ��� �ڵ����� ������ִ� ����
	// �������Լ��� �ƹ��͵� ���� ���� �ʾ�����쿡 ���ؼ��� �����.

	// �����͸� �Է����� �ʰ� ������ �Լ��� ȣ���ϴ� ���
	// �� ���� ������ ���ϴ� ���� �����Ϳ� �������ش�.
	public Nemo() { // �⺻ ������ �Լ�
		garo = 10; // this.garo = 10;
		sero = 10; // this.sero = 10;
	}
	
	public Nemo(int no1, int no2) {
		garo = no1;
		sero = no2;
	}
	
	// ���� �����ִ� �Լ�
	public int myunjuk() {
		return garo * sero;
	}

}

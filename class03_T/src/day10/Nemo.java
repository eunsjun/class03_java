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
	
	// ������ �Լ� �����ε�..
	public Nemo(float no1, float no2) {
		garo = (int) no1;
		sero = (int) no2;
	}
	
	// ���� �����ִ� �Լ�
	public int myunjuk() {
		return garo * sero;
	}
	
	// ���� �����ִ� �Լ� 2
	public String myunjuk(String sno1, String sno2) {
		String value = "";
		int no1 = Integer.parseInt(sno1);
		int no2 = Integer.parseInt(sno2);
		value = (no1 * no2) + "";
		return value;
	}
	
	public float myunjuk(float no1, float no2) {
		return no1 * no2;
	}

}

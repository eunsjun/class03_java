package day10;

public class Semo {
	int wid, heig;
	
	// �⺻ ������ �Լ�
	public Semo() {
	}
	
	// ���� �ʱ�ȭ���ִ� �Լ�(������ �Լ�)
	public Semo(int no1, int no2) {
		wid = no1;
		heig = no2;
	}
	
	// ���� �����ִ� �Լ�
	public float getArea() {
		return wid * heig / 2f;
	}
}

package day13;

public class Test01 {

	public Test01() {
		// �ٸ� Ŭ������ ����� �ҷ����� ���
		//		�ش� Ŭ���� Ÿ���� ������ ����� �ν��Ͻ��� ���� �����Ѵ�.
		Test01_1 test = new Test01_1();
		// ���� test ������ �Էµ�  �ν��Ͻ��� ������� ��� ��� �����ϴ�.
//		int no1 = test.no1;
		int no2 = test.no2;	// ������ ��Ű�� �������� ��𼭵��� ����...
		int no3 = test.no3 ; // ��ӹ��� Ŭ������ �׸��� ���� ��Ű�� �������� ����
		int no4 = test.no4;		// ��𼭵��� ���� ����...
		
	}

	public static void main(String[] args) {
		new Test01();
	}
}

class Test01_1 {
	/*
	 * 		���� ���� ����]
	 * 			[����������]	[�Ӽ�]		������Ÿ��		�����̸� ;
	 */
	private int no1 = 10;
	int no2 = 20;
	protected int no3 = 30;
	public int no4 = 40 ;
	
	/*
	 * toString() Overriding : toString() �� Objet Ŭ������ ������ �ִ� �Լ��̰�
	 * 							�츮�� ����� ��� Ŭ������ �ֻ���Ŭ������ Object Ŭ�����̹Ƿ�
	 * 							�̰�� �Լ��� �������̵� �ϴ� ��쿡 �ش��Ѵ�.
	 * public String toString() {
	 * 
	 * return ""; }
	 */
}

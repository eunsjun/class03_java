package day02;

public class Test05 {

	public static void main(String[] args) {
		long l1 = 65;
		int num1 ;
		
		num1 = (int) l1;
		
		float num2 = 3.14f;
		
		double num3 = num2;
		
		/*
		 * Ÿ���� ũ��
		 * 	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		 */
		
		
		float no1 = 10 ;	// �Ǽ��� ��� �����ڷ������� �׻� ũ�⶧���� �ڵ� ����ȯ�� �̷������.
		
		float no2 = 10.f ; // ���ͷ�Ǯ�� float Ÿ������ �������Ѽ� ���� �ϰ� ������ ��´�.
		
		int no3 = (int) 3.14;
		System.out.println("no3 : " + no3);
		
		float no4 = no3;
		System.out.println("no4 : " + no4);
		
	}

}

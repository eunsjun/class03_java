package day02;

public class Test06 {
/*
 * �ڹٿ����� ������ �ѹ� �����̵Ǹ�
 * ���� �̸����� �ٽ� ���� �� �� ����.
 * 
 */
	public static void main(String[] args) {
		int no1 = 14;
		int no2 = 5;
		
		int calc01 = no1 / no2 ;
		int calc02 = no1 % no2 ;
		
		System.out.println("no1 / no2 = " + calc01);
		System.out.println("no1 % no2 = " + calc02);
		
		
		float no3 = (float) (no1/no2);
		float no4 = no1 / (float) no2;
		/*
		 * int ������ ������ ����� int �̴�.
		 * 
		 * int�� float�� ������ float Ÿ���� ��ȯ�̵ȴ�.
		 * 
		 */
		
		System.out.println("no3 : " + no3);
		System.out.println("no4 : " + no4);
		
	}

}

package day04;

public class Test07 {

	public static void main(String[] args) {
		/*
		 * ���� 1]
		 * ������ 5�ڸ� ���ڸ� ����
		 * �� ���ڿ� �ش��ϴ� �ݾ��� �����ؾ� �ϴµ�
		 * 10000, 5000, 1000, 100, 10, 1 ����� �����Ϸ��Ѵ�.
		 * �� ���� ȭ�� ������ �ҿ�Ǵ��� ����ϼ���.
		 * 
		 *  16700 ==>  10000 - 1
		 *  			5000 - 1
		 *  			1000 - 1
		 *  			 100 - 7
		 * 
		 */
		
		int money = (int)(Math.random()*90000) + 10000;
		money = 34567;
		
		int man ; // money / 10000
		int ochun; // (money % 10000) / 5000
		int chun;
		int bek;
		int ten;
		int il;
		
		/*
		 * % ==> 
		 * 	no1 , no2
		 * 
		 * no1 % no2 ==> no1 - (no1 / no2)
		 * 
		 */
		
		
		man = money / 10000; // 3
		ochun = (money % 10000) / 5000; // 4567 / 5000 ==> 0
		chun = money % 5000 / 1000 ; // 4567 / 1000 ==> 4
		bek = money % 1000 / 100; //  
		ten = money % 100 / 10 ;
		il = money % 10 ; // 4567 / 10
		
	}

}

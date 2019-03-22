package day04;

public class Test07 {

	public static void main(String[] args) {
		/*
		 * 문제 1]
		 * 랜덤한 5자리 숫자를 만들어서
		 * 그 숫자에 해당하는 금액을 지불해야 하는데
		 * 10000, 5000, 1000, 100, 10, 1 지폐로 지불하려한다.
		 * 각 단위 화폐가 몇장이 소요되는지 계산하세요.
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

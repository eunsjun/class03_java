package day02;

public class Test06 {
/*
 * 자바에서는 변수가 한번 선언이되면
 * 같은 이름으로 다시 선언 할 수 없다.
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
		 * int 끼리의 연산은 결과도 int 이다.
		 * 
		 * int와 float의 연산은 float 타입이 반환이된다.
		 * 
		 */
		
		System.out.println("no3 : " + no3);
		System.out.println("no4 : " + no4);
		
	}

}

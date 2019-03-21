package day02;

public class Test07 {
	public static void main(String[] args) {
		int no1 = 1 ;
		int no2 = no1++; // no1 = 1
		
		System.out.println("1. no1 : " + no1); // no1 = 2
		System.out.println("2. no2 : " + no2); // no2 = 1
		System.out.println("3. no1 : " + no1); // no1 = 2
		
		int no3 = ++no1;					// no1 = 3
		System.out.println("4. no3 : " + ++no3); // no3 = 4
		
		int no4 = 10 ; 		// no4 = 10
		int no5 = ++no4;	// no4 = 11, no5 = 11
		System.out.println("5. no4 : " + no4);		// no4 = 11
		System.out.println("6. no5 : " + no5++);	// no5 = 11
		
		/*
		 * 증감연산자( ++ || -- )
		 * 	==> 증감연산자를 기준으로 다음에 오는 변수를 딱 한번만 +1 또는 -1 해준다.
		 * 
		 */
		System.out.println("7. no5 : " + --no5); // no5 = 11
	}
}

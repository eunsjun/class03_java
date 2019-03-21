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
		 * ����������( ++ || -- )
		 * 	==> ���������ڸ� �������� ������ ���� ������ �� �ѹ��� +1 �Ǵ� -1 ���ش�.
		 * 
		 */
		System.out.println("7. no5 : " + --no5); // no5 = 11
	}
}

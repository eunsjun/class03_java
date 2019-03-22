package day04;

public class Test03 {

	public static void main(String[] args) {
		/*
		 * 비트 연산자
		 * 		: 숫자를 비트로 변환후 연산하는 연산자
		 * 		  & - (둘 모두 1일때 1), 
		 * 		  | - (둘중 하나라도 1이면 1), 
		 * 		  ^ - (같으면 0, 다르면 1)
		 */
		int no1 = 6500;
		int no2 = 1234;
		System.out.println("no1 & no2 : " + (no1 & no2));
		System.out.println("no1 | no2 : " + (no1 | no2));
		System.out.println("no1 ^ no2 : " + (no1 ^ no2));
	}

}

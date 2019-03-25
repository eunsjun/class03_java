package day05;

public class Test04_01 {
/*
 * 문제] 
 * 		-100 부터 100 사이의 숫자를 랜덤하게 만들어서
 * 		그 숫자가 양수인지 음수인지 그리고 짝수인지 홀수인지를 
 * 		출력하세요.
 * 
 * 		1. 0 인경우 ==> 양수도 음수도 아닌 경우
 * 		2. 양수인 경우
 * 		3. 음수인 경우
 */
	public static void main(String[] args) {
		int num = (int)(Math.random()*201 - 100);
		
		String msg1 = " 는 양수 ";
		String msg2 = "짝수 입니다.";
		
		if(num == 0 ) {
			msg1 = " 는 양수도 음수도 아닌 ";
			msg2 = "수입니다.";
		}
		
		if(num != 0) {
			if(num < 0) {
				msg1 = " 는 음수 ";
			}
			if(num % 2 != 0) {
				msg2 = "홀수 입니다.";
			}
		}
		
		System.out.println("랜덤하게 발생한 수 " + num + msg1 + msg2);
	}
}

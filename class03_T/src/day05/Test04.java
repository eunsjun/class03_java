package day05;

public class Test04 {
/*
 * 문제]
 * 		숫자 하나를 랜덤하게 만들어서 
 * 		그 숫자가 짝수인지  홀수인지를 출력하세요.
 * 
 * -if 그리고 if ~ else 구문을 사용해서 처리하세요.
 */
	public static void main(String[] args) {
		int num = (int)(Math.random()*201);
		String msg = "홀수 입니다.";
		
		if(num % 2 == 0) {
			msg = "짝수 입니다.";
		}
		
		System.out.println("랜덤하게 발생된 수 " + num + " 은 " +  msg);
		
		// if ~ else 구문
		if(num % 2 == 0) {
			msg = "짝수 입니다.";
		} else {
			// 여기서는 변수 초기화가 이미 되어 있으므로
			// msg 변수에 다른 데이터를 입력하지 않아도 된다.
			// 따라서 실행할 문장이 없다.
		}
		System.out.println("랜덤하게 발생된 수 " + num + " 은 " +  msg);
	}
}

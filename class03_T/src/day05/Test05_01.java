package day05;

/*
 * 		-100 부터 100 사이의 숫자를 랜덤하게 만들어서
 * 		그 숫자가 양수인지 음수인지 그리고 짝수인지 홀수인지를 
 * 		출력하세요.
 * 
 * 		1. 0 인경우 ==> 양수도 음수도 아닌 경우
 * 		2. 양수인 경우
 * 		3. 음수인 경우
 */
public class Test05_01 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*201 - 100);
		String msg ;

/*
		// 여기서부터 잘못 사용된 예
		if(num > 0) {
			msg = "0 보다 큰 수 입니다."; // 이것만 실행된다.
		} else if(num > 20) {
			msg = "20보다 큽니다.";
		} else if(num > 50) {
			msg = "50보다 큽니다.";
		} else {
			msg = "100 보다 큽니다.";
		}
		// 여기까지...
* 
*/
		if(num == 0) {
			msg = " 은 양수도 음수도 아닙니다.";
		} else if(num > 0) { 
			// 이 조건으로 넘어온 경우는 0은 아니라는 이야기이다.
			if(num % 2 == 0) {
				msg = "양수 짝수입니다.";
			} else {
				msg = "양수 홀수입니다.";
			}
		} else {
			// 이 경우는 0도 아니고 0보다 크지 않는 모든 경우
			if(num % 2 != 0) {
				msg = "음수 홀수입니다.";
			} else {
				msg = "음수 짝수입니다.";
			}
			
		}
		System.out.println(num + " 은 " + msg);
	}

}

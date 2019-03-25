package day05;

public class Test03 {
/*
 * 조건문 형식 2]
 * 		if ~ else 구문
 * 			형식]
 * 				if(조건){
 * 				
 * 				} else {
 * 				
 * 				}
 */
	public static void main(String[] args) {
		// 랜덤하게 1또는 0을 발생해서
				// 0이면 소문자를 랜덤하게
				// 1이면 대문자를 랜덤하게 발생해서 출력하세요.
				
				int no = (int)(Math.random()*2);
				char ch;
				String str;
				
				if(no == 0) {
					str = "소문자로 ";
					ch = (char)(Math.random()*26 + 'a');
				} else {
					str = "대문자로 ";
					ch = (char)(Math.random()*26 + 'A');
				}
				
				// 출력
				System.out.printf("발생된 문자는 %7s%c %5s", str, ch, "입니다.");
				// 이 경우 no 값을 0 아니면 다른 값으로 한정을 해 놨으므로 
				// 변수에 값은 반드시 대입이 된다. 따라서 변수 초기화는 없어도 된다.
	}
}

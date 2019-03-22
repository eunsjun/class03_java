package Homework_0322;


/*
 * 두수를 랜덤하게 발생하는데
 * 		하나는 0 ~ 25 중 하나
 * 		다른하나는 1 또는 2
 * 를 발생해서
 * 
 * 1이 나오면 소문자로
 * 2가 나오면 대문자로 변환해서 출력하세요.
 */
public class Bonus01 {

	public static void main(String[] args) {
		int no1 = (int)(Math.random()*26);
		int no2 = (int)(Math.random()*2) + 1;
		
		char ch = (no2 == 1) ? (char)(no1 + 'a') : (char)(no1 + 'A') ;
		
		System.out.println("발생된 알파벳 : " + ch);
	}

}

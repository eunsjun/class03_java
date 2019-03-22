package Homework_0322;

/*
 * 문제 2]
	0 ~ 255 사이의 문자를 랜덤하게 발생해서 하나의 문자를 만들고
	이 문자가 영문자인지 알아보는 프로그램을 작성하세요.
	
	char ch = (char)(Math.random()* 256);
 */
public class HW_02 {

	public static void main(String[] args) {
		char ch = (char)(Math.random()* 256);
		
		String str = ((ch >= 'A' & ch <= 'Z') | (ch >= 'a' & ch <= 'z')) ? (ch + " 는 영문자 입니다.") : (ch + " 는 영문자가 아닙니다.") ;
		
		System.out.println(str);
	}

}

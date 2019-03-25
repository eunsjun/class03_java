package Homework_0322;

/*
 * 	알파벳을 랜덤하게 발생한 후
	대문자는 소문자로 
	소문자는 대문자로 변환하는 프로그램을 작성하세요.
	
	'A' - 65
	'a' - 97
 */
public class Bonus01_01 {
/*
 * 'a' > 'A'   차는 32
 */
	public static void main(String[] args) {
		// 대문자를 랜덤하게 발생한다.
		// 'A' - 65
		// 'Z' - 
		
		// 소문자와 대문자의 차는 32
		
		char ch0 = (char)((Math.random()*26) + 65); // 대문자를 만든다.
		int no = (int)(Math.random()*2); // 0 - 소문자, 1 - 대문자를 만든다.
		
		//System.out.println((char)('A' + 25));
		
		int num = (no == 0) ? ((char)(ch0 + 32)) : (ch0) ;
		int num1 = (no == 0) ? num - 32 : num + 32 ;
		
		String str = (no == 0) ? "대문자로 바꾸면 " : "소문자로 바꾸면 " ;
		
		System.out.println("랜덤하게 만들어진 문자 " + (char)num + " 를 " + str + (char)num1 + " 입니다." );
	}

}

package day04;

public class Test02 {

	public static void main(String[] args) {
		int no = 3 ;
		char ch = 'A';
		char ch2 = (65 + 3);
		
		no += ch;
		
		System.out.println("no : " + no);
		System.out.println("ch : " + ch2);
		
		/*
		 * String (문자열)
		 * 		- 기본 데이터타입이 절대로 아니다.
		 * 		- String 이라는 클래스로 문자열을 다루는 클래스이다.
		 * 
		 * 만드는 방법
		 * 		String 변수이름;
		 * 		String 변수이름 = "문자열";		- 리터럴 기억
		 * 		String 변수이름 = new String();	- 객체주소
		 */
		
		String str1 = "abcd";
		String str2 = "abcd";
		String str3 = new String("abcd");
		String str4 = new String("abcd");
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str3 == str4 : " + (str3 == str4));
		
		// str3와 str4 의 데이터 비교
		boolean bool = str3.equals(str4);
		System.out.println("str3 equals str3 : " + bool);
		
	}

}

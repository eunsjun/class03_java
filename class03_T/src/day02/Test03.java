package day02;

public class Test03 {

	public static void main(String[] args) {
		boolean bool ;	
		// 변수 선언 , 1byte 논리값을 담을 변수를 만들었고 
		// 메모리를 1byte 할당 받았다.
		bool = true ;	// 데이터 입력
		
		boolean bool1 = false ;
		// 변수 선언과 동시에 초기화를 해줬다.(데이터도 입력했다.)
		
		System.out.println("참거짓 1 : " + bool); //자바에서 문자열 연결은 + 로 한다.
		System.out.println("참거짓 2 : " + bool1);
		
		char ch1 = 'A';
		char ch2 = 66 ;
		System.out.println("문자 1 : " + ch1);
		System.out.println("문자 2 : " + ch2);
		
	}

}

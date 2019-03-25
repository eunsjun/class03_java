package day05;

public class Test01 {
/*
 * 형식화된 출력 - printf()
 * 
 * 		형식]
 * 			System.out.printf(표현형식, 데이터1, 데이터2, ...);
 * 
 *  
 *  		표현형식 의 지시자
 *  			1. %b		- 논리값(boolean)
 *  			2. %d		- 10진수(정수숫자)
 *  			3. %o		- 8진수
 *  			4. %x, %X	- 16진수
 *  			5. %f		- 실수 10진수
 *  			6. %c		- 문자
 *  			7. %s		- 문자열
 *  			8. %e, %E	- 지수형태
 */
	public static void main(String[] args) {
		System.out.printf("%d. %s : %c 문자", 65, "첫번째", 'A');
		// 표현형식 지시자 순서대로 데이터를 입력해야 한다.
		System.out.println();
		System.out.println();
		System.out.printf("파이의 값은 %.2f 입니다.", 3.141592);
		
		System.out.println();
		System.out.printf("%s : %d \r\n", "jFla", 12);
		
		/*
		 * 이스케이프 문자
		 * 		: 출력은 안되지만 출령 형식에 영향을 미치는 문자...
		 * 		예]
		 * 			줄바꿈 기호 
		 * 		\r\n - 줄바꿈
		 * 		\n 	 - 줄바꿈
		 * 		\b   - 벡스페이스
		 * 		\t   - tab 
		 * 		\"   - 문자열에 " 포함
		 */
		
		System.out.printf("%10s : %4d", "jFla \n", 12);
		
		System.out.println("\" : \\");
		System.out.println("윈도우의 경로는 \"c:\\Windows\" 입니다.");
	}

}

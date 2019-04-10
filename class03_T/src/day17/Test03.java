package day17;

import java.text.*;
public class Test03 {
/*
	형식화 클래스
		==> 주로 결과를 이쁘게 출력하기 위해 사용되어지는 클래스
			
		1. DecimalFomat
			==> 숫자를 형식화 해서 출력하기 위한 클래스
			
			생성방법]
				DecimalFormat(String pattern) 을 주로 사용한다.
				==> 어떤 모양으로 변환시킬지 알려주는 패턴을 먼저 만든다.
				
			주요함수
				format(double number) ==> 숫자를 원하는 형태로 변환 해주는 함수
				
				참고]
					패터지정법 (입력 : 123456.78
						0			- 한자리 숫자를 의미, 무효자릿수도 표시 
							==> 0 	: 123457
								0.0 : 123456.8
								0000000.000 : 0123456.780
								
						#			- 무효자리수는 표시하지 않는다.
							==> # 	: 123457
								#.#	: 123456.8
								#######.###	: 123456.78
						.(point)	- 소수점 위치를 알려준다.
							==>
							 	#.#	:123456.8
						-(dash)		- 음수부호, 음수일경우 -부호의 위치알려준다.
							==>
								#,###,###,###.###-	: 123,456.78-
								-#,###,###.###		: -123,456.78
								
						,			- 단위 구분자 , 세자리마다 표시
						E			- 지수기호, 실수일 경우 지수 형태로 표시
							==>
								#E0					: .1E6  <== E :10 의 n 승
								0E0					: 1E5
								##E0				: 1.2E5
								####E0				: 123.4E3
								#.#E0				: 1.2E5
								
								
						;			- 패턴 구분자, 양수일 경우와 음수일 경우를 구분해서 처리
							
						%			-  백분율
							==> 
								#.#%				: 12345678%
								
						'(작은 따옴표) - escape 문자
							==> 
								#'#,### 			: #123,457
								'#,###				: '123,457
						
						\U00A4		- 통화 기호(화폐단위 표시)
							==> 
								\U00A4 #,###		: ￦ 123,457
				
			
 */
	public Test03() {
		float num = 34256.3545f;
		
		// num 을 세자리마다 , 로 구분해서 보여주고 싶다.
		DecimalFormat pattern = new DecimalFormat("0,000,000.000");
		String sNum = pattern.format(num);
		System.out.println("형식화 처리 0 후 : " + sNum);
		
		DecimalFormat pattern1 = new DecimalFormat("#,###,###.###");
		String sNum1 = pattern1.format(num);
		System.out.println("형식화 처리 1 후 : " + sNum1);
		
		DecimalFormat pattern2 = new DecimalFormat("\u00a4 #,###,###");
		String sNum2 = pattern2.format(num);
		System.out.println("형식화 처리 2 후 : " + sNum2);
		
		DecimalFormat pattern3 = new DecimalFormat("##E0");
		String sNum3 = pattern3.format(num);
		System.out.println("형식화 처리 3 후 : " + sNum3);
		
		
		DecimalFormat pattern4 = new DecimalFormat("#.#E0");
		String sNum4 = pattern4.format(num);
		System.out.println("형식화 처리 4 후 : " + sNum4);
		
		
		DecimalFormat pattern5 = new DecimalFormat("#E0");
		String sNum5 = pattern5.format(num);
		System.out.println("형식화 처리 5 후 : " + sNum5);
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}

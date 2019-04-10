package day17;

import java.text.*;
import java.util.*;

public class Test05 {
/*
	ChoiceFormat
		==> switch case 문 등을 이용해야 할 경우 간소화하기 위한 방식
			즉, 특정 범위의 값은 특정 문자열로 교체해서 출력해주는 기능을 가진 클래스
			
		생성방법]
			ChoiceFormat(double[] limits, String[] formats)
				double[] limits		: 치환될 범위
				String[] formats 	: 치환할 문자
				
	MessageFormat
		==> 특정 문자열에 특정 위치에 내용만 변경되는 경우
			문자열 전체를 만들지 않고
			변경되는 내용만 변화시켜서
			하나의 문자열을 만들어 내는 클래스
			
			예를 들자면
				오라클에 INSERT 명령을 자바로 만들경우
				"INSERT INTO emp VALUES(1234, '전영수', 'STUDENT', ..., 50)"
				"INSERT INTO emp VALUES(1235, '박정헌', 'STUDENT', ..., 50)"
				"INSERT INTO emp VALUES(1236, '강찬규', 'STUDENT', ..., 50)"
			이런 문자열을 입력할 때마다 만들어야 하는 불편함이 있다.
			이런 불편함을 해소하기 위한 클래스가 MessageFormat 클래스이다.
			
		참고함수]
			parse(String source)
			==> 주어진 문자열에서 실제 변화되는 데이터 부분만 알아내는 함수
			
 */
	
	/*
	 * 학생점수를 입력받아서
	 * 학점을 출력하는 프로그램을 작성하세요.
	 */
	
	Scanner sc ;
	int java, oracle, jsp, spring;
	String[] sub = {"java", "oracle", "jsp", "spring"};
	int[] score = new int[4];
	
	
	public Test05() {
		sc = new Scanner(System.in);
		for(int i = 0 ; i < sub.length ; i++) {
			System.out.print(sub[i] + " 점수를 입력하세요 : ");
			try {
				score[i] = sc.nextInt();
			} catch (Exception e) {
				i--;
				continue;
			}
		}
		sc.close();
		
		double[] limits = {0, 60, 70, 80, 90};
		/*
		 		limits 를 만들 때 주의 사항
		 			반드시 오름차순으로 정렬되어야 하고
		 			이것의 의미는 0 ~ 59 까지는 하나의 문자로 바꾸고
		 						  60 ~ 69 까지를 또 하나의 문자로 바꾸고
		 						  70 ~ 79 까지를 또 하나의 문자로 바꾸고
		 						  ...
		 						  90 ~      는 하나의 문자로 바꿔라.. 라는 의미
		 */
		String[] formats = {"F", "D", "C", "B", "A"};
		/*
				formats 만들 때 주의사항
					limits의 갯수와 일치해야 한다.
		 */
		
		ChoiceFormat pattern = new ChoiceFormat(limits, formats);
		
		for(int i = 0 ; i < score.length ; i++) {
			String grade = pattern.format(score[i]);
			System.out.println(sub[i] + "\r\n\t점수 : " + score[i] + "\r\n\t학점 : " + grade);
//			System.out.println(sub[i] + "\r\n\t점수 : " + score[i] + "\r\n\t학점 : " + pattern.format(score[i]));
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}

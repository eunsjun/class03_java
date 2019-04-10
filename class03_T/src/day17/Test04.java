package day17;


import java.text.*;
import java.util.*;
public class Test04 {
/*
	SimpleDateFormat
		==> 날짜 데이터를 형식에 맞춰 문자열로 
			만들어주는 기능을 가진 클래스
			
		패턴 만드는 방법
			
			G	: 연대 ( BC, AD )	
				==> AD
			
			y	: 년도
				==> 2019
				
			M	: 월(1 - 12 또는 1월 - 12월)
				==> 10 || 10월 || OCT
				
			w	: 년의 몇번째 주 ( 1 ~ 53 )
				==> 
				
			W	: 월의 몇번째 주 ( 1 ~ 5 )
				==> 2
				
			D	: 년의 몇번째 일 ( 1 ~ 365 )
				==> 
				
			d	: 월의 몇번째 일 ( 1 ~ 31 )
				==> 10
				
			F	: 월의 몇번째 도래한 해당 요일( 1 ~ 5 ) 
				==> 2
				
			E	: 요일
				==> 수
				
			a	: 오전 | 오후 ( AM | PM )
				==> 오후(PM)
				
			H	: 시간( 0 ~ 23 )
				==> 12
				
			k	: 시간( 0~ 24 )
				==> 12
				
			K	: 시간 ( 0 ~ 11 )
				==> 0
				
			h	: 시간 ( 1 ~ 12 )
				==> 12
			m	: 분 (0 ~ 59 )
			
			s	: 초 (0 ~ 59 )
			
			S	: 천분의 일 초 (0 ~ 999)
			
			z	: Timezone(General Timezone) 
				==> GMT+9:00
				
			Z	: Timezone( RFC 822 timezone )
				==> +0900
				
			'	: escape 문자 (특수문자 표시할 때 사용)
		
 */
	public Test04() {
		Calendar cal = Calendar.getInstance();
		Date date = new Date();
		SimpleDateFormat pattern = 
					new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		String sTime = pattern.format(cal.getTime());
		System.out.println("현재시각 1 : " + sTime);
		
		// sleep() 함수는 예외를 전이하는 함수이므로 
		// 사용할 때는 반드시 예외처리를 해줘야 한다.
/*
		try {
			Thread.sleep(3000);
		} catch(Exception e) {}
*/
		String sTime1 = pattern.format(date);
		System.out.println("현재시각 2 : " + sTime1);
		
		/*
			MessageFormat
		 */
		
		String id= "soo";
		String name = "전영수";
		String tel = "010-9999-9999";
		
		String pattern1 = "회원 ID : " + id + "\n 회원 이름 : " + name + "\n 회원 전화 : " + tel;
		System.out.println(pattern1);

		// 데이터가 들어갈 위치에 {숫자} 를 해주고 숫자는 0부터 데이터갯수 -1 까지 
		pattern1 = "회원 ID : {0} \n 회원 이름 : {1} \n 회원 전화 : {2}";

		String result = MessageFormat.format(pattern1, id, name, tel);

		System.out.println(result);
	}

	public static void main(String[] args) {
		new Test04();
	}

}

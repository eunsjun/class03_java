package day17;

import java.util.*;
public class Test02 {

/*
		Calendar 클래스
		==> Date 클래스의 버젼업 클래스
		
		생성방법
			new Calendar() ==> X : 추상클래스이므로 new 시킬수 없으므로...
			
			getInstance()	==> O : 추상클래스의 인스턴스는 소속함수중
									속성이 static 이고
									반환값이 자기자신(Calendar) 인 
									함수를 통해서 얻어야 한다.
									
			주요함수]
				get(int field)
				==> 필요한 정보를 알려주는 함수
					: int field 에 알고자 하는 내용을 넣어주면
					  그 값에 대해서 알려준다.
					  
					중요]
						Calendar 클래스는 
						각각의 변수가 무엇을 담고있는(무엇을 알기위한) 변수인지를 공부해야 한다.
						변수 : API Documentation 에서
								해당클래스의 Fields Summary
								
				getTime()
				==> Calendar 클래스를 Date 클래스로 변환해주는 함수
					간혹
						Calendar 클래스로 작업을 하다가
						Date 타입으로 변환해줘야 할 경우가 생기는데
						
						Calendar cal = Calendar.getInstance();
						.....
						Date date = cal.getTime();
						
						
			참고]
				API 내의 함수를 사용하다 보면
				문자열로 의미하는 내용을
				int 로 입력해달라고 하는 함수가 보이는데
				이런 경우 99% 정도가
				그 문자열의 의미와 숫자를 연결해 놓은 변수를 가지고 있다는 의미이므로
				그 변수를 사용해서 처리를 해야 한다.
				
		숙제]
			Calendar 클래스의 멤버 함수중
				set(int field, int value)
				getTimeInMills()
				getActualMaximum(int field)
				add(int field, int amount)
				roll(int field, int amount)
				after(Object when)
				before(Object when)
			를 조사하고
			사용예를 적어도 하나씩 만드세요...
			
 */
	public Test02() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1 ;
		int date = cal.get(Calendar.DATE);
		
		System.out.printf("년도 : %4d\r\n월  : %2d\r\n날짜 : %2d", year, month, date);
	}

	public static void main(String[] args) {
		new Test02();
	}

}

package day17;

import java.util.*;
import java.text.*;
public class Test01 {
/*
	Date 클래스
		==> 날짜와 시간을 관리하는 클래스
			
			생성자 함수
				Date()
			==> 현재 시스템의 날짜와 시간을 이용해서 관리
			
		참고]
			이 클래스는 Calendar 클래스가 버전업 클래스이므로
			자바팀에서는 Calendar 클래스 사용을 권장
			하지만 아직도 Date 를 사용해야 하는 함수가 존재하므로
			공부하세요...
 */
	
	/*
	 * 현재 컴퓨터의 날짜와 시간을 출력하세요.
	 */
	
	Date day;
	int year, month, nal, yoil, hour, min, sec;
	String sDay;
	
	public Test01() {
		day = new Date();
		// 년도, 월, 일, 요일, 시간, 분, 초 를 출력하자.
		year = day.getYear() + 1900;
		// 자바에서 Date 타입의 데이터의 시작은 1900 부터 시작하므로
		// 년도를 꺼내고 거기에 1900을 더해줘야 정확한 년도가 나온다.
		month = day.getMonth() + 1;
		// getMonth()는 0월부터 시작하므로 1을 더해줘야 정확한 월이 나온다.
		nal = day.getDate();
		
		yoil = day.getDay();
		// getDay() 는 결과값이 0 ~ 6 을 반환해주고
		// 0 은 일요일이고 6 은 토요일을 의미하므로
		// 적절히 변환해서 사용해야 한다.
		
		// 요일 문자열 만들기
		sDay = getYoil(yoil);
		
		// 시간구하기
		hour = day.getHours();
		// 분 구하기
		min = day.getMinutes();
		// 초 구하기
		sec = day.getSeconds();
		
		// 출력
		toPrint();
		System.out.println(this);
	}
	
	// 요일 뽑아내 주는 함수
	public String getYoil(int y) {
		StringBuffer buff = new StringBuffer();
		switch(y) {
		case 0:
			buff.append("일");
			break;
		case 1:
			buff.append("월");
			break;
		case 2:
			buff.append("화");
			break;
		case 3:
			buff.append("수");
			break;
		case 4:
			buff.append("목");
			
			break;
		case 5:
			buff.append("금");
			break;
		default:
			buff.append("토");
		}
		buff.append("요일");
		return buff.toString();
	}
	
	// 이 클래스의 내용을 물어보면 반환해줄 문자열을 내보내주는 함수
	public void toPrint() {
		System.out.printf("현재 시간은 %4d년 %2d월 %2d일 %3s - %2d시 %2d분 %2d초 입니다.\r\n", year, month, nal, sDay, hour, min, sec);
	}
	public String toString() {
		String pattern = "현재 시간은 {0}년  {1}월 {2}일 {3} - {4}시  {5}분 {6}초 입니다.";
		String str = MessageFormat.format(pattern, year+"", month, nal, sDay, hour, min, sec);
		
		return str;
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}


















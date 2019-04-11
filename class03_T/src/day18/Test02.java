package day18;

import java.util.*;
public class Test02 {

	public Test02() {
		// ArrayList 객체 생성
		ArrayList list = new ArrayList();
		// list 에 데이터 추가
		list.add("전영수");
		list.add("soo");
		list.add("010-1111-1111");
		list.add("학생");
		list.add("제자님 점심 몇그릇 먹었나요???");
		list.add(24);
		
/*
		System.out.println(list);
		
		// list 의 데이터를 형변환해서 꺼내보자.
		for( int  i = 0 ; i < list.size() ; i++ ) {
			Object o = list.get(i);
			
			if(o instanceof String) {
				String str1 = (String) o;
				System.out.println("eunsjun ] " + str1);
			} else if(o instanceof Integer) {
				int num = (int) o;
				System.out.println("soo ] " + (num + 5));
			}
		}
		
		int len = list.size();
		System.out.println(len);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// 인덱스 1 의 데이터 삭제
		list.remove(1);
		len = list.size();
		System.out.println(len);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// 인덱스 1 에 널을 추가해보자
		list.add(1, null);
		len = list.size();
		System.out.println(len);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
*/
		/*
		 * Iterator 사용법
		 * 		1. 컬렉션을 Iterator 로 변환시킨다
		 * 		2. 하나씩 순차적으로 꺼낸다.
		 */
		
		Iterator itor = list.iterator();
		
		while(itor.hasNext()) {	// 다음에 꺼내올 데이터가 있는지 여부 묻는 함수
			Object o = itor.next(); // Iterator 에서 데이터 추출하는 함수
			if(o instanceof String) {
				String str = (String) o; // String 으로 강제 형변환
				System.out.println("문자열 타입 : " + str);
			} else if(o instanceof Integer) {
				int num = (int) o;		// unboxing
				System.out.println("정수 타입 : " + (num + 5));
			}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}

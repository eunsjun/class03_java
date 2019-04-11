package day18;

import java.util.*;
public class Test01 {
/*
	ArrayList
		==> Vector의 신버젼...
			역시 배열형태로 데이터를 관리
			Vector의 특징을 모두 가지고 있다.
			하지만 
				쓰레드에서 동기화처리를 자동으로 해준다.(동기화 처리가 안정적)
			1.2 버젼부터 추가가 된 클래스..
			벡터보다는 ArrayList 를 선호한다.
			
		사용방법 역시 Vector와 유사하다.
		(입출력 함수가 비슷하다.)
		
		참고]
			list 계열의 데이터(변수)를 출력하면 마치 데이터가 나온것처럼 보이지만
			toString() 함수를 자동 호출해서 보여주는 것이고
			toString() 함수를 오버라이드 해놓아서 출력만 될 뿐이다.
			==> 문자열을 얻을 수 있다.
			toString() 함수는 절대로 데이터를 꺼내오는 함수가 아니다.
			
			
		LinkedList
			==> 내부적으로 이중 연결 리스트 방식으로 데이터를 보관하는 컬렉션의 일종
				(다음데이터의 위치를 기억하고 있다.) ==> 검색 속도가 느리다.
				
				장점
					데이터를 중간에 끼어넣는 작업, 삭제 작업은 속도가 빠르다.
				단점
					데이터를 누적시키는 작업에는 속도가 느리다.
					
				주로 데이터의 수정이 빈번한 경우에 많이 사용되는 컬렉션
				
		참고 클래스]
			Iterator
				==> 컬렉션은 많은 클래스들의 집합 이고 그 형태도 다르다.
					하지만 다형성의 원칙에 의해서 서로 형변환이 가능하다.
					이말은 서로 혼용되어서 사용될 수 있다는 뜻이고
					데이터를 꺼내는 방식이 약간씩 달라질 수 있다.
					List에서 데이터를 꺼내는 방식과
					Set에서 데이터를 꺼내는 방식이 다르다.
					
					그래서 컬렉션의 데이터를 꺼내는 용도로만 사용하는 클래스를 따로 만들어 놓았다.
					그 클래스가 Iterator 이다.
					
					즉, List, Set 둘다 Iterator 로 변환 시켜주면
					꺼내는 방식은 Iterator 에서 꺼내는 방식 한가지만 사용하면 될것이다.
						방법]
							1. Iterator 로 변환
							2. 데이터를 꺼낸다.
							
						특징]
							StringTokenizer 와 비슷하게
							순차적으로 꺼낼 수 있고
							한번 꺼낸데이터는 사라진다.
							
							
			Collections 클래스
			==> 컬렉션을 이용할 때 필요한 부가적인 기능을 제공하는 유틸리티적인 클래스
				
				주의]
					List 를 요구하는 함수는 List계열 을 넣어주면 되고
					Set 을 요구하는 함수는 Set계열 컬렉션을 넣어주면 된다.
					Map 을 요구하는 함수는 Map계열 컬렉션을 넣어주면 된다.
					
				참고]
					일반정렬은(sort) 오름차순 정렬이 기본 값이다.
					만약 정렬방식을 변경하고자 하면 sort(List list, Comparator c)를 사용해야 한다.
		
			
 */
	public Test01() {
		List list = new ArrayList();
		
		Collection c = new ArrayList();
		
		HashSet set = (HashSet) list;
		
		for(int i = 0 ; i < 10 ; i++ ) {
			list.add(i);
		}
		
		System.out.println(list.get(0) + " | " + list.get(1));
	}

	public static void main(String[] args) {
		new Test01();
	}

}

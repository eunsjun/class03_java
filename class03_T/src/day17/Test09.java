package day17;

import java.util.*;
public class Test09 {
/*
		Collection
			==> 많은 양의 데이터를 손쉽게 보관할 수 있는 클래스들의 집합
			참고]
				배열의 특징]
					1. 같은 타입의 데이터만 보관할 수 있다.
					2. 만들때 데이터 타입과 갯수를 정해줘야 한다.
					3. 길이가 정해져 있어서 수정이 안된다.
			
			종류]
				1. List 계열
					특징
						a. 입력한 순서를 보장한다.
						b. 데이터를 중복해서 저장할 수 있다.
						
				2. Set 계열
					특징
						a. 입력순서를 보장하지 않는다.
							( 입력할 때 나름의 규칙을 가지고 데이터를 정렬해서 보관한다. )
							따라서 처리속도가 빠르다.
						b. 중복된 데이터가 다시 저장되면 먼저 데이터는 삭제한 후 저장한다.
							==> 중복데이터는 한번만 저장한다.
							
						
				
				3. Map 계열
					특징
						a. 데이터를 그 데이터를 구성하는 키값과 한쌍을 만들어서 저장한다.
						b. 입력순서는 보장하지 못한다.
						c. 같은 키값이 입력되면 먼저 데이터는 삭제한다.
							(데이터는 같아도 되지만 키값은 같은면 안된다.)
							
			참고]
				List, Set 계열은 같은 상위 클래스에서 상속받은 클래스이다.
				Map 계열은 상위클래스가 다르다.
				==> List, Set은 다형성 처리가 가능하지만
					Map은 독립적으로 변환이 불가능하다.
					
		
		-----------------------------------------------------------------------------
		List 계열
			1. Stack		- 칠판 & 교제 설명 참고
			2. Vector		- 내부적으로 배열의 형태로 만들어서 데이터를 저장하는 컬렉션의 한 종류
			3. ArrayList	- Vector 의 신버젼...
			
			
		1. Vector
			==> 내부적으로 배열형태로 만들어서 데이터를 보관하는 컬렉션의 한 종류
				장점
					입력속도와 검색속도가 빠르다.
				단점
					중간에 데이터를 삽입하거나 데이터를 삭제하는 속도는 느리다.
				결론
					==> 데이터의 수정이 거의 업슨 프로그램에서 많이 사용
					
					
			생성방법
				1. Vector()
					==> 배열의 크기를 10으로 정한 상태로 벡터를 만들어 준다.
						물론 데이터가 많아지면 크기는 변경된다.
				2. Vector(Collection c)
					==> 다른 컬렉션의 데이터를 복사해서 벡터를 만들어 준다.
				3. Vector(int initialCapacity)
					==> 사용자가 직접 배열의 크기를 정해서 벡터를 만들어 준다.
				4. Vector(int initialCapacity, int capatityIncrement) ==> ★ 권장
					==> 사용자가 직접 배열의 크기를 정하면서 벡터를 만든다.
						+ 크기를 초과할 경우 추가할 배열의 크기를 정한다.
						
				참고]
					컬렉션은 데이터의 양에 관계없이 항상 데이터를 입력 받을 수 있다.
					이때 데이터를 입력할 공간을 확보해야 하는데
					공간 확보 규칙은
							현재공간 * 2
					가 된다.
					
		주요함수]
			
			1. 데이터 입력 함수
				add(Object e)
				add(int index, Object element)
				addAll(Collection c)
				addAll(int index, Collection c)
				addElement(Object obj)
				insertElementAt(Object obj, int index)
				
			2. 데이터 수정 함수
				set(int index, Object element)
				setElementAt(Object obj, int index)
				
			3. 데이터 추출 함수
				get(int index)
				elementAt(int index)
				firstElement()
				lastElement()
				elements()
				
				
 */
	public Test09() {
		// 벡터 만들기
		Vector v = new Vector(10, 5);
		// 벡터의 처음 용량 얻기
		int len = v.capacity();
		System.out.println("v 처음 용량 : " + len);
		
		// 벡터에 11개 데이터 입력
		for(int i = 0 ; i < 11 ; i++) {
			v.add(i);
		}
		
		// 11 개 데이터가 들어간 후 벡터 용량 얻기
		len = v.capacity();
		System.out.println("v 나중 용량 : " + len);
		
		// 기본 갯수와 증가값으로 벡터 만들기
		Vector vec = new Vector();
		// 용량 얻기
		int len2 = vec.capacity();
		System.out.println("vec 입력 전 용량 : " + len2);
		
		// 데이터 21개 입력
		for(int i = 0 ; i < 21 ; i++) {
			vec.add(i);
		}
		
		// 데이터입력후 용량 얻기
		len2 = vec.capacity();
		// 출력
		System.out.println("vec 입력 후 용량 : " + len2);
		System.out.println(vec.toString());
	}

	public static void main(String[] args) {
		 new Test09();
	}

}

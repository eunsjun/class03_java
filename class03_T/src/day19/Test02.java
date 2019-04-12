package day19;

import etc.*;
import java.util.*;
public class Test02 {
/*
	Set 계열
		입력순서를 보장하지 않는다.
		나름의 규칙에 따라서 내부적으로 정렬해서 보관한다.
		중복된 데이터는 한번만 저장한다.
		(같은데이터가 입력이 되면 
		저장된 데이터는 삭제하고 새로운 데이터를 입력한다.)
		
		
		1. HashSet
			==> HashCode를 이용해서 정렬해서 보관하는 컬렉션
				일반적인 정렬이 이루어 지지 않는다.
				
				대충]
					HashSet(int intialCapacity, float loadtFactor)
					==> loadFactor : 해쉬코드값을 만드는 규칙을 저장한 상수
					해쉬코드값을 만드는 규칙을 사용자가 입력해서 해쉬테이블을 만들어서 사용.
					
				참고]
					Set계열의 컬렉션은 데이터를 추출하는 함수를 가지고 있지 않다.
					==> 왜???
							개발자가 데이터가 저장된 장소를 모르기 때문에
							특정위치를 지정해서 데이터를 꺼낼 수 없다.( 인덱스가 존재하지 않는다.)
							==> 시퀀스 자료형이 아니다.
							
					따라서 데이터를 꺼낼때는 반드시 Iterator 로 변환해서 순차적으로 하나씩 꺼내야 한다.
					
		2. TreeSet
			==> 내부적으로 Tree Sort 라는 알고리즘을 이용해서 데이터를 저장한다.
				
				
			생성방법]
				TreeSet(Comparator comparator)
				==> 정렬방식을 변경해서 TreeSet을 만든다.
				
				TreeSet(SortedSet<E> s)
				==> TreeSet을 이용해서 다시 TreeSet을 만든다.
				
			참고함수]
				subSet()
					==> 하나의 Set에 담긴 내용중에 특정부분만 골라서 새로운 Set을 만들어주는 함수
					
				headSet(E toElement)
					==> 처음부터 지정한 부분까지 골라서 새로운 Set을 만들어주는 함수
					
				tailSet(E fromElement)
					==> 지정한 부분부터 마지막 까지 골라서 새로운 Set을 만들어주는 함수
					
					
 */
	
	// 15개의 문자열을 HashSet에 입려한 후 꺼내서 사용해 보자.
	// 우리반 학생이름을 입력해보자.
	public Test02() {
		// 이름 리스트 받아오기
		ArrayList list = new Class03().getName();
		
		// HashSet 만들고
		HashSet set = new HashSet();
		
		// HashSet 에 데이터 입력하고
		for(Object o : list) {
			// ArrayList 에 문자열을 입력했는데 Object로 자동 형변환이 되서 저장되어 있으니
			// 꺼내게 되면 Object를 꺼내게 된다.
			// 따라서 사용할 때는 정확한 타입으로 강제형변환을 해줘야 한다.
			set.add((String) o);
		}
		
		int size = set.size();
		System.out.println("set.size() : " + size);
		
		// 데이터를 하나씩 꺼내서 출력해보자.
		// Set 은 데이터 추출함수가 없기 때문에 Iterator 로 변환해준후 하나씩 꺼내야 한다.
		
		// Iterator 로 변환
		Iterator it = set.iterator();
		
		// 하나씩 순차적으로 꺼내서 사용한다.
		for(int i = 0 ; it.hasNext(); i++ ) {
			// 꺼내서 변수에 담고
			String name = (String) it.next();
			// 출력한다.
			System.out.println( (i+1)+ " 번 학생 : " + name);
		}
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}

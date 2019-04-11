package day18;

import java.util.*;
public class Test03 {
// 		LinkedList 테스트
	public Test03() {
		LinkedList list = new LinkedList();
		list.add("솔라");
		list.add("화사");
		list.add("휘인");
		list.add("문별");
		
		/* get() 함수 사용하는 방법
		int len = list.size();
		for( int i = 0 ; i < len ; i++) {
			// 지금 list에는 데이터가 한가지 타입으로 저장 되어있으므로
			// 그 한가지 타입으로 강제형변화해서 사용하면 된다.
			String mamamoo = (String) list.get(i);
			System.out.println("마마무 "+ (i+1)+" 번째 멤버 : " + mamamoo);
		}
		System.out.println("	MaMaMoo Forever!!!");
		*/
		
		/*
			Iterator 사용하는 방법
		 */
		Iterator itor = list.iterator();
		int i = 0 ;
		while(itor.hasNext()) {
			String mamamoo = (String) itor.next();
			System.out.println("마마무 "+ (++i)+" 번째 멤버 : " + mamamoo);			
		}
		System.out.println("	MaMaMoo Forever!!!");
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}

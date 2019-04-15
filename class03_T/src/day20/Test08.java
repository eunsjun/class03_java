package day20;

import java.util.*;
public class Test08 {
/*
	Generics
	==> 컬렉션은 모든 형태의 데이터를 모두 입력할 수 있다.
		왜??? <== 매개변수가 Object 이니까...
				  특정타입의 데이터를 입력해도 
				  Object로 자동형변환이 이뤄져서 입력된다.
		따라서 데이터를 사용할 때는 항상 정확한 타입으로 강제형변환을 해줘야 한다.
		
		제너릭스란?
			컬렉션에 입력되는 데이터의 타입을 미리 정하고 입력해서
			나중에 사용할때(꺼낼때) 좀더 편하게 (형변환없이) 사용하도록 해주는 것.
		
		*****
		형식]
			컬렉션타입<데이터타입> 	변수이름;
			변수이름 = new 컬렉션타입<데이터타입>();
			
		참고]
			제너릭스는 전파되지 않는다.
			하나의 컬렉션이 제너릭스 선언이 되었더라도
			그 컬렉션을 사용하는 다른 컬렉션에서는 선언된 제너릭스가 사라진다.
			==> 새로운 컬렉션에서도 제너릭스 선언을 해줘야 한다.
			
			예]
				ArrayList<ArrayList<int>> list;
		
		
		참고]
			특수한 제너릭스
				==> 원래 제너릭스는 특정 클래스(입력할 타입을 한가지로 정한다)만 입력받을 목적으로 사용된다.
				
				형식]
					<? super 클래스이름>
					==> 지정항 클래스이름 포함 상위 클래스까지 허락
					
					<? extends 클래스이름>
					==> 클래스이름 포함해서 하위클래스들 모두 허락
					
					
					===> 이렇게 사용하면 다형구현은 되지만
						 사용할 때는 강제형변환은 해줘야 한다.
		
 */
	public Test08() {
		ArrayList<ArrayList<Integer>> num = new ArrayList<ArrayList<Integer>>();
		// num 이라는 ArrayList에는 Integer 타입의 데이터만 관리할 것이라는 선언...
		for(int i = 0 ; i < 10 ; i++ ) {
			num.add(new ArrayList<Integer>());
			for(int j = 0 ; j < 5 ; j++ ) {
				num.get(i).add((i*20) + j);
			}
		}
		
		for(int i = 0 ; i< num.size(); i++ ) {
			// 만약 num에서 꺼낸 데이터가 Object 라면 + 50 연산은 실패할 것이다.
			// 만약 정수타입으로 꺼낸다면 연산이 성공할 것이다.
			for(int j = 0 ; j < num.get(i).size(); j++) {
				System.out.print(num.get(i).get(j) + 100 + ", ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test08();
	}

}

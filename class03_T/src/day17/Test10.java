package day17;

import java.util.*;
public class Test10 {
/*
		다양한 타입의 데이터를 입력해 보자.
 */
	public Test10() {
		// 벡터를 만든다.
		Vector vec = new Vector();
		
		// 데이터 입력
		vec.add("전영수");	// String
		vec.add(24);		// Integer
		vec.add(Calendar.getInstance());	// Calendar
		vec.add(3.14f);		// Float
		vec.add(false);		// Boolean
		/*
			컬렉션 은 데이터 입력함수의 매개변수 타입이 Object 로 되어 있어서
			모든 데이터 타입을 모두 저장 할 수 있다.
			왜? 모든 클래스의 조상은 Object 이므로...
		 */
		
		String name = (String) vec.get(0);
		System.out.println("Name : " + name);
		
		for(Object o : vec) {
			System.out.println("### " + o);
		}
		
	}

	public static void main(String[] args) {
		new Test10();
	}

}

package day16;


import static java.lang.Math.*;
public class Test02 {

/*
		Math 클래스
			: 
				주로 수학적인 기능을 처리하는 함수로 구성된 클래스
				모든 함수가 static 함수로만 구성되어 있다.
				new 시키지 않아도 사용할 수 있는 클래스
				
				new 시키지 말라고 막아놓은 클래스
				
		숙제]
			Math 클래스의 함수 10가지 조사하세요.
			방법은 어제와 동일...
 */
	public Test02() {
		int num = (int)(random()*51 + 50);
		System.out.println(num);
	}

	public static void main(String[] args) {
		new Test02();
	}

}

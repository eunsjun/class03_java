package day20;

/*
	어노테이션(Annotation)
	==> 내부적으로 약속된 실행을 자동으로 처리하도록 하는 명령의 일종..
		컴파일러에게 알려주는 역할...
		
		주로 화면에 실제 보이는 실행이 아니고
		점검을 한다던지
		선언적인 실행(이 클래스는 이런방식으로 실행하세요...)
		의 의미를 가진 명령을 말한다.
		
		
	형식]
		@명령
		
	예]
		@Override
		==> 이게 붙어있는 함수는 오버라이드를 하는 함수다 라고 컴파일러에게 알려준다.
		
		@SuppressWarnings("unused")
		
		
	
	
 */
import java.util.*;
public class Test09 {
	
	public Test09() {
		@SuppressWarnings({ "rawtypes", "unused" })
		// 커렉션 입력타입 미지정 경고 해제, 사용하지 않는 변수 체크해제
		ArrayList list = new ArrayList();
		
		@SuppressWarnings("unused") // 사용하지 않는 변수 체크 해제
		int num = 10;
	}

	public static void main(String[] args) {
		new Test09();
	}

}

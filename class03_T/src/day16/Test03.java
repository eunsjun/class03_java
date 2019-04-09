package day16;


import java.util.*;
public class Test03 {
/*
		java.util 패키지 소속의 유요한 클래스
			1. Objects
				==> 100% static 함수로만 구성된 클래스
					클래스를 다룰때 유용한 몇가지 유틸리티적인 함수로 구성된 클래스
					
					예]
						isNull(Object obj)
						==> 객체에 내용이 있는지를 확인하는 함수
							new 된 결과가 있는지를 확인하는 함수
						
						확인]
							int num;	// 선언만 해놓은 상태, 아직 데이터의 주소를 저장하지 않은 상태
							
						참고]
							null	 	:
								 주소변수에 주소가 없는 상태를 말하는 것
								 찾아갈 대상이 없다는 말
								 아직 사용할 준비가 안된 상태
								 
		Random 클래스
			==> 난수를 발생하는 클래스
				Math.random() 함수 보다는 보다 다향한 형태의 난수를 발생시킬 수 있다.
				
				참고]
					seed	:
								컴퓨터에서 난수를 발생하는 것은 그 순간 실제로 난수를 만드는 것이 아니고
								이미 컴퓨터 내부에 난수 테이블이 존재하는데
								그 난수 테이블에서 순서대로 꺼내서 보여준다.
								
								seed란?
									난수 테이블에서 난수를 꺼내는 위치를 나타내는 용어
								
 */
	public Test03() {
		Random r = new Random(10);
		// 의미는 난수테이블에서 10 위치에서부터 난수를 꺼내세요
		/*
		 * Random(long seed)
		 */
		// ==> seed를 배정하면 항상 나오는 순서가 동일하다.
		for(int i = 0 ; i < 10 ; i++ ) {
			int num = r.nextInt(100); // ==> 0 ~ 100 사이 난수를 발생
			boolean bool = r.nextBoolean();
			System.out.println(num + " - " + bool);
		}
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}

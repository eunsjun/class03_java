package day11;

public class Test04 {
/*
		멤버변수 초기화
			==> 멤버변수는 Heap 영역에 생기므로 자동 초기화가 된다.
				초기화 값]
					int ==> 0
					float ==> 0.0
					boolean ==> false
					char ==> ' '
					
				경우에 따라서는 변수에 특정값을 채워서 초기화를 해줘야 될 경우도 있다.
				
			방법]
				1. 명시적 초기화
					==> 변수 선언을 하면서 데이터를 입력하는 방법
						가장 먼저 실행되는 방법
						
						예]
							class Test {
								int num = 100;	<== 명시적 초기화
							}
							
				2. 초기화 블럭을 이용한 초기화
					==> 인스턴스 변수에 대해서만 가능한 방법
						두번째로 실행되는 방법
						
						형식]
							{
								데이터를 변수에 입력
							}
							
						예]
							class Test {
								int num;
								
								{
									num = 10 ;	// 초기화 블럭을 이용한 초기화
								}
							}
							
				3. static 블럭을 이용한 초기화
					==> 2번과는 반대로 static 변수에 한해서만 가능한 방법
						두번째로 실행되는 방법
						
						형식]
							static {
								데이터 입력...
							}
							
						예]
							class Test {
								static int num;
								
								static {
									num = 10 ;	// static 블럭을 이용한 초기화
								}
							}
							
							
				4. 생성자 함수를 이용한 초기화
					==> 가장 마지막에 실행되는 방법
					
						예]
							class Test {
								int num;
								
								Test() {
									num = 10;	// 생성자함수를 이용한 초기화
								}
							}
					
					
 */
	public Test04() {
	}

	public static void main(String[] args) {

	}

}

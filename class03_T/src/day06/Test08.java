package day06;

public class Test08 {

	/*
	 * flag 기법 ]
	 * 		break 를 사용하게 되면
	 * 		그 명령이 정상적으로 수행이 됬는지 
	 * 		아니면 중간에 종료가 됬는지 확인할 방법이 없다.
	 * 		이 경우 반복문의 바깥에 변수만들어 놓고
	 * 		초기화를 해놓은 후
	 * 		중간에 종료가 된 경우에 그 변수의 값을 변경하면
	 * 		그 명령문이 정상적으로 모두 수행이 되었는지
	 * 		아니면 중간에 멈췄는지 확인 할 수 있게 된다.
	 * 
	 * 		이 기법을 flag 기법이라 한다.
	 */
	public static void main(String[] args) {
		boolean check = false;
		for(int i = 0; i < 10 ; i++ ) {
			if(i == 5) {
				check = true;
				break;
			}
		}
		if(check == true) {
			System.out.println("*** 프로그램 중간 종료 ***");
		} else {
			System.out.println("*** 프로그램 완전 수행 종료 ***");
		}
	}

}

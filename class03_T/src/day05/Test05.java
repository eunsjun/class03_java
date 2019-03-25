package day05;

public class Test05 {
/*
 * 	if ~ else if(조건) ~ else
 * 		세가지이상 조건이 있을 경우 처리 방법
 * 
 * 	형식]
 * 
 * 		if(조건) {
 * 
 * 		} else if(조건1){
 * 
 * 		} else {
 * 
 * 		}
 * 
 * 	주의]
 * 		코드의 진행방향 (위에서 아래) 에 따라서
 * 		조건이 걸러진다.
 */
	public static void main(String[] args) {
		int num = -100;
		String msg;
		
		
		if(num > 0) {
			msg = "0보다 크다.";
		} else if(num > -50) {
			msg = "-50 보다 크다.";
		} else {
			msg = "-50보다 작다.";
		}
		
		System.out.println(num + " 는 " + msg);
	}
}

package day06;

/*
 * 2 ~ 200 까지 숫자중 소수만 출력하세요.
	소수 : 1과 자신으로만 나누어 떨어지는 숫자
 */
public class Test06 {
	public static void main(String[] args) {
		ori:
		for(int i = 2 ; i < 201 ; i++) {
			for(int j = 2, cnt = 0; j < i ; j++ ) {
				if(i % j == 0 ) {
					// 나누어 떨어지는 수가 나왔다는 이야기 이므로 소수가 아니다.
					continue ori;
				}
			}
			
			System.out.print(i + ", ");
		}
	}
}

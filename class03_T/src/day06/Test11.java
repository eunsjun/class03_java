package day06;

import java.util.Arrays;

public class Test11 {

	public static void main(String[] args) {
		// 숫자 3, 5, 7, 9, 11 을 기억할 배열을 만들어 출력하세요.
		int num[] = new int[] {3, 5, 7, 9, 11};
		
		System.out.println("num 배열 내용 : " + Arrays.toString(num));
		
		// num의 데이터를 2, 4, 6, 8, 10으로 교체하세요.
		for(int i = 0 ; i < num.length ; i++ ) {
			num[i] = 2 * (i + 1);
		}
		System.out.println("변경후 num 배열 내용 : " + Arrays.toString(num));
		
	}

}

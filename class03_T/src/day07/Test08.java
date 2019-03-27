package day07;

import java.util.Arrays;

public class Test08 {
/*
 * 방법2] 
 * 		==> 모두 같은 길이의 배열을 만드는 방법
			초기화까지 같이 하는 방법 - 사각형으로 만드는 방법
					
			데이터타입[][] 변수이름 = new 데이터타입[갯수1][갯수2];
 */
	public static void main(String[] args) {
		int[][] score = new int[3][5];
		
		for(int i = 0 ; i < score.length ; i++ ) {
			System.out.println(Arrays.toString(score[i]));
		}
	}

}

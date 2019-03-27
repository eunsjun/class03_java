package day07;

import java.util.Arrays;

public class Test07 {
/*
	2차 배열]
		: 이제까지 만들었던 배열을 넣어서 관리할 배열 이야기한다.
			
			방법1] ==> 다른 길이의 배열들을 가지고 만드는 방법
				1.	데이터형[][] 변수;
					
					예]
						int[][] num;
						
				2. 
					new 데이터타입[숫자];
					
					데이터타입[][] 변수이름 = new 데이터타입[관리할갯수][];
					
					변수이름[숫자] = 만들어진 1차배열;
					
			방법2] ==> 모두 같은 길이의 배열을 만드는 방법
				초기화까지 같이 하는 방법 - 사각형으로 만드는 방법
					
					데이터타입[][] 변수이름 = new 데이터타입[갯수1][갯수2];
					
 */
	public static void main(String[] args) {
		int[][] num ;
		num = new int[3][];
		
		int[] no1 = new int[3];
		int[] no2 = new int[4];
		int[] no3 = new int[2];
		num[0] = no1;
		num[1] = no2 ;
		num[2] = no3;
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.println("num"+ (i+1)+ " : " + Arrays.toString(num[i]));
		}
	}

}

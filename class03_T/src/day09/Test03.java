package day09;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		int[][] score = new int[15][5];
		
		// 한사람씩 데이터를 입력...
		for(int i = 0 ; i < score.length ; i++ ) {
			// 한과목씩 랜덤하게 점수를 만들어서 입력하자.
			// 총점 구할 변수...
			int sum = 0 ; // sum 초기화...
			for(int j = 0 ; j < score[i].length - 1 ; j++ ) {
				int num = (int)(Math.random()*41 + 60);
				score[i][j] = num;
				sum += num;
			}
			
			// int no = score[i].length - 1;
			score[i][score[i].length -1] = sum;
		}
		// 향상된 for 명령으로 출력해보자.
		/*
		 * 향상된 for 명령은 
		 * 		시퀀스 자료형(배열 또는 List)를
		 * 인덱스 0에서부터 차례로 마지막인덱스까지 꺼내서
		 * 변수에 저장해주는 반복문이다.
		 */
		int cnt = 16;
		for( int[] arr : score ) {
			System.out.println(--cnt + " 번째 배열 : " + Arrays.toString(arr));
		}
	}

}

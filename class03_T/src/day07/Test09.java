package day07;

import java.util.Arrays;

public class Test09 {

	public static void main(String[] args) {
		int[][] no = new int[3][5];
		String[] name ;
		
		int num = 1;
		
		// no 배열에 1 ~ 15까지 넣어보자.
		for(int i = 0 ; i < no.length ; i++) {
			for(int j = 0 ; j < no[i].length ; j++) {
				no[i][j] = num++;
				// team[i][j] = name[num++];
			}
		}
		
		for(int i = 0 ; i < no.length ; i++ ) {
			System.out.println(Arrays.toString(no[i]));
		}
	}

}

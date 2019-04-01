package day10;

/*
 * 우리반 학생들의 자바, 오라클 성적을 입력할 배열을 만들고,
 * 각 학생별 총점을 구하세요.
 */

import java.util.*;
public class HW01 {
	int[][] class03 ;
	
	public HW01() {
		this(15);
	}
	
	public HW01(int no) {
		class03 = new int[no][4];
		for(int i = 0 ; i < class03.length ; i++ ) {
			class03[i][0] = i + 1 ;
		}
	}

}

package day10;

/*
 * �츮�� �л����� �ڹ�, ����Ŭ ������ �Է��� �迭�� �����,
 * �� �л��� ������ ���ϼ���.
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

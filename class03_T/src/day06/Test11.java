package day06;

import java.util.Arrays;

public class Test11 {

	public static void main(String[] args) {
		// ���� 3, 5, 7, 9, 11 �� ����� �迭�� ����� ����ϼ���.
		int num[] = new int[] {3, 5, 7, 9, 11};
		
		System.out.println("num �迭 ���� : " + Arrays.toString(num));
		
		// num�� �����͸� 2, 4, 6, 8, 10���� ��ü�ϼ���.
		for(int i = 0 ; i < num.length ; i++ ) {
			num[i] = 2 * (i + 1);
		}
		System.out.println("������ num �迭 ���� : " + Arrays.toString(num));
		
	}

}

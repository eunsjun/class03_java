package day09;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		int[][] score = new int[15][5];
		
		// �ѻ���� �����͸� �Է�...
		for(int i = 0 ; i < score.length ; i++ ) {
			// �Ѱ��� �����ϰ� ������ ���� �Է�����.
			// ���� ���� ����...
			int sum = 0 ; // sum �ʱ�ȭ...
			for(int j = 0 ; j < score[i].length - 1 ; j++ ) {
				int num = (int)(Math.random()*41 + 60);
				score[i][j] = num;
				sum += num;
			}
			
			// int no = score[i].length - 1;
			score[i][score[i].length -1] = sum;
		}
		// ���� for ������� ����غ���.
		/*
		 * ���� for ����� 
		 * 		������ �ڷ���(�迭 �Ǵ� List)��
		 * �ε��� 0�������� ���ʷ� �������ε������� ������
		 * ������ �������ִ� �ݺ����̴�.
		 */
		int cnt = 16;
		for( int[] arr : score ) {
			System.out.println(--cnt + " ��° �迭 : " + Arrays.toString(arr));
		}
	}

}

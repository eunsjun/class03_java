package day07;

import java.util.Arrays;

public class Test07 {
/*
	2�� �迭]
		: �������� ������� �迭�� �־ ������ �迭 �̾߱��Ѵ�.
			
			���1] ==> �ٸ� ������ �迭���� ������ ����� ���
				1.	��������[][] ����;
					
					��]
						int[][] num;
						
				2. 
					new ������Ÿ��[����];
					
					������Ÿ��[][] �����̸� = new ������Ÿ��[�����Ұ���][];
					
					�����̸�[����] = ������� 1���迭;
					
			���2] ==> ��� ���� ������ �迭�� ����� ���
				�ʱ�ȭ���� ���� �ϴ� ��� - �簢������ ����� ���
					
					������Ÿ��[][] �����̸� = new ������Ÿ��[����1][����2];
					
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

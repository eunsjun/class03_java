package day06;

import java.util.Arrays;

public class Test10 {
/*
 * ���ڵ����͸� 7�� ������ �迭�� ���� ����ϼ���.
 * 
 * �Ǽ� �����͸� ������ ũ�Ⱑ 10�� �迭�� ����� ����ϼ���.
 * 
 * ���� �����͸� ������ ũ�Ⱑ 5�� �迭�� ����� ���
 * 
 * ���ڿ� �����͸� ������ ũ�Ⱑ 3�� �迭�� ����� ����ϼ���.
 * 
 */
	public static void main(String[] args) {
		// char
		char[] ch = new char[7];
		
		// float
		float[] fl = new float[10];
		
		// ����
		int[] num = new int[5];
		
		// String
		String[] str = new String[3];
		
		System.out.printf("%12s %s\r\n","ch ���� : ", Arrays.toString(ch));
		System.out.printf("%12s %s\r\n","fl ���� : " , Arrays.toString(fl));
		System.out.printf("%12s %s\r\n","num ���� : " , Arrays.toString(num));
		System.out.printf("%12s %s\r\n","str ���� : " , Arrays.toString(str));
	}

}

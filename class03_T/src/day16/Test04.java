package day16;

import java.util.Arrays;

public class Test04 {
/*
	Arrays Ŭ����
		���� 100% static �Լ��� ������ Ŭ����
		�迭�� ó���� �� �ʿ��� ��ƿ��Ƽ���� �Լ���� ������ Ŭ����
		
	
 */
	public Test04() {
		int[] no1 = {1, 2, 3};
		int[] no2 = Arrays.copyOf(no1, 5);
		System.out.println(Arrays.toString(no2));
		String[] str1 = {"young", "soo", "jeon"};
		String[] str2 = Arrays.copyOf(str1, 5);
		System.out.println(Arrays.toString(str2));
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}

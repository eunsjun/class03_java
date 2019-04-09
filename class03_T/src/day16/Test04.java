package day16;

import java.util.Arrays;

public class Test04 {
/*
	Arrays 클래스
		역시 100% static 함수로 구성된 클래스
		배열을 처리할 때 필요한 유틸리티적인 함수들로 구성된 클래스
		
	
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

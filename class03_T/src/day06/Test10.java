package day06;

import java.util.Arrays;

public class Test10 {
/*
 * 문자데이터를 7개 저장할 배열을 만들어서 출력하세요.
 * 
 * 실수 데이터를 저장할 크기가 10인 배열을 만들어 출력하세요.
 * 
 * 정수 데이터를 저장할 크기가 5인 배열을 만들어 출력
 * 
 * 문자열 데이터를 저장할 크기가 3인 배열을 만들어 출력하세요.
 * 
 */
	public static void main(String[] args) {
		// char
		char[] ch = new char[7];
		
		// float
		float[] fl = new float[10];
		
		// 정수
		int[] num = new int[5];
		
		// String
		String[] str = new String[3];
		
		System.out.printf("%12s %s\r\n","ch 내용 : ", Arrays.toString(ch));
		System.out.printf("%12s %s\r\n","fl 내용 : " , Arrays.toString(fl));
		System.out.printf("%12s %s\r\n","num 내용 : " , Arrays.toString(num));
		System.out.printf("%12s %s\r\n","str 내용 : " , Arrays.toString(str));
	}

}

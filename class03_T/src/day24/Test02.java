package day24;

import java.io.*;
import java.util.*;
public class Test02 {
/*
	2. 
	입력되는 여러글자를 읽어보자.
 */
	public Test02() {
		System.out.println("입력해보시오! : ");
		
		// 읽은 결과를 저장할 변수 준비
		byte[] buff = new byte[256];
		// [] 안의 숫자에 따라서 한번에 읽을 데이터의 양이 정해진다.
		
		try{
			int len = System.in.read(buff);
			// len - 읽은 데이터 갯수
			// buff - 읽은 데이터를 저장하는 매개변수
			
			// 읽은 결과를 문자로 변환해서 출력
			String str = new String(buff, 0, len);
			
			System.out.println("결과 : " + str);
		}catch(Exception e) {}
	}

	public static void main(String[] args) {
		new Test02();
	}

}

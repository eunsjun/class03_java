package day24;

import java.io.*;
import java.util.*;
public class Test05 {
// Test04에서 만든 test01.txt 파일을 읽어보자.
	public Test05() {
		// 스트림준비
		FileInputStream fin = null;
		
		try {
//			fin = new FileInputStream("C:\\share\\Lesson\\Java\\test\\test01.txt");
//			1. 한글자만 읽어보자.
//			int ch = fin.read();
//			System.out.println("결 과 : " + (char) ch);

			/*
//			2. 여러글자 읽기
			// 이전 코드 읽기
			fin = new FileInputStream("src/day24/Test04.java");
			// 담을 변수 
			byte[] buff = new byte[1024];
			// 읽어서 변수에 담기
			int len = fin.read(buff);
			// 문자열로 변환하기
			String str = new String(buff, 0, len);
			// print
			System.out.println("결 과 ]\n" + str);
			*/
			
//			3. 모든 내용을 읽어보자.
			// 파일 내용 읽기
			fin = new FileInputStream("src/day24/Test04.java");
			// 그런데 몇글자를 읽어야 할 지 모르므로
			// 반복해서 처리하기로 하자.
			System.out.println("결 과 ]");
			while(true) {
				// 변수를 만들어서 적당 읽어보자.
				byte[] buff = new byte[1024];
				int len = fin.read(buff); // 반환값은 읽은 데이터 양...
				// 만약 읽어온 데이터가 없을 경우는 반환값이 -1 이다.
				if(len == -1 ) {
					// 더이상 읽을 데이터가 없기 때문에 종료해준다.
					break;
				}
				
				String str = new String(buff, 0, len);
				System.out.print(str);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}

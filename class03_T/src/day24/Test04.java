package day24;

import java.io.*;
import java.util.*;
public class Test04 {
/*
	 내용을 파일에 저장하는 프로그램을 만들어 보자.
 */
	
	public Test04() {
		// 파일에 저장하기 위해서는 파일로 연결되는 스트림이 필요하고
		// 지금의 경우는 파일로 데이터를 내보내는 경우이므로
		// FileOutputStream 이 필요하다.
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("C:\\share\\Lesson\\Java\\test\\test01.txt");
			/*
				파일이 존재하지 않아도 자동으로 만들어 준다.
			 */
			
//			1. 한글자만 입력해보자.
//			fout.write('A');
			
//			2. 여러글자를 입력
/*			String str = "반장님??? 우리반 출석의 신경 좀 써주십시오!";
			byte[] buff = str.getBytes();
			fout.write(buff);
*/			
			
			
//			3. 원하는 위치까지만 저장
			String str = "The class String includes methods for examining individual characters of the sequence, \r\nfor comparing strings, for searching strings, for extracting substrings, \r\nand for creating a copy of a string with all characters translated to uppercase or to lowercase. \r\nCase mapping is based on the Unicode Standard version specified by the Character class.";
			byte[]  buff = str.getBytes();
			fout.write(buff);
//			fout.write(buff, 12, buff.length - 12);
			
			System.out.println("### 파일 저장 성공 ###");
		} catch(Exception e) {
			System.out.println("파일저장에 실패 했습니다.");
			e.printStackTrace();
		} finally {
			/*
			 *  외부장치와 연결된 경우에는
			 *  해당 장치의 사용이 끝나면 닫아주는 것이 원칙이다.
			 */
			try{
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}

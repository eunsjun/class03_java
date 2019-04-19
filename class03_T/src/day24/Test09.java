package day24;

import java.io.*;
public class Test09 {
/*
	필터 스트림(보조스트림)
	==> 1. 기본스트림의 기능을 추가한다던지
		2. 사용자의 편의를 제공하기 위한
		보조적인 기능의 스트림
		
		주의]
			반드시 기본 스트림이 존재해야 하고
			필터 스트림은 필요에 따라서 연결해서 사용하면 된다.
			
		참고]
			필터 스트림 역시 방향성이 있고
			반드시 같은 방향끼리만 연결 해야 한다.
			
			
		***
		1. BufferedInputStream/BufferedOutputStream
			==> 사용자 편의 기능은 없고
				스트림의 성능을 향상 시키는 역할을 한다.
				버퍼에 데이터를 모았다가
				한번에 처리하는 기능이 추가된 스트림이다.
				
			***
			주요함수
			flush()
			==> 강제로 버퍼를 비우는 함수
 */

/*
	파일에 저장하는 프로그램을 만드세요.
	단 BufferedStream을 사용하세요.
 */
	public Test09() {
		// 1. 보조스트림은 반드시 기본스트림(타겟스트림)이 필요하다.
		FileOutputStream fout = null;
		
		// 2. 보조스트림 준비
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("C:\\share\\Lesson\\Java\\test\\test09.txt");
			bout = new BufferedOutputStream(fout);
			
			String str = "아무거나 문자열 입력하세요! 꼭이요~~~!";
			byte[] buff = str.getBytes();
			bout.write(buff);
			// 아직 버퍼가 차지 않아서 버퍼의 내용이 FileOutputStream으로 가지 않았다.
			// 따라서 파일의 내용은 저장이 안된 상태이다.
			
			// 반드시 습관적으로 완료된 시점에서 버퍼를 비워주는 습관을 가진다.
			bout.flush();
			
			System.out.println("저장 완료");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try{
				fout.close();
				bout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}

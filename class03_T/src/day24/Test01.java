package day24;

import java.io.*;
import java.util.*;
public class Test01 {
/*
	스트림(Stream)
		==> 자바는 외부 장치와 테이터를 죽 받는 방법으로 통일시켜 놓았다.
			그것이 바로 Stream 이라는 개념이다.
			
			쉽게 생각해서 스트로우(빨대)로 생각하면 될 것이다.
			
			즉, 스트림을 데이터를 주고 받을 외부장치에 꽂기만 하면
			이후는 빨대를 빨기만 하면(같은 함수를 이용하면)
			외부 장치의 데이터가 들어온다. 라는 의미....
			
		참고]
			스트림은 단방향이다.
			즉, 하나의 스트림은 한방향으로만 데이터를 보낼 수 있다.
			만약 같은 외부장치에 데이터를 주기도 하고 받기도 하려면
			==> 스트림이 두개가 필요하다.
			
		
		스트림의 종류(방향성)
			1. 프로그램으로 데이터가 들어오는 방향
				: InputStream, Reader
				
			2. 프로그램에서 데이터가 나가는 방향
				: OutputStream, Writer
				
		스트림의 종류(데이터의 양)
			1. byte 단위
				InputStream, OutputStream
				==> 속도는 조금 느리다.
					기계어 처리도 가능하다.
					
			2. char(2바이트) 단위
				Reader, Writer
				==> 속도가 조금더 빠르다.
					오직 문자처리만 가능하다.
					
			참고]
					byte가 char로 합쳐지는 순간 
					운영체제에 따라서 비트 순서가 바뀔 수 있다.
					
		스트림의 종류(상대방 종류)
			1. 타겟 스트림(기본 스트림)
				==> 외부장치에 직접 연결되는 스트림
			
			2. 필터 스트림
				==> 스트림의 성능향상, 개발의 편의를 위해서 
					스트림에 연결되는 스트림
					
			참고]
				반드시 기본스트림은 존재해야 하고
				필요에 따라서 필터 스트림을 연결해서 사용해야 한다.
				
				
		
		I. InputStream 의 기본 함수
			
			int read()
				==> 오직 한문자(1byte)만 읽어들이는 함수
					반환값 읽은 문자(코드값)
					
			int read(byte[] b)
				==> 여러 바이트를 읽어 들이는 함수
					읽은 결과는 byte[] b가 기억하게 되고
					반환값은 읽은 데이터 개수(바이트 수)
					
			int read(byte[] b, int off, int len)
				==> 여러 바이트를 읽어 들이는 함수
					다만, 배열의 지정한 위치부터 지정한 개수만큼만 읽어준다.
					반환값은 읽은 데이터 개수(바이트 수)
					
		II. FileInputStream
			
			==> 파일에 연결되는 입력용 스트림(파일은 읽는 스트림)
				
				생성방법
					FileInputStream(String name)
					==> 스트림을 연결할 파일의 이름을 이용해서 스트림을 연결한다.
		
		III. FileOutputStream
			
			==> 파일로 연결된 보내는 방향의 스트림(파일에 기록하는 스트림)
			
			이 클래스를 이용해서 OutputStream의 기본 함수를 이야기 하자면
			
			기본 함수
				void write(int b)
				==> 한글자만 내보내는 함수
				
				void write(byte[] b)
				==> 여러글자를 내보내는 함수
				
				void write(byte[] b, int off, int len)
				==> 여러 글자 중 지정한 부분만 내보내는 함수
					int off : 내보낼 시작위치
					int len	: 내보낼 데이터 개수
					
			
 */
	
/*
	1. 
	키보드를 이용해서 문자를 입력 받아 보자.
 */
	public Test01() {
		/*
			참고]
				키보드 역시 외부장치이다.
				자주 사용하는 외부장치이기 때문에
				이미 스트림을 준비한 변수가 존재한다.
				
				그 변수가 바로
					System.in
		 */
		
//		Scanner sc = new Scanner(System.in);
		System.out.println("한글자를 입력해 주세요.");
		
		int ch = 0 ;
		
		try {
			// 1. 
			ch = System.in.read();
		} catch(Exception e) {}
		
		System.out.println("입력한 문자 : " + (char)ch);
	}

	public static void main(String[] args) {
		new Test01();
	}

}

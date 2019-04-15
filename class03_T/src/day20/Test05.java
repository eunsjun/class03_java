package day20;

import java.util.*;
import java.io.*;
public class Test05 {
/*
	Properties
	==> Map 의 역할을 하는 클래스
		
		일반 Map과의 차이점은 파일(외부장치)을 이용해서 
		직접 데이터를 읽어서 Map처럼 저장할 수 있고
		Map에 저장된 데이터를 직접 파일(외부장치)에 출력해서 저장할 수 있다.
		
		문제점]
			파일의 내용을 읽을 때 인코딩이 되지 않는다.
			==> 한글 파일의 경우 파일 자체에서 인코딩을 하지 않으면
				내용이 한글인 경우 한글이 깨져서 제대로 출력이 되지 않는다.
				
		참고]
			한글이 포함된 파일을 Properties 에서 사용하기 위해서 인코딩 시키는 방법
			
			1. cmd 창을 연다.
			2. Path를 자바 홈으로 잡아주고
			3. native2ascii 기능을 이용해서 인코딩해준다.
				형식]
					] native2ascii 	현재파일	새로운파일
				
				예]
					] native2ascii C:\Data\sample.txt c:\Data\sample_ko.txt
 */
	/*
	 * sample.txt 파일을 읽어서 Map에 저장해보자.
	 */
	public Test05() {
		Properties prop = new Properties();
		// 외부파일과 연결해야 한다.
		// 이 작업은 이후 IO 공부할 때 다시 더 살펴보기로 하자.
		FileInputStream fin = null;
		
		try {
			// 파일을 읽는다.
			/*
			 *  주의
			 		Properties 는 유니코드로 인코딩된 파일만 정확하게 읽을 수 있으므로
			 		유니코드로 저장된 파일만 읽도록 하자.
			 		안그러면 외계어가 나타난다.
			 */
			fin = new FileInputStream("c:\\Data\\sample_ko.txt");
			
			// 이제 이 파일의 내용을 Properties 가 읽도록 하자.
			prop.load(fin);
			// 이제 읽은 내용은 Map으로 처리 되어 있는 상태가 됬다.
		} catch(Exception e) {
			System.out.println("에러...");
		}
		String name = (String) prop.get("name");
		int age = (int) Integer.parseInt((String)prop.get("age"));
		String tel = (String) prop.get("tel");
		String msg = (String) prop.get("msg");
		
		System.out.printf("### %5s ###\n\tage : %3d\n\ttel : %s\n\tmsg : %s\n", name, age, tel, msg);
	}

	public static void main(String[] args) {
		new Test05();
	}

}

package day24;

import java.util.Arrays;

public class Test03 {
/*
	3. 
		주로 네트워크 처리를 할 때 많이 상용
 */
	public Test03() {
		// 배열 준비
		byte[] buff = new byte[256];
		// 배열의 모든 방에 'A'를 채워넣는다.
		Arrays.fill(buff, (byte)'A');
		
		System.out.println("아무거나 써주세요! : ");
		
		try{
			// 배열에 읽은 데이터 입력
			int len = System.in.read(buff, 10, 100);
			// 배열에 저장된 데이터를 꺼내서 문자열로 변환
			String str = new String(buff, 10, len+10);
			
//			System.out.println("LEN : " + len);
//			String s = "아무거나";
			System.out.println("결과 : " + str);
			/*
				아무거나 써주세요! : 
				아무거나
				결과 : 아무거나
				AAAAAAAAAA
				
				입력할 때 입력이 끝난후 엔터키를 누르면 \r\n 코드가 만들어지고
				그 코드가 입력되어서
				줄바꿈코드까지 저장이되고
				결과를 출력하면 줄바꿈이 된다.
			 */
		} catch(Exception e) {}
	}

	public static void main(String[] args) {
		new Test03();
	}

}

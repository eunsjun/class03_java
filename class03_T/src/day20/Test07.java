package day20;
/*
	프로그램에 관련된 정보를 자동으로 뽑아서 구경하자.
 */
import java.util.*;
public class Test07 {

	public Test07() {
		Properties prop = System.getProperties();
		// System.getProperties() 가
		// 프로그램에 관련된 정보를 Map으로 만들어주는 함수
		
		// 먼저 키를 뽑고
		Enumeration enu = prop.keys();
		// 뽑아온 키를 사용해서 데이터를 읽어보자.
		while(enu.hasMoreElements()){
			String key = (String) enu.nextElement();
			String val = prop.getProperty(key);
			System.out.println(key + " : " + val);
		}
		
		// 숙제
		// 가져온 시스템정보를 파일로 저장하세요.
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}

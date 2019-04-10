package day17;

import java.text.*;
public class Test08 {

	public Test08() {
		String sql = "INSERT INTO emp VALUES(1234, '전영수', '학생', 2000)";
		/*
		 * 이중에서 데이터만 따로 꺼내고 싶다면???
		 * 
		 * 원리]
				1. MessageFormat에서 데이터가 들어갈 부분을 명시한 패턴을 만든다.
				
				2. parse() 함수를 이용해서 데이터 부분을 추출하면 된다.
		 */
		
		MessageFormat form = new MessageFormat(
				"INSERT INTO emp VALUES({0}, {1}, {2}, {3})"
		);
		Object[] result = null;
		
		try {
			result = form.parse(sql);
			for(int i = 0 ; i < result.length ; i++ ) {
				System.out.println(result[i]);
			}
		} catch(Exception e) {
			System.out.println("처리에러...!");
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}

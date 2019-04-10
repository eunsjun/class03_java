package day17;

import java.text.*;
public class Test07 {
	
	/*
			name : 홍길동, tel : 010-1111-1234, age : 25
			name : 전영수, tel : 010-1234-1234, age : 24
	 */
	public Test07() {
		MessageFormat form = new MessageFormat("name : {0}, tel : {1}, age : {2}");
		// 동일한 내용은 그대로 쓰고 
		// 변화되는 부분만 {0}, {1}, {2} 로 기록한다.
		// 번호는 입력되는 데이터의 순서를 의미한다.
		Object[][] data = {{"홍길동", "010-1111-1234", 25},{"전영수", "010-1234-1234", 24}};
		
		// 출력
		for(int i = 0 ; i < data.length ; i++) {
			String result = form.format(data[i]);
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}

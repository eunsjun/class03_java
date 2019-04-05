package day14;

/*
		문제]
			String[] str = {"123", "456", "789", ...};
			배열에 들어갈 문자열은 랜덤하게 만드세요...
			
			가 있는 경우
			이것의 합과 평균을 구하는 프로그램을 작성하세요.
			
			단, 발생할 수 있는 예외를 가정하여 모두 처리하세요.
				1. 배열의 범위를 벗어난 경우
				2. 숫자로 반환이 불가능한 경우
				3. 평균을 계산하는데 0으로 나눠지는 경우....
				
				 추가작업]
				 	a. 배열길이도 랜덤하게...
				 	b. 문자열길이도 랜덤하게...
 */
public class HW00 {

	public HW00() {
		String str = 'A' + "";
		String str1 = '9' + "";
		String str2 = "2" + '5';
		
		StringBuffer buff = new StringBuffer();
		buff.append('3');
		
		String s = buff.toString();
	}

	public static void main(String[] args) {

	}

}

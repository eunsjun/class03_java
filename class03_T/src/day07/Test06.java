package day07;

public class Test06 {
/*
 * String 에서 자주 사용하는 함수
 		charAt()	- 해당 인덱스의 문자를 반환해주는 함수
		length()	- 해당 문자열의 길이를 반환해주는 함수
		substring() - 문자열의 일부를 반환해주는 함수
			substring(숫자); ==> 해당 인덱스에서부터 끝까지 추출
			substring(숫자1, 숫자2); 
					==> 숫자1 인덱스에서부터 숫자2 인덱스 전까지 뽑는다.
					==> 숫자2 인덱스 이전까지만 뽑는다.
						숫자2 인덱스는 포함 안한다.
						
		equals()	- 문자열의 데이터를 비교하는 함수
			
 */
	public static void main(String[] args) {
		String soo = "Hello World!!";
		
		String str1 = soo.substring(6);
		String str2 = soo.substring(2, 5);
		System.out.println("str1 | str2 : \r\n" + str1 + " | " + str2 + "$$$");
		
		int len = soo.length();
		
		StringBuffer buff = new StringBuffer();
		for(int i = 0 ; i < len ; i++) {
			buff.append(soo.charAt(i));
			if(i != len-1) {
				buff.append("_");
			}
		}
		String msg = buff.toString();
		
		System.out.println(msg);
		
		String young1 = "youngsoo";
		String young2 = new String("youngsoo");
		
		// young1 == young2 ==> false
		
		System.out.println(young1.equals(young2));	// ==> true
	}

}

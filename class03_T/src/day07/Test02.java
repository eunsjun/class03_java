package day07;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		// 알파벳을 5 개를 만드는데 중복되지 않게 발생해서 배열에 저장하세요.
		
		// 배열 만들기
		char[] ch = new char[15];
		
		soo:
		for(int i = 0 ; i < ch.length ; i++ ) {
			char ch1 = (char)(Math.random()*26 + 'A');
			
			// 만들어진 문자와 이제까지 저장되어 있는 문자를 비교해서 중복을 체크한다.
			for(int j = 0 ; j < i ; j++ ) {
				if(ch1 == ch[j]) {
					i--;
					continue soo;
				}
			}
			
			// 여기 이후 문장이 실행이되면 체크를 통과한 것이므로 해당인덱스에 저장해주자.
			ch[i] = ch1;
		}
		
		//System.out.println("*** ch[] : " + Arrays.toString(ch));
		
		// 만들어진 배열을 작은 순부터 정렬하자.
		/*
		 * 정렬하는 방법
		 * 			-- 배열에 저장되어 있는 두개를 꺼내서 비교를 하고 작은것을 앞에 두면 된다.
		 */
		
		
		// 오름차순 정렬
		// 비교원본 문자 꺼내는 반복문
		for(int i = 0 ; i < ch.length - 1 ; i++) {
			// 비교할 대상 문자 꺼내는 반복문
			for(int j = i +1 ; j < ch.length ; j++ ) {
				if(ch[i] > ch[j] ) {
					char tmp = ch[i];
					ch[i] = ch[j];
					ch[j] = tmp;
				}
			}
		}
		
		System.out.println("### ch : " + Arrays.toString(ch));
	}

}

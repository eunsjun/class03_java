package day06;

import java.util.Arrays;

/*
 * 'A' ~ 'J' 기억할 배열을 만들고
 * 'A' ~ 'J' 랜덤하게 문자를 100개를 발생해서
 * 각 문자가 몇번 발생했는지 배열에 저장하고
 * 그래프 형식으로 출력하세요.
 * 
 * 	예]
 * 		'A' : ***
 * 		'B' : **********
 * 		...
 * 		'J' : 
 */
public class HW01 {
	public static void main(String[] args) {
		// 문자들을 입력할 배열을 만든다.
		char[] ch = new char[10];
		
		// 문자를 기억할 배열을 초기화한다.각 방에 문자를 넣는다.
		for(int i = 0 ; i < 10 ; i++ ) {
			ch[i] = (char)('A' + i);
		}
		System.out.println(Arrays.toString(ch));
		// 문자가 발생한 횟수를 저장할 배열을 만든다.
		int[] cnt = new int[10];
		
		// 문자를 100개 발생한다. 'A' ~ 'J'
		
		
		for(int i = 0 ; i < 100 ; i++) {
			char ch1 = (char)(Math.random()*10 + 'A');
			
			// 발생한 문자를 검사해서 카운트해서 저장한다.
			for(int j = 0 ; j < 10 ; j++) {
				if(ch[j] == ch1) {
					cnt[j] = cnt[j] + 1;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(cnt));
		
		for(int i = 0 ; i < 10 ; i++ ) {
			System.out.print(ch[i] + " : ");
			for(int j = 0 ; j < cnt[i] ; j ++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}

}

package day06;

import java.util.Arrays;

/*
 * 'A' ~ 'J' ����� �迭�� �����
 * 'A' ~ 'J' �����ϰ� ���ڸ� 100���� �߻��ؼ�
 * �� ���ڰ� ��� �߻��ߴ��� �迭�� �����ϰ�
 * �׷��� �������� ����ϼ���.
 * 
 * 	��]
 * 		'A' : ***
 * 		'B' : **********
 * 		...
 * 		'J' : 
 */
public class HW01 {
	public static void main(String[] args) {
		// ���ڵ��� �Է��� �迭�� �����.
		char[] ch = new char[10];
		
		// ���ڸ� ����� �迭�� �ʱ�ȭ�Ѵ�.�� �濡 ���ڸ� �ִ´�.
		for(int i = 0 ; i < 10 ; i++ ) {
			ch[i] = (char)('A' + i);
		}
		System.out.println(Arrays.toString(ch));
		// ���ڰ� �߻��� Ƚ���� ������ �迭�� �����.
		int[] cnt = new int[10];
		
		// ���ڸ� 100�� �߻��Ѵ�. 'A' ~ 'J'
		
		
		for(int i = 0 ; i < 100 ; i++) {
			char ch1 = (char)(Math.random()*10 + 'A');
			
			// �߻��� ���ڸ� �˻��ؼ� ī��Ʈ�ؼ� �����Ѵ�.
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

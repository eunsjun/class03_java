package day07;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		// ���ĺ��� 5 ���� ����µ� �ߺ����� �ʰ� �߻��ؼ� �迭�� �����ϼ���.
		
		// �迭 �����
		char[] ch = new char[15];
		
		soo:
		for(int i = 0 ; i < ch.length ; i++ ) {
			char ch1 = (char)(Math.random()*26 + 'A');
			
			// ������� ���ڿ� �������� ����Ǿ� �ִ� ���ڸ� ���ؼ� �ߺ��� üũ�Ѵ�.
			for(int j = 0 ; j < i ; j++ ) {
				if(ch1 == ch[j]) {
					i--;
					continue soo;
				}
			}
			
			// ���� ���� ������ �����̵Ǹ� üũ�� ����� ���̹Ƿ� �ش��ε����� ����������.
			ch[i] = ch1;
		}
		
		//System.out.println("*** ch[] : " + Arrays.toString(ch));
		
		// ������� �迭�� ���� ������ ��������.
		/*
		 * �����ϴ� ���
		 * 			-- �迭�� ����Ǿ� �ִ� �ΰ��� ������ �񱳸� �ϰ� �������� �տ� �θ� �ȴ�.
		 */
		
		
		// �������� ����
		// �񱳿��� ���� ������ �ݺ���
		for(int i = 0 ; i < ch.length - 1 ; i++) {
			// ���� ��� ���� ������ �ݺ���
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

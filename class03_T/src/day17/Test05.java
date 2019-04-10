package day17;

import java.text.*;
import java.util.*;

public class Test05 {
/*
	ChoiceFormat
		==> switch case �� ���� �̿��ؾ� �� ��� ����ȭ�ϱ� ���� ���
			��, Ư�� ������ ���� Ư�� ���ڿ��� ��ü�ؼ� ������ִ� ����� ���� Ŭ����
			
		�������]
			ChoiceFormat(double[] limits, String[] formats)
				double[] limits		: ġȯ�� ����
				String[] formats 	: ġȯ�� ����
				
	MessageFormat
		==> Ư�� ���ڿ��� Ư�� ��ġ�� ���븸 ����Ǵ� ���
			���ڿ� ��ü�� ������ �ʰ�
			����Ǵ� ���븸 ��ȭ���Ѽ�
			�ϳ��� ���ڿ��� ����� ���� Ŭ����
			
			���� ���ڸ�
				����Ŭ�� INSERT ����� �ڹٷ� ������
				"INSERT INTO emp VALUES(1234, '������', 'STUDENT', ..., 50)"
				"INSERT INTO emp VALUES(1235, '������', 'STUDENT', ..., 50)"
				"INSERT INTO emp VALUES(1236, '������', 'STUDENT', ..., 50)"
			�̷� ���ڿ��� �Է��� ������ ������ �ϴ� �������� �ִ�.
			�̷� �������� �ؼ��ϱ� ���� Ŭ������ MessageFormat Ŭ�����̴�.
			
		�����Լ�]
			parse(String source)
			==> �־��� ���ڿ����� ���� ��ȭ�Ǵ� ������ �κи� �˾Ƴ��� �Լ�
			
 */
	
	/*
	 * �л������� �Է¹޾Ƽ�
	 * ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	 */
	
	Scanner sc ;
	int java, oracle, jsp, spring;
	String[] sub = {"java", "oracle", "jsp", "spring"};
	int[] score = new int[4];
	
	
	public Test05() {
		sc = new Scanner(System.in);
		for(int i = 0 ; i < sub.length ; i++) {
			System.out.print(sub[i] + " ������ �Է��ϼ��� : ");
			try {
				score[i] = sc.nextInt();
			} catch (Exception e) {
				i--;
				continue;
			}
		}
		sc.close();
		
		double[] limits = {0, 60, 70, 80, 90};
		/*
		 		limits �� ���� �� ���� ����
		 			�ݵ�� ������������ ���ĵǾ�� �ϰ�
		 			�̰��� �ǹ̴� 0 ~ 59 ������ �ϳ��� ���ڷ� �ٲٰ�
		 						  60 ~ 69 ������ �� �ϳ��� ���ڷ� �ٲٰ�
		 						  70 ~ 79 ������ �� �ϳ��� ���ڷ� �ٲٰ�
		 						  ...
		 						  90 ~      �� �ϳ��� ���ڷ� �ٲ��.. ��� �ǹ�
		 */
		String[] formats = {"F", "D", "C", "B", "A"};
		/*
				formats ���� �� ���ǻ���
					limits�� ������ ��ġ�ؾ� �Ѵ�.
		 */
		
		ChoiceFormat pattern = new ChoiceFormat(limits, formats);
		
		for(int i = 0 ; i < score.length ; i++) {
			String grade = pattern.format(score[i]);
			System.out.println(sub[i] + "\r\n\t���� : " + score[i] + "\r\n\t���� : " + grade);
//			System.out.println(sub[i] + "\r\n\t���� : " + score[i] + "\r\n\t���� : " + pattern.format(score[i]));
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}

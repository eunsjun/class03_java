package day17;

import java.text.*;
public class Test06 {

	public Test06() {
		/*
				ChoiceFormat�� ���鶧 limits�� formats�� �ϳ��� ���� �� �ִ�.
					����� ����]
						60#D   	==> <= �� �ǹ�
						70<C	==> < �� �ǹ�
						
						�̰��� | �� �̿��ؼ� �����ؼ� ����ϸ� �ȴ�.
		 */
		
		String pattern = "0#F|60#D|70#C|80<B|90#A";
		/*
		 * 60#D	==> 60 ���� ũ�ų� ������ D
		 * 80<B ==> 80 ���� ũ�� B
		 */
		
		ChoiceFormat format = new ChoiceFormat(pattern);
		int score = 81;
		String grade = format.format(score);
		System.out.println(score + " : " + grade);
	}

	public static void main(String[] args) {
		new Test06();
	}

}

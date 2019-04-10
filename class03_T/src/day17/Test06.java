package day17;

import java.text.*;
public class Test06 {

	public Test06() {
		/*
				ChoiceFormat을 만들때 limits와 formats를 하나로 만들 수 있다.
					만드는 형식]
						60#D   	==> <= 의 의미
						70<C	==> < 의 의미
						
						이것을 | 를 이용해서 연결해서 사용하면 된다.
		 */
		
		String pattern = "0#F|60#D|70#C|80<B|90#A";
		/*
		 * 60#D	==> 60 보다 크거나 같으면 D
		 * 80<B ==> 80 보다 크면 B
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

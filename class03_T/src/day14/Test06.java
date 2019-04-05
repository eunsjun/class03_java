package day14;

import java.util.*;
public class Test06 {
	Scanner sc ;
	int num;
	public Test06() {
		sc = new Scanner(System.in);
		getNum();
		System.out.println("입력한 숫자는 " + num);
	}
	
	public void getNum() {
		while(true) {
			System.out.println("숫자를 입력하세요!");
			String sno = sc.next();
			try {
				num = Integer.parseInt(sno);
				sc.close();
				break;
			} catch(NumberFormatException e) {
				System.out.println("잘못 입력했습니다.");
			}
			
		}
	}
	
	public static void main(String[] args) {
		new Test06();
	}

}

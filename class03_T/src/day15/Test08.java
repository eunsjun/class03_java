package day15;

import java.util.*;
public class Test08 {
	Scanner sc ;
	public Test08() {
		sc = new Scanner(System.in);
		setData(sc);
	}
	
	public void setData(Scanner s) {
		while(true) {
			System.out.println("이름을 입력하세요!");
			String name = s.nextLine();
			if(name.contentEquals("quit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			System.out.println("입력한 이름은 " + name + "입니다.");
		}
	}
	
	public static void main(String[] args) {
		new Test08();
	}

}

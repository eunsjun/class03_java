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
			System.out.println("�̸��� �Է��ϼ���!");
			String name = s.nextLine();
			if(name.contentEquals("quit")) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
			System.out.println("�Է��� �̸��� " + name + "�Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		new Test08();
	}

}

package day14;

import java.util.*;
public class Test06 {
	Scanner sc ;
	int num;
	public Test06() {
		sc = new Scanner(System.in);
		getNum();
		System.out.println("�Է��� ���ڴ� " + num);
	}
	
	public void getNum() {
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���!");
			String sno = sc.next();
			try {
				num = Integer.parseInt(sno);
				sc.close();
				break;
			} catch(NumberFormatException e) {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
			
		}
	}
	
	public static void main(String[] args) {
		new Test06();
	}

}

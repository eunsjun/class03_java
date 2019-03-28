package day08;

/*
 * EXAMPLE]
 * 		�μ��� �����ȣ�� �Է¹޾�
 * 		�����ȣ�� �´� ������ �ؼ�
 * 		����� ��ȯ���ִ� �Լ��� �ۼ��ϰ�
 * 		�����ؼ� ����ϼ���.
 */

import java.util.*;
public class Test04 {
	
	public Test04() {
		int num1, num2, gap;
		char ch;
		
		//abc();
		
		// �Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		// �޼��� �׸��� ����
		/*
		boolean bool = true;
		while(bool){
			// �Է¹ް�
			System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
			String str = sc.next();
			int sno = checkNo(str);
			if(sno == -1) {
				System.out.println("���ڰ� �ƴ� ���ڰ� �ԷµǾ����ϴ�.");
			} else {
				bool = false;
				num1 = Integer.parseInt(str);
			}
		}
		
		bool = true;
		while(bool){
			// �Է¹ް�
			System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
			String str = sc.next();
			int sno = checkNo(str);
			if(sno == -1) {
				System.out.println("���ڰ� �ƴ� ���ڰ� �ԷµǾ����ϴ�.");
			} else {
				bool = false;
				num2 = Integer.parseInt(str);
			}
		}
		 */
		num1 = outNo(sc);
		System.out.println("ù��° ���ڰ� ����Ǿ����ϴ�.");
		num2 = outNo(sc);
		System.out.println("�ι�° ���ڰ� ����Ǿ����ϴ�.");
		// �����ȣ�˻�
		for(; ;) {
			System.out.print("� ������ �� �����ΰ���?? : ");
			String sym = sc.next();
			if(sym.length() > 1 || sym.length() == 0) {
				continue;
			}
			// ���� �̰�
			ch = sym.charAt(0);
			if(ch != '+' & ch != '-' & ch != '*' & ch != '/' & ch != '%') {
				System.out.println("�����ȣ�� �߸� �ԷµǾ����ϴ�.");
				continue;
			}
			break;
		}
		
		gap = calc01(num1, num2, ch);
		System.out.println(num1 + " " + ch + " " + num2 + " = " + gap);
	}
	
	public static void main(String[] args) {
		new Test04();
	}
	/*
	void abc() {
		System.out.println("Hello!!!");
	}
	*/
	
	public int outNo(Scanner s) {
		int no = 0 ;
		
		boolean bool = true;
		while(bool){
			// �Է¹ް�
			System.out.print("���ڸ� �Է��ϼ��� : ");
			String str = s.next();
			int sno = checkNo(str);
			if(sno == -1) {
				System.out.println("���ڰ� �ƴ� ���ڰ� �ԷµǾ����ϴ�.");
			} else {
				bool = false;
				no = Integer.parseInt(str);
			}
		}		
		return no;
	}
	
	// ������ְ� ��ȯ���ִ� �Լ�
	public int calc01(int no1, int no2, char c) {
		int result = 0;
		
		switch(c) {
		case '+':
			result = no1 + no2;
			break;
		case '-':
			result = no1 - no2;
			break;
		case '*':
			result = no1 * no2;
			break;
		case '/':
			result = no1 / no2;
			break;
		case '%':
			result = no1 % no2;
			break;
		}
		
		return result;
	}
	
	// ���ڿ��� ���ڰ��ƴ� ���ڰ� ���ԵǾ����� �˻����ִ� �Լ�
	public int checkNo(String s) {
		int check = 1 ;
		
		// �ϳ��� �̾Ƽ� �˻��ϰ�...
		for(int i = 0 ; i < s.length() ; i++ ) {
			char ch1 = s.charAt(i);
			if(ch1 < '0' || ch1 > '9' ) {
				check = -1;
			}
		}
		
		// ������ �Ѱ��ְ�
		return check;
	}
	
}

package day14;

/*
		����]
			String[] str = {"123", "456", "789", ...};
			�迭�� �� ���ڿ��� �����ϰ� ���弼��...
			
			�� �ִ� ���
			�̰��� �հ� ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
			
			��, �߻��� �� �ִ� ���ܸ� �����Ͽ� ��� ó���ϼ���.
				1. �迭�� ������ ��� ���
				2. ���ڷ� ��ȯ�� �Ұ����� ���
				3. ����� ����ϴµ� 0���� �������� ���....
				
				 �߰��۾�]
				 	a. �迭���̵� �����ϰ�...
				 	b. ���ڿ����̵� �����ϰ�...
 */

import static java.lang.Math.*;
import java.util.*;
public class HW00 {
	String[] num;
	
	public HW00() {
		/*
		 * String str = 'A' + ""; String str1 = '9' + ""; String str2 = "2" + '5';
		 * 
		 * StringBuffer buff = new StringBuffer(); buff.append('3');
		 * 
		 * String s = buff.toString();
		 */
		int len = (int)(Math.random()*6 + 5);
		num = new String[len];
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer buff = new StringBuffer();
		for(int i = 0 ; i < len ; i++ ) {
			char ch = ' ';
			for(int j = 0 ; j < 3 ; j++ ) {
				ch = (char)(random()*10 + '0');
				buff.append(ch);
			}
			try{
				num[i] = buff.toString();
			} catch(IndexOutOfBoundsException e) {
				break;
			}
			buff.delete(0, buff.length()-1);
		}
	}
	
	// ����Ÿ���� ���ڿ��迭 ����� �Լ� 
	public void setSArray(Scanner s) throws IndexOutOfBoundsException {
		for(int i = 0 ; i < num.length ; i++ ) {
			System.out.println("���ڸ� ���ڸ� �Է��ϼ���!");
			String sno = s.nextLine();
			try{
				if(sno.length() != 3) {
					throw new NumberFormatException();
				}
			} catch(NumberFormatException e) {
				--i;
				continue;
			}
			for(int j = 0 ; j < sno.length() ; j++ ) {
				
			}
			num[i] = sno;
		}
	}
	
	// �迭�� �� ���� �����͸� ���ڷ� ��ȯ�ϴ� �Լ�
	
	
	// ���ڹ迭�� ����� ���ϴ� �Լ�
	

	public static void main(String[] args) {

	}

}

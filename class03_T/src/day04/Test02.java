package day04;

public class Test02 {

	public static void main(String[] args) {
		int no = 3 ;
		char ch = 'A';
		char ch2 = (65 + 3);
		
		no += ch;
		
		System.out.println("no : " + no);
		System.out.println("ch : " + ch2);
		
		/*
		 * String (���ڿ�)
		 * 		- �⺻ ������Ÿ���� ����� �ƴϴ�.
		 * 		- String �̶�� Ŭ������ ���ڿ��� �ٷ�� Ŭ�����̴�.
		 * 
		 * ����� ���
		 * 		String �����̸�;
		 * 		String �����̸� = "���ڿ�";		- ���ͷ� ���
		 * 		String �����̸� = new String();	- ��ü�ּ�
		 */
		
		String str1 = "abcd";
		String str2 = "abcd";
		String str3 = new String("abcd");
		String str4 = new String("abcd");
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str3 == str4 : " + (str3 == str4));
		
		// str3�� str4 �� ������ ��
		boolean bool = str3.equals(str4);
		System.out.println("str3 equals str3 : " + bool);
		
	}

}

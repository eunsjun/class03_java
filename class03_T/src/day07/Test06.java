package day07;

public class Test06 {
/*
 * String ���� ���� ����ϴ� �Լ�
 		charAt()	- �ش� �ε����� ���ڸ� ��ȯ���ִ� �Լ�
		length()	- �ش� ���ڿ��� ���̸� ��ȯ���ִ� �Լ�
		substring() - ���ڿ��� �Ϻθ� ��ȯ���ִ� �Լ�
			substring(����); ==> �ش� �ε����������� ������ ����
			substring(����1, ����2); 
					==> ����1 �ε����������� ����2 �ε��� ������ �̴´�.
					==> ����2 �ε��� ���������� �̴´�.
						����2 �ε����� ���� ���Ѵ�.
						
		equals()	- ���ڿ��� �����͸� ���ϴ� �Լ�
			
 */
	public static void main(String[] args) {
		String soo = "Hello World!!";
		
		String str1 = soo.substring(6);
		String str2 = soo.substring(2, 5);
		System.out.println("str1 | str2 : \r\n" + str1 + " | " + str2 + "$$$");
		
		int len = soo.length();
		
		StringBuffer buff = new StringBuffer();
		for(int i = 0 ; i < len ; i++) {
			buff.append(soo.charAt(i));
			if(i != len-1) {
				buff.append("_");
			}
		}
		String msg = buff.toString();
		
		System.out.println(msg);
		
		String young1 = "youngsoo";
		String young2 = new String("youngsoo");
		
		// young1 == young2 ==> false
		
		System.out.println(young1.equals(young2));	// ==> true
	}

}

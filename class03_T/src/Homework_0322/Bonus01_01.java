package Homework_0322;

/*
 * 	���ĺ��� �����ϰ� �߻��� ��
	�빮�ڴ� �ҹ��ڷ� 
	�ҹ��ڴ� �빮�ڷ� ��ȯ�ϴ� ���α׷��� �ۼ��ϼ���.
	
	'A' - 65
	'a' - 97
 */
public class Bonus01_01 {
/*
 * 'a' > 'A'   ���� 32
 */
	public static void main(String[] args) {
		// �빮�ڸ� �����ϰ� �߻��Ѵ�.
		// 'A' - 65
		// 'Z' - 
		
		// �ҹ��ڿ� �빮���� ���� 32
		
		char ch0 = (char)((Math.random()*26) + 65); // �빮�ڸ� �����.
		int no = (int)(Math.random()*2); // 0 - �ҹ���, 1 - �빮�ڸ� �����.
		
		//System.out.println((char)('A' + 25));
		
		int num = (no == 0) ? ((char)(ch0 + 32)) : (ch0) ;
		int num1 = (no == 0) ? num - 32 : num + 32 ;
		
		String str = (no == 0) ? "�빮�ڷ� �ٲٸ� " : "�ҹ��ڷ� �ٲٸ� " ;
		
		System.out.println("�����ϰ� ������� ���� " + (char)num + " �� " + str + (char)num1 + " �Դϴ�." );
	}

}

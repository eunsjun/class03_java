package Homework_0322;

/*
 * ���� 2]
	0 ~ 255 ������ ���ڸ� �����ϰ� �߻��ؼ� �ϳ��� ���ڸ� �����
	�� ���ڰ� ���������� �˾ƺ��� ���α׷��� �ۼ��ϼ���.
	
	char ch = (char)(Math.random()* 256);
 */
public class HW_02 {

	public static void main(String[] args) {
		char ch = (char)(Math.random()* 256);
		
		String str = ((ch >= 'A' & ch <= 'Z') | (ch >= 'a' & ch <= 'z')) ? (ch + " �� ������ �Դϴ�.") : (ch + " �� �����ڰ� �ƴմϴ�.") ;
		
		System.out.println(str);
	}

}

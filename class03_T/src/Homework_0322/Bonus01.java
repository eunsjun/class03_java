package Homework_0322;


/*
 * �μ��� �����ϰ� �߻��ϴµ�
 * 		�ϳ��� 0 ~ 25 �� �ϳ�
 * 		�ٸ��ϳ��� 1 �Ǵ� 2
 * �� �߻��ؼ�
 * 
 * 1�� ������ �ҹ��ڷ�
 * 2�� ������ �빮�ڷ� ��ȯ�ؼ� ����ϼ���.
 */
public class Bonus01 {

	public static void main(String[] args) {
		int no1 = (int)(Math.random()*26);
		int no2 = (int)(Math.random()*2) + 1;
		
		char ch = (no2 == 1) ? (char)(no1 + 'a') : (char)(no1 + 'A') ;
		
		System.out.println("�߻��� ���ĺ� : " + ch);
	}

}

package day17;

import java.text.*;
public class Test03 {
/*
	����ȭ Ŭ����
		==> �ַ� ����� �̻ڰ� ����ϱ� ���� ���Ǿ����� Ŭ����
			
		1. DecimalFomat
			==> ���ڸ� ����ȭ �ؼ� ����ϱ� ���� Ŭ����
			
			�������]
				DecimalFormat(String pattern) �� �ַ� ����Ѵ�.
				==> � ������� ��ȯ��ų�� �˷��ִ� ������ ���� �����.
				
			�ֿ��Լ�
				format(double number) ==> ���ڸ� ���ϴ� ���·� ��ȯ ���ִ� �Լ�
				
				����]
					���������� (�Է� : 123456.78
						0			- ���ڸ� ���ڸ� �ǹ�, ��ȿ�ڸ����� ǥ�� 
							==> 0 	: 123457
								0.0 : 123456.8
								0000000.000 : 0123456.780
								
						#			- ��ȿ�ڸ����� ǥ������ �ʴ´�.
							==> # 	: 123457
								#.#	: 123456.8
								#######.###	: 123456.78
						.(point)	- �Ҽ��� ��ġ�� �˷��ش�.
							==>
							 	#.#	:123456.8
						-(dash)		- ������ȣ, �����ϰ�� -��ȣ�� ��ġ�˷��ش�.
							==>
								#,###,###,###.###-	: 123,456.78-
								-#,###,###.###		: -123,456.78
								
						,			- ���� ������ , ���ڸ����� ǥ��
						E			- ������ȣ, �Ǽ��� ��� ���� ���·� ǥ��
							==>
								#E0					: .1E6  <== E :10 �� n ��
								0E0					: 1E5
								##E0				: 1.2E5
								####E0				: 123.4E3
								#.#E0				: 1.2E5
								
								
						;			- ���� ������, ����� ���� ������ ��츦 �����ؼ� ó��
							
						%			-  �����
							==> 
								#.#%				: 12345678%
								
						'(���� ����ǥ) - escape ����
							==> 
								#'#,### 			: #123,457
								'#,###				: '123,457
						
						\U00A4		- ��ȭ ��ȣ(ȭ����� ǥ��)
							==> 
								\U00A4 #,###		: �� 123,457
				
			
 */
	public Test03() {
		float num = 34256.3545f;
		
		// num �� ���ڸ����� , �� �����ؼ� �����ְ� �ʹ�.
		DecimalFormat pattern = new DecimalFormat("0,000,000.000");
		String sNum = pattern.format(num);
		System.out.println("����ȭ ó�� 0 �� : " + sNum);
		
		DecimalFormat pattern1 = new DecimalFormat("#,###,###.###");
		String sNum1 = pattern1.format(num);
		System.out.println("����ȭ ó�� 1 �� : " + sNum1);
		
		DecimalFormat pattern2 = new DecimalFormat("\u00a4 #,###,###");
		String sNum2 = pattern2.format(num);
		System.out.println("����ȭ ó�� 2 �� : " + sNum2);
		
		DecimalFormat pattern3 = new DecimalFormat("##E0");
		String sNum3 = pattern3.format(num);
		System.out.println("����ȭ ó�� 3 �� : " + sNum3);
		
		
		DecimalFormat pattern4 = new DecimalFormat("#.#E0");
		String sNum4 = pattern4.format(num);
		System.out.println("����ȭ ó�� 4 �� : " + sNum4);
		
		
		DecimalFormat pattern5 = new DecimalFormat("#E0");
		String sNum5 = pattern5.format(num);
		System.out.println("����ȭ ó�� 5 �� : " + sNum5);
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}

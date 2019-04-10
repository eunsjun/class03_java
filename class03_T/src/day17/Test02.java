package day17;

import java.util.*;
public class Test02 {

/*
		Calendar Ŭ����
		==> Date Ŭ������ ������ Ŭ����
		
		�������
			new Calendar() ==> X : �߻�Ŭ�����̹Ƿ� new ��ų�� �����Ƿ�...
			
			getInstance()	==> O : �߻�Ŭ������ �ν��Ͻ��� �Ҽ��Լ���
									�Ӽ��� static �̰�
									��ȯ���� �ڱ��ڽ�(Calendar) �� 
									�Լ��� ���ؼ� ���� �Ѵ�.
									
			�ֿ��Լ�]
				get(int field)
				==> �ʿ��� ������ �˷��ִ� �Լ�
					: int field �� �˰��� �ϴ� ������ �־��ָ�
					  �� ���� ���ؼ� �˷��ش�.
					  
					�߿�]
						Calendar Ŭ������ 
						������ ������ ������ ����ִ�(������ �˱�����) ���������� �����ؾ� �Ѵ�.
						���� : API Documentation ����
								�ش�Ŭ������ Fields Summary
								
				getTime()
				==> Calendar Ŭ������ Date Ŭ������ ��ȯ���ִ� �Լ�
					��Ȥ
						Calendar Ŭ������ �۾��� �ϴٰ�
						Date Ÿ������ ��ȯ����� �� ��찡 ����µ�
						
						Calendar cal = Calendar.getInstance();
						.....
						Date date = cal.getTime();
						
						
			����]
				API ���� �Լ��� ����ϴ� ����
				���ڿ��� �ǹ��ϴ� ������
				int �� �Է��ش޶�� �ϴ� �Լ��� ���̴µ�
				�̷� ��� 99% ������
				�� ���ڿ��� �ǹ̿� ���ڸ� ������ ���� ������ ������ �ִٴ� �ǹ��̹Ƿ�
				�� ������ ����ؼ� ó���� �ؾ� �Ѵ�.
				
		����]
			Calendar Ŭ������ ��� �Լ���
				set(int field, int value)
				getTimeInMills()
				getActualMaximum(int field)
				add(int field, int amount)
				roll(int field, int amount)
				after(Object when)
				before(Object when)
			�� �����ϰ�
			��뿹�� ��� �ϳ��� ���弼��...
			
 */
	public Test02() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1 ;
		int date = cal.get(Calendar.DATE);
		
		System.out.printf("�⵵ : %4d\r\n��  : %2d\r\n��¥ : %2d", year, month, date);
	}

	public static void main(String[] args) {
		new Test02();
	}

}

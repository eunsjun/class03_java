package day17;


import java.text.*;
import java.util.*;
public class Test04 {
/*
	SimpleDateFormat
		==> ��¥ �����͸� ���Ŀ� ���� ���ڿ��� 
			������ִ� ����� ���� Ŭ����
			
		���� ����� ���
			
			G	: ���� ( BC, AD )	
				==> AD
			
			y	: �⵵
				==> 2019
				
			M	: ��(1 - 12 �Ǵ� 1�� - 12��)
				==> 10 || 10�� || OCT
				
			w	: ���� ���° �� ( 1 ~ 53 )
				==> 
				
			W	: ���� ���° �� ( 1 ~ 5 )
				==> 2
				
			D	: ���� ���° �� ( 1 ~ 365 )
				==> 
				
			d	: ���� ���° �� ( 1 ~ 31 )
				==> 10
				
			F	: ���� ���° ������ �ش� ����( 1 ~ 5 ) 
				==> 2
				
			E	: ����
				==> ��
				
			a	: ���� | ���� ( AM | PM )
				==> ����(PM)
				
			H	: �ð�( 0 ~ 23 )
				==> 12
				
			k	: �ð�( 0~ 24 )
				==> 12
				
			K	: �ð� ( 0 ~ 11 )
				==> 0
				
			h	: �ð� ( 1 ~ 12 )
				==> 12
			m	: �� (0 ~ 59 )
			
			s	: �� (0 ~ 59 )
			
			S	: õ���� �� �� (0 ~ 999)
			
			z	: Timezone(General Timezone) 
				==> GMT+9:00
				
			Z	: Timezone( RFC 822 timezone )
				==> +0900
				
			'	: escape ���� (Ư������ ǥ���� �� ���)
		
 */
	public Test04() {
		Calendar cal = Calendar.getInstance();
		Date date = new Date();
		SimpleDateFormat pattern = 
					new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH:mm:ss");
		String sTime = pattern.format(cal.getTime());
		System.out.println("����ð� 1 : " + sTime);
		
		// sleep() �Լ��� ���ܸ� �����ϴ� �Լ��̹Ƿ� 
		// ����� ���� �ݵ�� ����ó���� ����� �Ѵ�.
/*
		try {
			Thread.sleep(3000);
		} catch(Exception e) {}
*/
		String sTime1 = pattern.format(date);
		System.out.println("����ð� 2 : " + sTime1);
		
		/*
			MessageFormat
		 */
		
		String id= "soo";
		String name = "������";
		String tel = "010-9999-9999";
		
		String pattern1 = "ȸ�� ID : " + id + "\n ȸ�� �̸� : " + name + "\n ȸ�� ��ȭ : " + tel;
		System.out.println(pattern1);

		// �����Ͱ� �� ��ġ�� {����} �� ���ְ� ���ڴ� 0���� �����Ͱ��� -1 ���� 
		pattern1 = "ȸ�� ID : {0} \n ȸ�� �̸� : {1} \n ȸ�� ��ȭ : {2}";

		String result = MessageFormat.format(pattern1, id, name, tel);

		System.out.println(result);
	}

	public static void main(String[] args) {
		new Test04();
	}

}

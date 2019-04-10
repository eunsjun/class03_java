package day17;

import java.util.*;
import java.text.*;
public class Test01 {
/*
	Date Ŭ����
		==> ��¥�� �ð��� �����ϴ� Ŭ����
			
			������ �Լ�
				Date()
			==> ���� �ý����� ��¥�� �ð��� �̿��ؼ� ����
			
		����]
			�� Ŭ������ Calendar Ŭ������ ������ Ŭ�����̹Ƿ�
			�ڹ��������� Calendar Ŭ���� ����� ����
			������ ������ Date �� ����ؾ� �ϴ� �Լ��� �����ϹǷ�
			�����ϼ���...
 */
	
	/*
	 * ���� ��ǻ���� ��¥�� �ð��� ����ϼ���.
	 */
	
	Date day;
	int year, month, nal, yoil, hour, min, sec;
	String sDay;
	
	public Test01() {
		day = new Date();
		// �⵵, ��, ��, ����, �ð�, ��, �� �� �������.
		year = day.getYear() + 1900;
		// �ڹٿ��� Date Ÿ���� �������� ������ 1900 ���� �����ϹǷ�
		// �⵵�� ������ �ű⿡ 1900�� ������� ��Ȯ�� �⵵�� ���´�.
		month = day.getMonth() + 1;
		// getMonth()�� 0������ �����ϹǷ� 1�� ������� ��Ȯ�� ���� ���´�.
		nal = day.getDate();
		
		yoil = day.getDay();
		// getDay() �� ������� 0 ~ 6 �� ��ȯ���ְ�
		// 0 �� �Ͽ����̰� 6 �� ������� �ǹ��ϹǷ�
		// ������ ��ȯ�ؼ� ����ؾ� �Ѵ�.
		
		// ���� ���ڿ� �����
		sDay = getYoil(yoil);
		
		// �ð����ϱ�
		hour = day.getHours();
		// �� ���ϱ�
		min = day.getMinutes();
		// �� ���ϱ�
		sec = day.getSeconds();
		
		// ���
		toPrint();
		System.out.println(this);
	}
	
	// ���� �̾Ƴ� �ִ� �Լ�
	public String getYoil(int y) {
		StringBuffer buff = new StringBuffer();
		switch(y) {
		case 0:
			buff.append("��");
			break;
		case 1:
			buff.append("��");
			break;
		case 2:
			buff.append("ȭ");
			break;
		case 3:
			buff.append("��");
			break;
		case 4:
			buff.append("��");
			
			break;
		case 5:
			buff.append("��");
			break;
		default:
			buff.append("��");
		}
		buff.append("����");
		return buff.toString();
	}
	
	// �� Ŭ������ ������ ����� ��ȯ���� ���ڿ��� �������ִ� �Լ�
	public void toPrint() {
		System.out.printf("���� �ð��� %4d�� %2d�� %2d�� %3s - %2d�� %2d�� %2d�� �Դϴ�.\r\n", year, month, nal, sDay, hour, min, sec);
	}
	public String toString() {
		String pattern = "���� �ð��� {0}��  {1}�� {2}�� {3} - {4}��  {5}�� {6}�� �Դϴ�.";
		String str = MessageFormat.format(pattern, year+"", month, nal, sDay, hour, min, sec);
		
		return str;
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}


















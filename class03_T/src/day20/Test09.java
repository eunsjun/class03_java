package day20;

/*
	������̼�(Annotation)
	==> ���������� ��ӵ� ������ �ڵ����� ó���ϵ��� �ϴ� ����� ����..
		�����Ϸ����� �˷��ִ� ����...
		
		�ַ� ȭ�鿡 ���� ���̴� ������ �ƴϰ�
		������ �Ѵٴ���
		�������� ����(�� Ŭ������ �̷�������� �����ϼ���...)
		�� �ǹ̸� ���� ����� ���Ѵ�.
		
		
	����]
		@���
		
	��]
		@Override
		==> �̰� �پ��ִ� �Լ��� �������̵带 �ϴ� �Լ��� ��� �����Ϸ����� �˷��ش�.
		
		@SuppressWarnings("unused")
		
		
	
	
 */
import java.util.*;
public class Test09 {
	
	public Test09() {
		@SuppressWarnings({ "rawtypes", "unused" })
		// Ŀ���� �Է�Ÿ�� ������ ��� ����, ������� �ʴ� ���� üũ����
		ArrayList list = new ArrayList();
		
		@SuppressWarnings("unused") // ������� �ʴ� ���� üũ ����
		int num = 10;
	}

	public static void main(String[] args) {
		new Test09();
	}

}

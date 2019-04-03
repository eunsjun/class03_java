package day12;

public class Test03 extends Test01_01{
/*
		���� ������
		==> ������ ��������(��� Ŭ��������) ����� �� �ְ� �ϴ����� 
		 	�����ϴ� ����� ���
		 	
		 	��,
		 	�츮�� Ŭ������ ����ٰ� �ؼ�
		 	�� Ŭ������ ��� ������� �����Ǵ� ���� �ƴϴ�.
		 	Ŭ������ �����ϴ� ����� �� �������� ������ �� �ִ�.
		 	
		 	��]
		 		class �� �������� �� Ŭ������ ����ϵ��� �� ���ΰ�?
		 		new ��ų�� �ֵ��� �� ���ΰ�?
		 		
		 		�Լ��� �������� ȣ���ϵ��� �� ���ΰ�??
		 		
		 		������ �������� �����͸� �аų� �����ϵ��� �� ���ΰ�??
		
		����]
			1. public
				==> ��� ������ ��밡��
			
			2. protected
				==> ��ӹ��� ����Ŭ���� + ���� ��Ű�� �Ҽ��� Ŭ���������� ��밡��
				
			3. ����
				==> ���� ��Ű�� �Ҽ��� Ŭ���������� ��� ����
				
			4. private
				==> ����� �ٸ� Ŭ���������� ����� �� ����
					���� �ڱ� �ڽ��� Ŭ���������� ��� ����
					
					
		����]
			Ŭ�������� public �ƴϸ� ������ ����� �� �ִ�.
			
		����]
			Ŭ������ ������������ �ǹ̴�
			Ŭ���� ��ü�� ��������� ���θ� �����ϴ� ���̰�
			������ �Լ��� ���������� �ǹ̴� new ��ų�� �ִ��� ���θ� �����ϴ� ��...
					
		
 */
	public Test03() {
		
		
	}
	
	public void toPrint() {
		Test01_01 t = new Test01_01();
//		System.out.println(t.pstr); // private �� Ŭ���� �������� ��밡��
		
		System.out.println(t.dstr);
		System.out.println(t.str1);
		System.out.println(t.str2);
	}
}


class Test01_01{
	private String pstr = "private";
	String dstr = "���� �� ���";
	protected String str1 = "�̰��� ������Ƽ��";
	public String str2 = "��� ������ ��";
	
	public void toPrint() {
		System.out.println(pstr);
		System.out.println(dstr);
		System.out.println(str1);
		System.out.println(str2);
	}
}

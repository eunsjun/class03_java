package day11;

public class Test08 {
/*
	Object Ŭ����
		==> �ڹٷ� ������� Ŭ������ �ֻ��� super Ŭ����
			���� �ڹٷ� ������� ��� Ŭ������ 
			Object Ŭ������ ������ �ִ� ��� ����� ������ �ִ�.
			��� ���(��� : ����, �Լ�)�� �ڵ������� ����� �� �ִ�.
			
		����]
			�̷��� �ֻ��� Ŭ������ ���� ������???
				���������� ��Ȱ�� �ϵ��� �ϱ����� ��ġ....
				��, ������ Ŭ������ ������ ��Ȯ�ϰ� ���� �� �ֵ��� �ϱ� ���ؼ�...
				
		����]
			�ڹٷ� ���� ��� Ŭ������ �ݵ�� ���� Ŭ������ �����Ѵ�.
			�������� ���� Ŭ������ ���� ���� Ŭ������ ������ �ִ�.
			���� ������ ���� Ŭ������ �������� ������(extends Ŭ�����̸�)
			�Ϲ������� Object ��� Ŭ������ ��� �޾Ƽ� ���������.
	
	***
	instance of
		==> Ư�� Ŭ������ new ��Ű�� �ν��Ͻ��� ��������� �ּҵ� ��������µ�
			�� �ּҰ� � Ŭ���� �Ҽ����� �˾Ƴ��� ������...
			������ ����� true �ƴϸ� false �� ��ȯ�� �ȴ�.
			
			����]
				����	instanceof Ŭ�����̸�
			�ǹ�]
				������ ��� �ּ��� �ν��Ͻ��� Ŭ�����̸��� �Ҽ��̳�???
				
			����]
				�Ҽ��� ������ is a ���踦 �����ٴ� �ǹ�
				��, ��Ӱ��踦 �����ٴ� �ǹ�...
				
				
 */
	public Test08() {
		Object[] obj = {"������", 80, 'B'};
		
		junsuk(obj[0]);
		junsuk(obj[1]);
		junsuk(obj[2]);
	}
	
	// ������ Ÿ���� ������ִ� �Լ�
	public void junsuk(Object o) {
		String str = "";
		String name = "";
		int n = 0;
		char c = ' ';
		if(o instanceof Integer) {
			n = (int) o;
			str = "int type �Դϴ�.";
		} else if(o instanceof String) {
			name = (String) o;
			str = "String type �Դϴ�.";
		} else if(o instanceof Character) {
			c = (char) o;
			str = "char type �Դϴ�.";
		}
		System.out.println(o + " �� " + str);
		System.out.printf("%s �� %s\r\n" , o, str);
	}
	
	public static void main(String[] args) {
		new Test08();
	}

}

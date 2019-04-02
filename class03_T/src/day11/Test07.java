package day11;

public class Test07 extends Test07_01{
/*
	*****
	�Լ��� �������̵�( Overriding : �Լ��� ������ )
		==> ��� ���迡 �ִ� ���� Ŭ��������
			���� Ŭ������ ���� �Լ��� ����� �����ϴ� ����
			
		���]
			1. ���� Ŭ������ ���� �Լ��� ������ ������ ���·� ������ �Ѵ�.
					����� �Լ��� ����(Prototype)
						��ȯ��	+ �Լ��̸� + �Ű���������Ʈ
						
			2. ���������ڴ� ���� ����
			3. ����ó����	���� ���� ����
			
		�̷��� �������̵��� �ϸ�
		����������  super�� �Լ��� �������� �������� �Լ� ����� �ȴ�.
		
		super : ������� Ŭ������ ����Ű�� �����
				�ݵ�� ����Ŭ���� �Ҽ����� ������ ��� ���
		
		���� �������̵� ������ �Լ��� ����� ����ϰ��� �ϸ�
			super.�Լ��̸�();
			
			��]
				class Father {
					int abc(int a){
						return a + 1;
					}
				}
				class Son extends Father {
					
					Son(){
						int a = abc();
						int b = super.abc();
					}
					
					int abc(int a){
						return a * 2 ;
					}
					
				}
				
				
 */
	public Test07() {
		int no1 = abc(10);
		System.out.println("abc() : " + no1);
		
		// ����Ŭ������ abc() �Լ��� ����ϰ����� ���
		int no2 = super.abc(10);
		System.out.println("super.abc() : " + no2);
	}
	
	public int abc(int a) {
		return a * 2;
	}
	
	public static void main(String[] args) {
		new Test07();
	}

}

class Test07_01{
	public int abc(int a) {
		return a + 1;
	}
}

package day15;

public class Test06 {
/*
		����Ŭ����(Wrapper Class)
			==> �ڹٿ��� �⺻ ������ Ÿ���� ������ ���۷��������� �ƴϴ�.
				�ٽø��ؼ� ��ü�� �ƴϴ�.
				�̸��� ��üó�� ����ؾ��� �� ������ �ɼ� �ִٴ� ���̰�
				�̰��� �ذ��ϱ����ؼ� ���� Ŭ������
				����Ŭ������ �Ѵ�.
				���� ���ڸ� int �� ��üó�� �ٷ�� �ʹٸ�??? ==> Integer
				
			����]
				�ڹٴ� Object �������� ��������ȭ�ؼ�
				Ŭ������ �̿��ϵ��� ����� ��ü�������̴�.
				
				������ �⺻������Ÿ�� ��ŭ�� ��ü��������� ������� �ʴ´�.
				==> ������ ������ ������ �߻��� �� �ִ�.
				
				
			***
			Boxing & Unboxing
				Boxing : �⺻������Ÿ��(value Type)�� ��ü��(�ּ�Ÿ������) ��ȯ�ϴ� ��.
						��]
							int -> Integer
							
				Unboxing : Heap ������ �ִ� ������(�ּ�Ÿ��, ���۷���Ÿ��)�� �ٽ� �⺻������ Ÿ������ ��ȯ�ϴ� ��..
						��]
							Integer -> int
							
							
		���]
			����Ŭ������ Boxing & Unboxing �� ���ֱ� ���� Ŭ����
			
		����]
			���� �ȴ�.
			��?
				�ڹ� 1.4 ���ʹ� �ڵ����� Boxing, Unboxing �Ǵϱ�....
				
				
		***
		Integer.parseInt() ���� �Լ����� ����Ŭ�����ȿ� ���� �ְ�
		���� ����� ���Ǳ� ������...
 */
	public Test06() {
		// Boxing - heap ������ �ڽ��� ������ �ֱ�
		Integer num = 10;
		Integer no1 = new Integer(10);
		
		int bunho = num;	// Unboxing - heap �ڽ����� �����͸� �⺻Ÿ������ ������ �۾�
		
		System.out.println(Integer.compare(10, 5));
		System.out.println(Integer.compare(5, 5));
		System.out.println(Integer.compare(5, 6));
		
		System.out.println("Integer equals : " + num.equals(10));
		
		System.out.println("Intege.reverse() : " + Integer.reverse(12));
	}

	public static void main(String[] args) {
		new Test06();
	}

}

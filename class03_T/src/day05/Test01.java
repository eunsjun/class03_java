package day05;

public class Test01 {
/*
 * ����ȭ�� ��� - printf()
 * 
 * 		����]
 * 			System.out.printf(ǥ������, ������1, ������2, ...);
 * 
 *  
 *  		ǥ������ �� ������
 *  			1. %b		- ����(boolean)
 *  			2. %d		- 10����(��������)
 *  			3. %o		- 8����
 *  			4. %x, %X	- 16����
 *  			5. %f		- �Ǽ� 10����
 *  			6. %c		- ����
 *  			7. %s		- ���ڿ�
 *  			8. %e, %E	- ��������
 */
	public static void main(String[] args) {
		System.out.printf("%d. %s : %c ����", 65, "ù��°", 'A');
		// ǥ������ ������ ������� �����͸� �Է��ؾ� �Ѵ�.
		System.out.println();
		System.out.println();
		System.out.printf("������ ���� %.2f �Դϴ�.", 3.141592);
		
		System.out.println();
		System.out.printf("%s : %d \r\n", "jFla", 12);
		
		/*
		 * �̽������� ����
		 * 		: ����� �ȵ����� ��� ���Ŀ� ������ ��ġ�� ����...
		 * 		��]
		 * 			�ٹٲ� ��ȣ 
		 * 		\r\n - �ٹٲ�
		 * 		\n 	 - �ٹٲ�
		 * 		\b   - �������̽�
		 * 		\t   - tab 
		 * 		\"   - ���ڿ��� " ����
		 */
		
		System.out.printf("%10s : %4d", "jFla \n", 12);
		
		System.out.println("\" : \\");
		System.out.println("�������� ��δ� \"c:\\Windows\" �Դϴ�.");
	}

}

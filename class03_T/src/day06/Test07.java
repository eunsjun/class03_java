package day06;


/*
 * �μ��� �����ϰ� �߻��ؼ�
 * �μ��� �ִ� ������� ����ϼ���.
 */
public class Test07 {
	public static void main(String[] args) {
		int num1 = (int)(Math.random()*91 + 10);
		int num2 = (int)(Math.random()*91 + 10);
		int min = 0 ;
		int max = 0;

		if(num1 >= num2) {
			min = num2;
			max = num1;
		} else {
			min = num1;
			max = num2;
		}
		
		System.out.println("*** " + num1 + " �� " + num2 + " �� �ִ� ����� ���ϱ� *** ");
		for(int i = min ; i >= 2 ; i-- ) {
			if(min % i == 0 && max % i == 0) {
				System.out.println(num1 + " �� " + num2 + " �� �ִ� ������� " + i + " �Դϴ�.");
				break;
			}
		}
		
	}
}

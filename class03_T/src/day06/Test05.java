package day06;


/*
 * 	�� ����� ����� �ϴµ�
	�ѻ���� ��Ʒ��� 0.54m/s
	�ٸ������ �������� 1.07m/s
	�� ���̰� 764m ��� �����ϸ�
	�λ���� ����������� 
	��� ���� ������ ����ϼ���.
 */
public class Test05 {

	public static void main(String[] args) {
		
		int sec = 0;
		for(int i = 0 ; ; i++ ) {
			float dist1 = 0.54f * i ;// �ö󰡴� ����� ��ġ
			float dist2 = 764 - 1.07f*i;
			
			if(dist1 >= dist2) {
				sec = i;
				System.out.println(i + " �� �Ŀ� ����...");
				break;
			}
		}
		
		int min = sec / 60;
		sec %= 60;
		
		System.out.println("�λ���� ������ �ð��� " + min + " �� " + sec + "�� ���Դϴ�.");
	}

}

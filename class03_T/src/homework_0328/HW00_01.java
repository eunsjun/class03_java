package homework_0328;

public class HW00_01 {

/*
		�μ��� �Է� �޾�
		+ ������ �ϴ� �Լ��� �����
		�����ؼ�
		��ȯ���� �޾�
		����ϼ���...
*/
	public HW00_01() {
		int num = dosooplus(10, 20);
		printsoo(num);
		
		num = minusSoo(30, 5);
		printsoo(num);
		
	}
	public static void main(String[] args) {
		new HW00_01();
	}
	
	/*
	 *  �Լ� ����� ����
	 *  		
	 *  	[����������] 		[�Ӽ�]		��ȯ��Ÿ��|void		�Լ��̸�(�Ű���������Ʈ){
	 *  		�Լ�����.....
	 *  	}
	 */
	
	public int dosooplus(int no1, int no2) {
		System.out.println("no1 : " + no1);
		System.out.println("no2 : " + no2);
		return (no1 + no2);
	}
	
	public int minusSoo(int no1, int no2) {
		System.out.println("minusSoo no1 : " + no1);
		System.out.println("minusSoo no2 : " + no2);
		return (no1 - no2);
	}
	
	public void printsoo(int soo) {
		System.out.println("�Էµ� �� : " + soo);
		return;
	}
	
	public String strsoo(int soo) {
		return (soo + "");
	}

}

package day11;

/*
 * �� Ŭ������ ��� �޾Ƽ�
 * �ﰢ�� Ŭ����, �� Ŭ������ ����� �ʿ��ϸ� �������̵��ϼ���.
 * 
 * 
 */

// �簢�� Ŭ����
public class HW01 {
	
	public int no1, no2 ;
	public float area;
	
	public HW01() {
		System.out.println("### �簢�� Ŭ���� ###");
	}
	
	public HW01(int no1, int no2) {
		this.no1 = no1;
		this.no2 = no2;
	}
	
	public HW01(float no1, float no2) {
		
	}
	
	public HW01(String no1, String no2) {
		this.no1 = Integer.parseInt(no1);
		this.no2 = Integer.parseInt(no2);
	}
	
	public void calcArea() {
		area = no1 * no2 ;
	}
	
	public static void main(String[] args) {
		new HW01(10, 20);
		new HW01(10.f, 20.f);
		new HW01();
		new HW01("10", "20");
	}

}

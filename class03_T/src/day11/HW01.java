package day11;

/*
 * 이 클래스를 상속 받아서
 * 삼각형 클래스, 원 클래스를 만들고 필요하면 오버라이딩하세요.
 * 
 * 
 */

// 사각형 클래스
public class HW01 {
	public int no1, no2 ;
	public float area;
	
	public HW01() {
		System.out.println("### 사각형 클래스 ###");
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

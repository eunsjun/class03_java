package day11;

/*
 * 이 클래스를 상속 받아서
 * 삼각형 클래스, 원 클래스를 만들고 필요하면 오버라이딩하세요.
 * 
 * 
 */

// 사각형 클래스
public class HW01 {
	int no1, no2 ;
	float area;
	public HW01() {
	}
	public HW01(int no1, int no2) {
		this.no1 = no1;
		this.no2 = no2;
	}
	void calcArea() {
		area = no1 * no2 ;
	}

}

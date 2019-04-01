package day10;

public class Semo {
	int wid, heig;
	
	// 기본 생성자 함수
	public Semo() {
	}
	
	// 변수 초기화해주는 함수(생성자 함수)
	public Semo(int no1, int no2) {
		wid = no1;
		heig = no2;
	}
	
	// 면적 구해주는 함수
	public float getArea() {
		return wid * heig / 2f;
	}
}

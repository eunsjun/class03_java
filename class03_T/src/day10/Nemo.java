package day10;

public class Nemo {
	int garo, sero ;
	
	// JVM이 기본 생성자 함수를 자동으로 만들어주는 경우는
	// 생성자함수를 아무것도 정의 하지 않았을경우에 한해서만 만든다.

	// 데이터를 입력하지 않고 생성자 함수를 호출하는 경우
	// 이 경우는 강제로 원하는 값을 데이터에 대입해준다.
	public Nemo() { // 기본 생성자 함수
		garo = 10; // this.garo = 10;
		sero = 10; // this.sero = 10;
	}
	
	public Nemo(int no1, int no2) {
		garo = no1;
		sero = no2;
	}
	
	// 면적 구해주는 함수
	public int myunjuk() {
		return garo * sero;
	}

}

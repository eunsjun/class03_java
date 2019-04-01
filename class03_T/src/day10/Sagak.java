package day10;

/*
	이 클래스는 사각형에 관련된 기능을 가지는 클래스...
		사각형이 가져야될 요소는
			가로, 세로, 면적
		이 있을 것이다.
	필요한 요소들을 전역변수로 만들어서
	다른곳에서 사용해 보자.
 */
public class Sagak {
	// 필요한 전역변수 만들고
	int garo, sero, area;
	
	// 면적 구해주는 함수
	public void calcArea() {
		area = garo * sero;
	}
}

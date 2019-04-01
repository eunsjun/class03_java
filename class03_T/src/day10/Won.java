package day10;

public class Won {
	int c1, c2;
	float area1, area2;
	
	public Won() {
	}
	
	
	// 생성자 함수는 클래스가 객체로 될때 제일 처음 실행되는 함수이다.
	public Won(int no1, int no2) {
		c1 = no1;
		c2 = no2;
		area1 = getArea(c1);
		area2 = getArea(c2);
	}
	
	// 면적 구해주는 함수(<== 반지름을 입력해주면 면적을 계산해서 면적을 반환해주는 함수)
	public float getArea(int no) {
		return no * no * 3.14f;
	}

}

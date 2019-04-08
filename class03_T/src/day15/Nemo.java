package day15;

public class Nemo {
	private int width, height, area;
	
	// 기본 생성자함수 	
	// ==> 객체를 만든다음 데이터를 함수를 통해서 입력해줘야 한다.
	public Nemo() {
	}
	
	// 생성자 함수 오버로딩 <== 가로 세로 길이를 입력하면 만들어주는 함수
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		this.area = width * height;
//		setArea();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	public void setArea() {
		this.area = width * height;
	}
	
	// equals() Overriding
	public boolean equals(Object o) {
		return (this.width == ((Nemo)o).width) && (this.height == ((Nemo)o).height);
	}
	
	// toString() Overriding	<== 출력함수에서 변수를 출력할경우 출력메세지를 오버라이딩....
	public String toString() {
		return ("가로가 " + width + " 이고 세로가 " + height + " 그리고 면적이 "+ area + " 인 네모입니다.");
	}
	
}

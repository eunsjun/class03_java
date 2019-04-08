package day15;

public class Samgak {
	private int width, height;
	private float area;
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
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public void setArea() {
		this.area = width * height / 2f;
	}
	public Samgak() {
	}
	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	// 삼각형이 넓이가 같으면 같은 삼각형으로 처리하는 함수
	public boolean equals(Object obj) { // ==> Overriding
		return this.area == ((Samgak)obj).area;
	}

	public boolean equals(Samgak obj) {	// ==> Overloading
		return this.area == obj.area;
	}
	
	// toString() Overriding
	public String toString() {
		return "이 삼각형은 높이가 " + height + " 이고 밑변이 " + width + " 이고 넓이는 " + area + " 입니다."; 
	}
}

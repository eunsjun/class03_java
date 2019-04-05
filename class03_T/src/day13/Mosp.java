package day13;

public abstract class Mosp {
	private int width;
	private int height;
	private float area;
	
	// 면적 구하는 추상함수
	public abstract void setArea();
	
	// 변수 데이터 입출력함수
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public float getArea() {
		return area;
	}
	public float getArea1() {
		return 0.f;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}

package day13;

public class Nemo1 implements Moyang {
	private int width;
	private int height;
	private float area;
	public Nemo1() {
	}
	public Nemo1(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public void setWidth(int width) {
		this.width = width ;
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void setArea() {
		this.area = width * height ;
	}

	@Override
	public void toStr() {
		System.out.println("가로가 " + width + " 이고 세로가 " + height + " 인 사각형의 넓이는 " + area + " 입니다.");
	}
}

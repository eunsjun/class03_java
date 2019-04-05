package day13;

public class Dongl1 implements Moyang {
	private int width;
	private int height;
	private float area;
	private float area1;
	private final float PI = 3.14f;
	
	public Dongl1() {
	}
	public Dongl1(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public float getArea() {
		return area;
	}
	public float getArea1() {
		return area1;
	}

	public void setArea(float area) {
		this.area = area;
	}
	public void setArea1(float area) {
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
		this.area = width * width * PI;
		this.area1 = height * height * PI ;
	}

	@Override
	public void toStr() {
		System.out.println("반지름이 " + width + " 인 원의 넓이는 " + area + " 입니다.\r\n       반지름이 "+height + " 인 원의 넓이는 " + area1 + " 입니다.");
	}
}

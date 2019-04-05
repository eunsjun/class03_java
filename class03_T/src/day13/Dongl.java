package day13;

public class Dongl extends Mosp {
	final float PI = 3.14f;
	private float area1;
	public Dongl() {
	}
	public Dongl(int width, int height) {
		setWidth(width);
		setHeight(height);
		setArea();
	}
	
	public float getArea1() {
		return area1;
	}

	@Override
	public void setArea() {
		setArea(getWidth() * getWidth() * PI);
		area1 = getHeight() * getHeight() * PI;
	}
}

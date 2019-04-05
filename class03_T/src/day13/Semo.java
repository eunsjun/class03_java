package day13;

public class Semo extends Mosp {

	public Semo() {
	}
	public Semo(int width, int height) {
		setWidth(width);
		setHeight(height);
		setArea();
	}

	@Override
	public void setArea() {
		setArea(getWidth() * getHeight() / 2f);
	}


}

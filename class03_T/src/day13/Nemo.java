package day13;

public class Nemo extends Mosp {

	public Nemo() {
	}
	public Nemo(int width, int height) {
		setWidth(width);
		setHeight(height);
		setArea();
	}

	@Override
	public void setArea() {
		setArea(getWidth() * getHeight());
	}

}

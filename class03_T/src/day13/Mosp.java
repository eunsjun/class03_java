package day13;

public abstract class Mosp {
	private int width;
	private int height;
	private float area;
	
	// ���� ���ϴ� �߻��Լ�
	public abstract void setArea();
	
	// ���� ������ ������Լ�
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

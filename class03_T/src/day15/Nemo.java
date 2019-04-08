package day15;

public class Nemo {
	private int width, height, area;
	
	// �⺻ �������Լ� 	
	// ==> ��ü�� ������� �����͸� �Լ��� ���ؼ� �Է������ �Ѵ�.
	public Nemo() {
	}
	
	// ������ �Լ� �����ε� <== ���� ���� ���̸� �Է��ϸ� ������ִ� �Լ�
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
	
	// toString() Overriding	<== ����Լ����� ������ ����Ұ�� ��¸޼����� �������̵�....
	public String toString() {
		return ("���ΰ� " + width + " �̰� ���ΰ� " + height + " �׸��� ������ "+ area + " �� �׸��Դϴ�.");
	}
	
}

package etc;

public class Samgak {
	private int width, height;
	private float area;
	
	public Samgak() {
		this.width = (int)(Math.random()*10 + 1);
		this.height = (int)(Math.random()*10 + 1);
		this.area = width * height / 2f;
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
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public void setArea() {
		this.area = width * height / 2f;
	}
	
	public String toString() {
		return "--------------------\n�ﰢ�� ]\n\t�غ� : " + width + "\n\t���� : " + height + "\n\t���� : " + area + "\n--------------------";
	}

}

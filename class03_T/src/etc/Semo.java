package etc;

public class Semo implements Comparable{
	private int width, height;
	private float area;
	
	public Semo() {
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
		return "--------------------\n�ﰢ�� ]\n\t�غ� : " + width + 
				"\n\t���� : " + height + 
				"\n\t���� : " + area + 
				"\n--------------------";
	}
	
	@Override
	public int compareTo(Object o) {
		return -(this.width*this.height - ((Semo)o).getWidth()*((Semo)o).getHeight());
	}
}

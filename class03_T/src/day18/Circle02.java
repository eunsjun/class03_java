package day18;

public class Circle02 implements Comparable{
	private int rad;
	private float arround, area;
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public float getArround() {
		return arround;
	}
	public void setArround(float arround) {
		this.arround = arround;
	}
	public void setArround() {
		this.arround = (int)(2 * rad * 3.14f * 100 + 0.5f) / 100f;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public void setArea() {
		this.area = (int)(rad * rad * 3.14f * 100 + 0.5f) / 100f;
	}
	
	public String toString() {
		return "--------------------\n반지름 : " + rad + 
				"\n원둘레 : " + arround + 
				"\n원넓이 : " + area;
	}
	@Override
	public int compareTo(Object o) {
		return (this.rad - ((Circle02)o).getRad());
	}
}

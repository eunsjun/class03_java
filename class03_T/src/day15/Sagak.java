package day15;

public class Sagak {
	int width, height, area;
	public Sagak() {
	}
	
	public boolean equals(Object obj) {
		return this.area == ((Sagak)obj).area;
	}
	
	public String toString() {
		return "이것은 삼각형은 아닙니다.";
	}
}

package day10;

public class Won {
	int c1, c2;
	float area1, area2;
	
	public Won() {
	}
	
	
	// ������ �Լ��� Ŭ������ ��ü�� �ɶ� ���� ó�� ����Ǵ� �Լ��̴�.
	public Won(int no1, int no2) {
		c1 = no1;
		c2 = no2;
		area1 = getArea(c1);
		area2 = getArea(c2);
	}
	
	// ���� �����ִ� �Լ�(<== �������� �Է����ָ� ������ ����ؼ� ������ ��ȯ���ִ� �Լ�)
	public float getArea(int no) {
		return no * no * 3.14f;
	}

}

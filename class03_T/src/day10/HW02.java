package day10;

public class HW02 {
/*
 * ���� 2]
 * 		�ѻ������ �л���ȣ, �ڹ�, ����Ŭ, jsp, spring, ���� �� �����ϴ� Ŭ������ ���弼��.
 * 		��, ������ ������ �Լ��� ������ �� ������ �Էµǰ� �ϼ���.
 * 		�׸��� ���� �� ���ϴµ� �Լ��� ó���ϼ���.
 * 
 * ���� 3]
 * 		�ٸ� Ŭ������ ����
 * 		�츮�� ��ü�� ������ ó���ϰ� �ϼ���.
 * 
 * 		HW02[] ban = new HW02[15];
 */
	int no, java, oracle, jsp, spring, total;
	
	public HW02() {
		this(getNo(), getScore(), getScore(), getScore(), getScore());
	}
	
	public HW02(int n, int sc1, int sc2, int sc3, int sc4) {
		
	}
	
	public static int getNo() {
		return (int)(Math.random()*15 + 1);
	}
	
	public static int getScore() {
		return (int)(Math.random()*101);
	}
	public static void main(String[] args) {
		new HW02();
	}

}

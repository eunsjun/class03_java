package day10;

public class HW02 {
/*
 * ���� 2]
 * 		�ѻ������ �л��̸�, �ڹ�, ����Ŭ, jsp, spring, ���� �� �����ϴ� Ŭ������ ���弼��.
 * 		��, ������ ������ �Լ��� ������ �� ������ �Էµǰ� �ϼ���.
 * 		�׸��� ���� �� ���ϴµ� �Լ��� ó���ϼ���.
 * 
 * ���� 3]
 * 		�ٸ� Ŭ������ ����
 * 		�츮�� ��ü�� ������ ó���ϰ� �ϼ���.
 * 
 * 		HW02[] ban = new HW02[15];
 * 
 * 		ban[0].name = "������";
 * 		ban[1].name = "������";
 */
	String name = "";
	int java, oracle, jsp, spring, total;
	
	public HW02() {
		
	}
	
	public HW02(String sname, int sc1, int sc2, int sc3, int sc4) {
		name = sname;
		java = sc1;
		oracle = sc2;
		jsp = sc3;
		spring = sc4;
		setTotal();
		
		System.out.println(name + " | " + java + " | " + oracle + " | " + jsp + " | " + spring + " | " + total);
	}
	
	public void setTotal() {
		total = java + oracle + jsp + spring ;
	}
	/*
	 * public static void main(String[] args) { new HW02("������", 80, 85, 95, 90); }
	 */
}

package day11;

/*
 * 		�ѻ������ �л��̸�, �ڹ�, ����Ŭ, jsp, spring, ���� �� �����ϴ� Ŭ������ ���弼��.
 * 		��, ������ ������ �Լ��� ������ �� ������ �Էµǰ� �ϼ���.
 * 		�׸��� ���� �� ���ϴµ� �Լ��� ó���ϼ���.
 */
public class HW00_02 {
	String name;
	int java, oracle, jsp, spring, total;
	
	public HW00_02() {
	}
	
	public HW00_02(String sname) {
		name = sname;
	}
	public HW00_02(String sname, int no1, int no2, int no3, int no4) {
		this(sname);
		java = no1;
		oracle = no2;
		jsp = no3;
		spring = no4;
		
		// ��������ؼ� �����ϱ�...
		setTotal();
		toPrint();
	}
	
	// ���� ������ִ� �Լ�
	public void setTotal() {
		total = java + oracle + jsp + spring ;
	}
	
	public void toPrint() {
		System.out.println(name + " - " + java + " | " + oracle + " | " + jsp + " | " + spring + " | " + total);
	}
	
	public static void main(String[] args) {
		new HW00_02("������", 80, 70, 90, 100);
	}

}

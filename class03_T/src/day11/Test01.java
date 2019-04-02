package day11;

public class Test01 {

/*
		�������� <== �Լ� ���� & ȣ��
			==> �Լ��� ���鶧 
				�Ű������� Ÿ�԰� ������ �������� �Ѵ�.
				�׷��� ȣ���� ���� ������ Ÿ�԰� ������ �°� �����͸� �Է������ 
				�Լ��� ȣ���� �� �־���.
				
			���� �������� ������ ������ �� ���� ��
			����� �� �ֵ��� ����� ���� ����...
			==> �������� ������ ������� ��� �����͸� �� ���� �� �ִ�.
		
		����]
			��ȯ������|Ÿ��		�Լ��̸�(�������� ... �����̸�){}
			
			��]
				void abc(int ... num){}
				
				==> abc(10, 20);
				==> abc(5, 6, 7, 8);
			
			*
			����]
				�������� ������ �ڵ� �迭 ������ �ȴ�.
				���� �迭����ó�� �ٷ��� �Ѵ�.
			
			����]
				�������� ������ �տ��� �ٸ� �Ű������� �͵� ��� ����.
				�������� ���� �ڿ��� �ٸ� �谳������ ���� ���� �ȵȴ�.
					public HW00_02(String sname, int no1, int no2, int no3, int no4) {
						this(sname);
						java = no1;
						oracle = no2;
						jsp = no3;
						spring = no4;
						
						// ��������ؼ� �����ϱ�...
						setTotal();
					}
					
				==>
					public HW00_02(String sname, int ... no) {
						this(sname);
						java = no[0];
						oracle = no[1];
						jsp = no[2];
						spring = no[3];
						
						// ��������ؼ� �����ϱ�...
						setTotal();
					}
		
 */
	// �Է¹��� ������ ���� �����ִ� �Լ��� ���弼��. ������ ������� ���弼��...
	
	int total;
	int total2;
	public Test01() {
		setTotal(1, 2, 7, 9);
		toPrint();
	}
	
	public void setTotal(int...no) {
		for(int i = 0; i < no.length ; i++ ) {
			total += no[i];
		}
		
		for(int num : no) {
			total2 += num;
		}
	}
	
	// total, total2�� ������ ������ִ� �Լ�
	public void toPrint() {
		System.out.println("Total : " + total);
		System.out.println("Total2 : " + total2);
	}

	public static void main(String[] args) {
		new Test01();
	}

}

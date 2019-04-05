package day13;

/*
	���� 2]
		���� Ŭ������ �߻� Ŭ������ �����
		�� Ŭ������ ��� �޾Ƽ�
		�ﰢ��, �簢��, ����
		Ŭ������ �����
		�����ϰ� ������ �������߿��� �̾Ƽ�
		10���� ������ �迭�� �����
		������ ���ؼ�
		����ϼ���.
		
		
	���� 3]
		���� 2���� �߻�Ŭ������ �������̽��� ���� ó���ϼ���.
 */

import static java.lang.Math.*;
public class HW02 {
	Mosp[] mosp;
	public HW02() {
		mosp = new Mosp[10];
		setMosp();
		toPrint();
	}
	
	public void setMosp() {
		
		for(int i = 0 ; i < mosp.length ; i++ ) {
			char ch = (char)(random()*3 + 'A');
			
			int width = (int)(random()*99 + 1);
			int height = (int)(random()*99 + 1);
			
			switch(ch) {
			case 'A':
				mosp[i] = new Semo(width, height);
				break;
			case 'B':
				mosp[i] = new Nemo(width, height);
				break;
			case 'C':
				mosp[i] = new Dongl(width, height);
				break;
			}
		}
	}
	
	public void toPrint() {
		int no = 0;
		
		StringBuffer buff = new StringBuffer();
		for(Mosp m : mosp) {
			if(++no != 10) {buff.append(" ");}
			buff.append(no);
			if(m instanceof Semo) {
				buff.append(". �غ��� ");
				buff.append(m.getWidth());
				buff.append(" �̰� ���̰� ");
				buff.append(m.getHeight());
				buff.append(" �� �ﰢ���� ���̴� ");
				buff.append(m.getArea());
				buff.append(" �Դϴ�.");
			} else if(m instanceof Nemo) {
				buff.append(". ���ΰ� ");
				buff.append(m.getWidth());
				buff.append(" �̰� ���ΰ� ");
				buff.append(m.getHeight());
				buff.append(" �� �簢���� ���̴� ");
				buff.append(m.getArea());
				buff.append(" �Դϴ�.");
			} else if(m instanceof Dongl) {
				buff.append(". �������� ");
				buff.append(m.getWidth());
				buff.append(", ");
				buff.append(m.getHeight());
				buff.append(" �� ������ ���̴� ");
				buff.append(m.getArea());
				buff.append(", ");
				buff.append(m.getArea1());
				buff.append(" �Դϴ�.");
				
				/*
				 * buff.append(". �������� "); buff.append(((Dongl)m).getWidth());
				 * buff.append(", "); buff.append(((Dongl)m).getHeight());
				 * buff.append(" �� ������ ���̴� "); buff.append(((Dongl)m).getArea());
				 * buff.append(", "); buff.append(((Dongl)m).getArea1()); buff.append(" �Դϴ�.");
				 * 
				 */			}
			
			System.out.println(buff.toString());
			buff.delete(0, buff.length());
			if(m instanceof Dongl) {
				System.out.println("          				" + (m.getWidth()*m.getWidth()*3.14f));
				System.out.println("          				" + (m.getHeight()*m.getHeight()*3.14f));
			}
		}
	}
	
	public static void main(String[] args) {
		new HW02();
	}

}

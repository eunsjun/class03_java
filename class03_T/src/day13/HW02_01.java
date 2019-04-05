package day13;

import static java.lang.Math.*;
public class HW02_01 {
	Moyang[] moyang ;
	public HW02_01() {
		moyang = new Moyang[10];
		setData();
		toPrint();
	}
	
	public void setData() {
		char ch = ' ';
		int no1 = 0, no2 = 0;

		for(int i = 0 ; i < moyang.length ; i++ ) {
			ch = (char)(random()*3 + 'A');
			no1 = (int)(random()*20 + 1);
			no2 = (int)(random()*20 + 1);
			
			switch(ch) {
			case 'A':
				moyang[i] = new Semo1(no1, no2);
				break;
			case 'B':
				moyang[i] = new Nemo1(no1, no2);
				break;
			default :
				moyang[i] = new Dongl1(no1, no2);
			}
		}
	}
	
	public void toPrint() {
		int no = 0;
		for(Moyang m : moyang) {
			if(++no != 10) {
				System.out.print(" ");
			}
			System.out.print(no + ". ");
			m.toStr();
		}
	}

	public static void main(String[] args) {
		new HW02_01();
	}

}

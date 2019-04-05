package day13;

/*
	문제 2]
		도형 클래스를 추상 클래스로 만들고
		그 클래스를 상속 받아서
		삼각형, 사각형, 원형
		클래스를 만들고
		램덤하게 세가지 도형들중에서 뽑아서
		10개를 저장할 배열을 만들고
		면적을 구해서
		출력하세요.
		
		
	문제 3]
		문제 2번의 추상클래스를 인터페이스로 만들어서 처리하세요.
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
				buff.append(". 밑변이 ");
				buff.append(m.getWidth());
				buff.append(" 이고 높이가 ");
				buff.append(m.getHeight());
				buff.append(" 인 삼각형의 넓이는 ");
				buff.append(m.getArea());
				buff.append(" 입니다.");
			} else if(m instanceof Nemo) {
				buff.append(". 가로가 ");
				buff.append(m.getWidth());
				buff.append(" 이고 세로가 ");
				buff.append(m.getHeight());
				buff.append(" 인 사각형의 넓이는 ");
				buff.append(m.getArea());
				buff.append(" 입니다.");
			} else if(m instanceof Dongl) {
				buff.append(". 반지름이 ");
				buff.append(m.getWidth());
				buff.append(", ");
				buff.append(m.getHeight());
				buff.append(" 인 원들의 넓이는 ");
				buff.append(m.getArea());
				buff.append(", ");
				buff.append(m.getArea1());
				buff.append(" 입니다.");
				
				/*
				 * buff.append(". 반지름이 "); buff.append(((Dongl)m).getWidth());
				 * buff.append(", "); buff.append(((Dongl)m).getHeight());
				 * buff.append(" 인 원들의 넓이는 "); buff.append(((Dongl)m).getArea());
				 * buff.append(", "); buff.append(((Dongl)m).getArea1()); buff.append(" 입니다.");
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

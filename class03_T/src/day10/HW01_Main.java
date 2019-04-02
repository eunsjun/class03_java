package day10;

public class HW01_Main {
	HW01 score ;
	
	public HW01_Main() {
		score = new HW01();
		
		for(int i = 0 ; i < score.class03.length ; i++ ) {
			System.out.println("학생 번호 : " + score.class03[i][0]);
		}
		
		int rad = (int)(Math.random()*31 + 70);
	}
	
	public HW01_Main(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		new HW01_Main();
//		new HW01_Main("제자님 공부하세요!");
	}

}

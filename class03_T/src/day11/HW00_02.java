package day11;

/*
 * 		한사람분의 학생이름, 자바, 오라클, jsp, spring, 총점 을 저장하는 클래스를 만드세요.
 * 		단, 성적은 생성자 함수를 실행할 때 점수가 입력되게 하세요.
 * 		그리고 총점 도 구하는데 함수로 처리하세요.
 */
public class HW00_02 {
	String name;
	int java, oracle, jsp, spring, total;
	
	public HW00_02() {
	}
	
	public HW00_02(String sname) {
		name = sname;
	}

	/*
	 * public HW00_02(String sname, int no1, int no2, int no3, int no4) {
	 * this(sname); java = no1; oracle = no2; jsp = no3; spring = no4;
	 * 
	 * // 총점계산해서 대입하기... setTotal(); // toPrint(); }
	 */
	public HW00_02(String sname, int ... no ) {
		this(sname);
		java = no[0];
		oracle = no[1];
		jsp = no[2];
		spring = no[3];
		
		// 총점계산해서 대입하기...
		setTotal();
//		toPrint();
	}
	
	// 총점 계산해주는 함수
	public void setTotal() {
		total = java + oracle + jsp + spring ;
	}
	
	public void toPrint() {
		System.out.println(name + " - " + java + " | " + oracle + " | " + jsp + " | " + spring + " | " + total);
	}
	
	public static void main(String[] args) {
		HW00_02 score = new HW00_02("전영수", 80, 70, 90, 100);
		score.toPrint();
		
		HW00_02 score1 = new HW00_02("김태형", 100, 100, 90, 100);
		score1.toPrint();
	}

}

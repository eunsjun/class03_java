package day10;

public class HW02 {
/*
 * 문제 2]
 * 		한사람분의 학생이름, 자바, 오라클, jsp, spring, 총점 을 저장하는 클래스를 만드세요.
 * 		단, 성적은 생성자 함수를 실행할 때 점수가 입력되게 하세요.
 * 		그리고 총점 도 구하는데 함수로 처리하세요.
 * 
 * 문제 3]
 * 		다른 클래스를 만들어서
 * 		우리반 전체의 성적을 처리하게 하세요.
 * 
 * 		HW02[] ban = new HW02[15];
 * 
 * 		ban[0].name = "강찬규";
 * 		ban[1].name = "강태훈";
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
	 * public static void main(String[] args) { new HW02("전영수", 80, 85, 95, 90); }
	 */
}

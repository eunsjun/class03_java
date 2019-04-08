package day15;


import static java.lang.Math.*;
public class Test05 {
/*
	Question]
		우리반 학생 한명의 점수를 관리할 클래스를 만들고
		만들어진 인스턴가 이름이 같으면 같은 사람으로 처리되게
		작성하세요....
		그리고
		변수를 출력하면
			전영수 : 90, 90, 90, 90, 90, 90
			총점 : 540, 
			평균 : 90.0
		으로 출력되게 하세요.
 */
	
	String[] name = {"강찬규", "강태훈", "김상우", "김태헌", "김태형",
			"김형준", "김환진", "박정헌", "박형진", "서병주",
			"안다예", "양희준", "전영수", "조원용", "허준석" };
	
	public Test05() {
		int[] score = getNumArr();
		Score s1 = new Score(name[13], score[0], score[1], score[2], score[3], score[4], score[5]);
		score = getNumArr();
		Score s2 = new Score(name[13], score[0], score[1], score[2], score[3], score[4], score[5]);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1 과 s2 학생은 같습니까??? : " + (s1.equals(s2) ? "예! 같은 학생입니다." : "아니오. 다른 학생입니다."));
	}
	
	// 데이터 입력해주는 함수
	public int[] getNumArr() {
		int[] no = new int[6];	// 배열 공간만 만들어 놓은 상태
		for(int i = 0 ; i < no.length ; i++ ) {
			no[i] = (int)(random()*41 + 60);
		}
		
		return no;
	}
	
	
	public static void main(String[] args) {
		new Test05();
	}

}

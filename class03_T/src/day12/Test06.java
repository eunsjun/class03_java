package day12;

/*
 *  Test05 에 학생 한명의 데이터를 저장할 수 있도록 해놓았으니
 *  이제 우리반 전체의 데이터를 변수에 담아보자.
 */

public class Test06 {
	// 배열로 15명 데이터가 들어갈 공간을 만들어 놓자.
	Test05[] score ;
	String[] ban = {"강찬규", "강태훈", "김상우", "김태헌", "김태형",
			"김형준", "김환진", "박정헌", "박형진", "서병주",
			"안다예", "양희준", "전영수", "조원용", "허준석" };
	public Test06() {
		score = new Test05[15];
		setName(); // 실행시켜줘야 이름이 입력이 된다.
		/*
		 * int no = 0; for(Test05 t : score) { System.out.println( ++no + ". " +
		 * t.getName()); }
		 */
		
		setScore();
		toPrint();
	}
	
	// 인스턴스를 만들고 이름을 저장하는 함수
	public void setName() {
		for(int i = 0 ; i < score.length ; i++ ) {
			// 각 학생별로 인스턴스를 만들자.
			score[i] = new Test05();
			/*
			 * String irum = ban[i]; score[i].setName(irum);
			 */
			score[i].setName(ban[i]);
		}
	}
	
	// 각 학생별 과목 점수 입력하는 함수
	public void setScore() {
		// 할일
		// 1. 입력하려면 대상이 있어야 되니 하나씩 꺼내보자.
		for(int i = 0 ; i < score.length ; i++ ) {
			// 배열에 랜덤하게 6과목 점수를 저장해두자.
			int tscore[] = new int[6];
			for(int j = 0 ; j < 6 ; j++ ) {
				tscore[j] = (int) (Math.random()*41 + 60);
			}
			
			// 6과목 점수를 각 과목에 입력하자.
			score[i].setJavaScore(tscore[0]);
			score[i].setOracleScore(tscore[1]);
			score[i].setJspScore(tscore[2]);
			score[i].setSpringScore(tscore[3]);
			score[i].setWebScore(tscore[4]);
			score[i].setJsScore(tscore[5]);
			
			// 총점 구하기
			score[i].setTotal();
		}
	}
	
	// 학생 모두의 정보를 출력해주는 함수
	public void toPrint() {
		System.out.printf("%6s | %6s | %6s | %6s | %6s | %6s | %6s | %6s |\r\n", "이  름", "java", "oracle", "j s p", "spring", "w e b", "j   s", "Total");
		System.out.println("======================================================================");
		for(Test05 t : score) {
			System.out.printf("%4s | %6d | %6d | %6d | %6d | %6d | %6d | %6d |\r\n", 
								t.getName(), t.getJavaScore(),
								t.getOracleScore(), t.getJspScore(), 
								t.getSpringScore(), t.getWebScore(), 
								t.getJsScore(), t.getTotal());
		}
		System.out.println("======================================================================");
	}
	
	// 총점이 높은 순으로 정렬하세요...
	
	public static void main(String[] args) {
		new Test06();
	}

}

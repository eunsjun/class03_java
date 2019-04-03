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
		int no = 0;
		for(Test05 t : score) {
			System.out.println( ++no + ". " + t.getName());
		}
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
	
	public static void main(String[] args) {
		new Test06();
	}

}

package day07;

import java.util.Arrays;

public class Test05 {
/*
	String[] team1 = {"강찬규", "강태훈", "김상우", "김태헌", "김태형"};
	String[] team2 = {"김형준", "김환진", "박정헌", "박형진", "서병주"};
	String[] team3 = {"안다예", "양희준", "전영수", "조원용", "허준석"};
	
	1. 세팀을 깊은 복사로 합쳐주세요...
	
	2. 각 팀을 얕은 복사로 복사하고
		수정해보세요...
	
 */
	public static void main(String[] args) {
		String[] team1 = {"강찬규", "강태훈", "김상우", "김태헌", "김태형"};
		String[] team2 = {"김형준", "김환진", "박정헌", "박형진", "서병주"};
		String[] team3 = {"안다예", "양희준", "전영수", "조원용", "허준석"};
		
		String[] class03 = new String[15];
		
		// 깊은 복사
		System.arraycopy(team1, 0, class03, 0, 5);
		System.arraycopy(team2, 0, class03, team1.length, 5);
		System.arraycopy(team3, 0, class03, team1.length + team2.length, 5);
		
		System.out.println("■■■■■■■■■■■■■■ class03 ■■■■■■■■■■■■■■");
//		System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇");
		for(int i = 0 ; i < class03.length ; i++ ) {
			System.out.print(class03[i]);
			if((i+1) % 5 == 0 & i != class03.length - 1) {
				System.out.println();
				System.out.println("-------------------------------------");
			} else if(i == class03.length - 1){
				System.out.println();
			} else {
				System.out.print(" | ");
			}
			
		}
		System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇");
		//
		
	}

}

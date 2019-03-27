package day07;

import java.util.Arrays;

public class Test04 {
/*
 * 배열 복사 방법
 * 		1. 얕은 복사
			: 주소만 복사해 주는 방법
			  ==> 데이터는 원본과 공유하는 방식
			  	  따라서 원본 또는 복사한 배열의 데이터를 변경하면
			  	  나머지 하나도 영향을 받는다.(주소를 공유하므로...)
			  	  
			 방법]
			 	int[] a = new int[5];
			 		==> 데이터 입력하고...
			 	int[] b;
			 	b = a; ==> a의 주소가 복사
			 		
			 		==> a(b)의 내용이 변경이되면 b(a)의 내용도 변경이 된다.
			 		
			 
			 **
			 참고]
			 	지역변수는 해당 블럭 안에서만 사용하는 변수이다.
			 	얕은복사는 다른 지역에서(다른 블럭) 사용할 목적으로 많이 사용이 된다.
			
 * 		2. 깊은 복사
 			: 데이터까지 모두 복사해주는 방법
 			  데이터까지 모두 복사했다는 이야기는 
 			  별도의 heap 영역을 갖는다는 이야기....
 			  
 			  따라서 원본 데이터를 수정해도 전혀 영향이 없다.
 			  
 			  방법]
 			  		명령을 사용해주면 된다.
 			  		
 			  		명령]
 			  			System.arraycopy(
 			  					원본데이터주소, 
 			  					원본데이터시작인덱스, 
 			  					복사받을배열주소, 
 			  					복사받을 시작위치, 
 			  					복사받을 데이터 갯수
 			  			);
 	*****
 	배열핵심리뷰]
 	 		배열의 단점 
 	 			1. 만들때 길이를 반드시 지정해야된다.
 	 			2. 만들어진 배열의 길이는 절대로 수정못한다.
 	 			3. 같은 형태의 데이터만 입력이 된다.
 	 		
 	 		*****	
 	 		따라서 배열의 길이가 더 필요한 경우에는 
 	 		필요한 길이만큼 배열을 만들고
 	 		깊은복사로 데이터를 카피해서 넣는 방법을 사용한다.
 			  
 */
	public static void main(String[] args) {
		String[] name = {"전영수", "강찬규", "박정헌", "양희준", "김태형"};
		
		// 깊은 복사
		String[] team = new String[6];
		team[0] = "안다예";
		System.arraycopy(name, 0, team, 1, 5);
		System.out.println("team[] : " + Arrays.toString(team));
		// 얕은 복사
		String[] irum;
		irum = name;
		
		name[0] = "안다예";
		
		System.out.println("name[] : " + Arrays.toString(name));
		System.out.println("irum[] : " + Arrays.toString(irum));
		System.out.println("team[] : " + Arrays.toString(team));
		
		
		
	}

}

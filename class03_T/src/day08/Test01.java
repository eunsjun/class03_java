package day08;

public class Test01 {

	public static void main(String[] args) {
		int[][] num = new int[5][5];
		int no = 1;
		
		// 초기화
		
		for(int i = 0 ; i < 5 ; i++ ) {
		// 배열 선택 for 명령
			for(int j = 0 ; j < 5 ; j++ ) {
				num[i][j] = no++;
			}
		}
		
		// 출력
		for(int i = 0 ; i < num.length ; i++ ) {
			System.out.print((i+1) + " 번째 배열 : ");
			for(int j = 0 ; j < num[i].length ; j++ ) {
				System.out.printf("%2d",num[i][j]);
				String str = "";
				if(j != num[i].length - 1) {
					str = " | ";
				} else {
					str = "\r\n";
				}
				System.out.print(str);
			}
		}
	}

}

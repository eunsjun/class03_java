package day08;

public class Test01 {

	public static void main(String[] args) {
		int[][] num = new int[5][5];
		int no = 1;
		
		// �ʱ�ȭ
		
		for(int i = 0 ; i < 5 ; i++ ) {
		// �迭 ���� for ���
			for(int j = 0 ; j < 5 ; j++ ) {
				num[i][j] = no++;
			}
		}
		
		// ���
		for(int i = 0 ; i < num.length ; i++ ) {
			System.out.print((i+1) + " ��° �迭 : ");
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

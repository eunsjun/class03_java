package day10;

public class HW03 {
	HW02[] score ;
	String[] ban = {"������", "������", "����", "������", "������",
					"������", "��ȯ��", "������", "������", "������",
					"�ȴٿ�", "������", "������", "������", "���ؼ�" };
	public HW03() {
		score = new HW02[15];
		int[] jumsoo = new int[4];
		
		// ���� ���� �̱�
		for(int i = 0 ; i < score.length ; i++ ) {
			for(int j = 0 ; j < jumsoo.length ; j++ ) {
				jumsoo[j] = (int)(Math.random()*51 + 50);
			}
			score[i] = new HW02(ban[i], jumsoo[0], jumsoo[1], jumsoo[2], jumsoo[3]);
			score[i].total = jumsoo[0] + jumsoo[1] + jumsoo[2] + jumsoo[3] ;
		}
		
//		for(int i = 0 ; i < score.length ; i++ ) {
//			System.out.println(score[i].name + " | " + score[i].java + " | " + score[i].oracle + " | " +score[i].jsp + " | " + score[i].spring + " | " + score[i].total);
//		}
	}
	
	

	public static void main(String[] args) {
		new HW03();
	}

}

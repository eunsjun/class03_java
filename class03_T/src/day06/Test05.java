package day06;


/*
 * 	두 사람이 등산을 하는데
	한사람은 산아래서 0.54m/s
	다른사람은 산위에서 1.07m/s
	산 높이가 764m 라고 가정하면
	두사람의 랑데뷰시점은 
	몇분 몇초 뒤인지 출력하세요.
 */
public class Test05 {

	public static void main(String[] args) {
		
		int sec = 0;
		for(int i = 0 ; ; i++ ) {
			float dist1 = 0.54f * i ;// 올라가는 사람의 위치
			float dist2 = 764 - 1.07f*i;
			
			if(dist1 >= dist2) {
				sec = i;
				System.out.println(i + " 초 후에 만남...");
				break;
			}
		}
		
		int min = sec / 60;
		sec %= 60;
		
		System.out.println("두사람이 만나는 시간은 " + min + " 분 " + sec + "초 후입니다.");
	}

}

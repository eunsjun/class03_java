package Homework_0322;

/*
 * 	화씨 온도 100도는 섭씨온도 몇도인지를 알아보는 프로그램을 작성하고 ]
	실행하세요.
	공식] 섭씨 온도 = 5 / 9 * (화씨온도 - 32)
 */
public class HW03_01 {
/*
	// 산술 연산 순서
	int num = 3 + 2 * 4 / (7-3);
	// 		(4)		8(2)	/(3)	4(1)
 */
	public static void main(String[] args) {
		float no = (float)(5 / 9) ; // 정수 연산후 소수로 바꾼다.
		float no1 = (5 / 9); // float이 int 보다 크기 때문에 자동형변환이 됬다.
		float no3 = 5 / 9f;
		
		System.out.println(no);
		System.out.println(no1);
		System.out.println(no3);
	}

}

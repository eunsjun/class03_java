package Homework_0322;


/*
 * 문제 3]
	화씨 온도 100도는 섭씨온도 몇도인지를 알아보는 프로그램을 작성하고 ]
	실행하세요.
	공식] 섭씨 온도 = 5 / 9 * (화씨온도 - 32)
 */
public class HW_03 {

	public static void main(String[] args) {
		int fg = 100;
		double cg = (5d / 9 * (fg - 32));
		System.out.println("화씨온도 " + fg + " 는 섭씨온도 " + cg + " 입니다.");
	}

}

package day06;


/*
 * 두수를 랜덤하게 발생해서
 * 두수의 최대 공약수를 출력하세요.
 */
public class Test07 {
	public static void main(String[] args) {
		int num1 = (int)(Math.random()*91 + 10);
		int num2 = (int)(Math.random()*91 + 10);
		int min = 0 ;
		int max = 0;

		if(num1 >= num2) {
			min = num2;
			max = num1;
		} else {
			min = num1;
			max = num2;
		}
		
		System.out.println("*** " + num1 + " 과 " + num2 + " 의 최대 공약수 구하기 *** ");
		for(int i = min ; i >= 2 ; i-- ) {
			if(min % i == 0 && max % i == 0) {
				System.out.println(num1 + " 과 " + num2 + " 의 최대 공약수는 " + i + " 입니다.");
				break;
			}
		}
		
	}
}

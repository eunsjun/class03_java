package Homework_0322;

/*
 * 문제1]
	3 자리로 구성된 숫자 하나를 입력 받은 후
	십자리 이하를 버린 숫자를 만들어서 출력하세요.
	예] 777 ==> 700
 */
import java.util.*;
public class HW_01 {

	public static void main(String[] args) {
		// 입력받고
		Scanner sc = new Scanner(System.in);
		System.out.println("세자리 숫자를 입력하세요! : ");
		String str = sc.next();
		// 데이터 변환하고
		int no1 = Integer.parseInt(str);
		// 가공하고
		int no2 = no1 / 100 * 100 ;
		// 출력한다.
		System.out.println(no1 + " 을 10자리 이하를 버리면 " + no2 + " 입니다!");
	}

}

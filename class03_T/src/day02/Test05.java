package day02;

public class Test05 {

	public static void main(String[] args) {
		long l1 = 65;
		int num1 ;
		
		num1 = (int) l1;
		
		float num2 = 3.14f;
		
		double num3 = num2;
		
		/*
		 * 타입의 크기
		 * 	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		 */
		
		
		float no1 = 10 ;	// 실수는 모든 정수자료형보다 항상 크기때문에 자동 형변환이 이루어진다.
		
		float no2 = 10.f ; // 리터럴풀에 float 타입으로 변형시켜서 저장 하고 변수에 담는다.
		
		int no3 = (int) 3.14;
		System.out.println("no3 : " + no3);
		
		float no4 = no3;
		System.out.println("no4 : " + no4);
		
	}

}

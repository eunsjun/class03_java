package day03;

public class Test09 {

	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * 		&, |, !, &&, ||
		 * 
		 * 자바 비교연산자
		 * 		>, <, >=, <=, == (같다), != (같지않다)
		 */
		
		int no1 = 10;
		int no2 = 20;
		
		System.out.println("no1 > no2 : " + (no1 > no2));
		
		System.out.println("no1 == no2 : " + (no1 == no2));
		
		System.out.println("no1 != no2 : " + (no1 != no2));
		
		System.out.println("false & false : " + (false & false));
		System.out.println("false | false : " + (false | false));
		/*
		 *    -- & --
		 * 		 true  		false
		 * true   true      false
		 * false  false     false
		 * 
		 * 
		 *   -- | -- 
		 *        
		 *        		true			false
		 *    true      true 			true
		 *    false     true			false
		 *    
		 *    
		 *    &&, || 는 앞의 값에 따라서 뒤를 읽지않는 경우가 생겨서 절삭연산을 한다고 한다.
		 *    
		 *        ( 1)  && (2)  ==> (1)이 거짓이면 2 를 읽지도 않는다.
		 *        					(1)이 참이면 (2)를 읽어서 판별한다.
		 *        
		 *        (1)  || (2)	==> (1)이 참이면 결과는 무조건 참일것이기 때문에 (2)를 읽지 않는다.
		 *        				==> (1)이 거짓이면 (2)의 결과에 따라서 값이 달라지기 때문에 (2)를 읽는다.
		 *        
		 *        
		 */
		
		// 10, 20
		no2 = 10;
		System.out.println( (no1 < 10) && (++no2 > 10) ); 
		// (no1 < 10) 의 결과가 거짓이기 때문에 
		// (++no2 > 10)의 참거짓 에 관계없이 전체 결과는 거짓이 될것이다.
		// 따라서 (++no2 > 10) 는 읽지 않는다.
		
		System.out.println( "no2 : " + no2 );
		
		System.out.println( (no1 == 10) || (++no2 > 10) );
		/*
		 * 	(no1 == 10) 의 결과가 참이기 때문에 
		 *  뒤의 결과에 상관없이 참일 것이다.
		 *  따라서 (++no2 > 10) 부분은 읽지 않는다.
		 */
		System.out.println( "no2 : " + no2 );
		
		System.out.println();
		System.out.println();
		
		System.out.println("true & true   : " +(true & true) );
		System.out.println("true & false  : " +(true & false) );
		System.out.println("false & true  : " +(false & true) );
		System.out.println("false & false : " +(false & false) );
		System.out.println();
		
		System.out.println("true | true   : " +(true | true) );
		System.out.println("true | false  : " +(true | false) );
		System.out.println("false | true  : " +(false | true) );
		System.out.println("false | false : " +(false | false) );
		
		System.out.println();
		System.out.println( (no1 < 10) & (++no2 > 10) ); 
		System.out.println( "no2 : " + no2 );
		System.out.println( (no1 == 10) | (++no2 > 10) );
		System.out.println( "no2 : " + no2 );
	}

}

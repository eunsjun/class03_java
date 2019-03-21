package day03;

public class Test09 {

	public static void main(String[] args) {
		/*
		 * ��������
		 * 		&, |, !, &&, ||
		 * 
		 * �ڹ� �񱳿�����
		 * 		>, <, >=, <=, == (����), != (�����ʴ�)
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
		 *    &&, || �� ���� ���� ���� �ڸ� �����ʴ� ��찡 ���ܼ� ���迬���� �Ѵٰ� �Ѵ�.
		 *    
		 *        ( 1)  && (2)  ==> (1)�� �����̸� 2 �� ������ �ʴ´�.
		 *        					(1)�� ���̸� (2)�� �о �Ǻ��Ѵ�.
		 *        
		 *        (1)  || (2)	==> (1)�� ���̸� ����� ������ ���ϰ��̱� ������ (2)�� ���� �ʴ´�.
		 *        				==> (1)�� �����̸� (2)�� ����� ���� ���� �޶����� ������ (2)�� �д´�.
		 *        
		 *        
		 */
		
		// 10, 20
		no2 = 10;
		System.out.println( (no1 < 10) && (++no2 > 10) ); 
		// (no1 < 10) �� ����� �����̱� ������ 
		// (++no2 > 10)�� ������ �� ������� ��ü ����� ������ �ɰ��̴�.
		// ���� (++no2 > 10) �� ���� �ʴ´�.
		
		System.out.println( "no2 : " + no2 );
		
		System.out.println( (no1 == 10) || (++no2 > 10) );
		/*
		 * 	(no1 == 10) �� ����� ���̱� ������ 
		 *  ���� ����� ������� ���� ���̴�.
		 *  ���� (++no2 > 10) �κ��� ���� �ʴ´�.
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

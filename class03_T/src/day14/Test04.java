package day14;

import java.util.*;
public class Test04 {
/*
		예외처리
			==> 프로그램적으로는 문제가 없으나
				(문법상 전혀 에러가 나지 않으나..)
				데이터의 문제나 장비의 문제 등에 의해서 
				프로그램을 실행하는 도중 발생하는 에러를 
					"실행 에러(Run Time Error)" 
				라고 표현하고
				이것을 자바에서는 
					"예외 (Exception)"
				이라고 부른다.
				
				문제는
				이런 예외는 개발자가 예측해서 이런 문제가 발생했을 경우
				대처하는 방식으로 프로그램을 만들어야 하고
				이처럼 예외가 발생했을 경우
				대처하는 방식의 프로그램을 
				"예외 처리" 라고 한다.
				
				***
				예외처리를 해주는 이유는 
				프로그램의 정상적인 종료를 위해서....
				
			자바에서는 이런 문제점(예외 발생 원인을 개발자가 알고 있어야 한다.)을
			해결하기 위해서 예외처리 문법이 존재 한다.
			
			형식]
				
				(1)
				try{
					(2)
					실행문
					(3)
				} catch (???){
					(4)
				} [finally {
					(5)
				}]
				
				(6)
				
			실행순서
				에러 발생 경우 			: 1 -> 2 -> 4 -> 5 -> 6
				에러 발생 안나는 경우 	: 1 -> 2 -> 3 -> 5 -> 6
		
		
		자바의 예외처리 원리
		==>		예외가 발생하면 JVM은 발생한 예외 종류를 분석한 후
				예외에 대한 정보를 클래스로 만들어서
				catch 부분에 그 클래스의 주소를 전달한다.
				
			catch 의 의미
				예외가 발생하면 그 예외의 정보를 받아서
				개발자가 그 정보를 이용해서 원하는 처리를 해주어야 한다.
				
			다중 catch
				try {} 안에 예외 발생 요소가 여러가지 복합적인 예외 요소를 가질수 있는데...
				이때 반드시 어떤 예외때문인지를 구분해야 한다면
				해당 예외들을 구분해서 처리해줘야 될 것이다.
				
				***
				다중 catch 문의 경우 예외의 순서는 좁은 범위부터 기술하는 것이 원칙이다.
				
		finally 블럭
		==> 예외 발생 여부에 관계없이 처리해줘야 할 명령들이 들어가는 블럭...
			예외가 발생하던지 말던지 실행 해줘야 할 문장들이 기술 된다.
			
	예외 정보 출력하기
		==> 
			1. 예외정보 클래스 변수를 출력하면 된다.
				형식]
					System.out.println(예외정보클래스변수);
					
			2. 예외변수.printStackTrace() 를 이용하는 방법
				==> 예외의 정보 + 예외 발생위치 그 경로를 추적해서 출력
				
		
		
		 지금까지 설명한 예외처리는 
		 예외가 발생하면 개발자가 그것을 수정해서 정상적으로 동작하도록 만드는 조치였고
		 정상적으로 동작하도록 만드는 경우는 
		 일단 매우 어렵고
		 그 경우도 많지 않다.
		 
		 다만 예외를 처리하는 실제 이유는
		 예외의 정보를 알아서 사용자에게 
		 문제의 원인을 알려주고
		 그 프로그램이 정상적으로 종료되도록 하는 것이 목적인 경우가 많다.
		 
		 
		 
					
				
 */
	public Test04() {
		int num = 0;
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요!");
//		int num = sc.nextInt();
		//String sno = sc.next();
		/* num = Integer.parseInt(sno) */;
		
		String sno = null;
		try{
			num = Integer.parseInt(sno);
			System.out.println("****");
		} catch(NullPointerException e) {
			System.out.println("### 2");
		} catch(NumberFormatException e) {
			System.out.println("### 1");
		} catch(RuntimeException e) {
			System.out.println("### 3");
		} catch(Exception e) {
			System.out.println("###");
		}
		
		/*
		try{
			num = Integer.parseInt(sno);
			str = "입력한 숫자는 : " + num;
			System.out.println(num + " 을 입력 받았습니다.");
		} catch(Exception e) {
			str = "잘못 입력했습니다.";
		} finally {
			// 예외가 발생하던지 말던지 반드시 해줘야될 것들을 실행하는 부분...
			sc.close();
			System.out.println("여기는 에러 나던지 말던지 실행되는 부분...");
		}
		
		System.out.println(str);
		*/
		/*
		System.out.println("입력한 숫자는 : " + num);
		*/
	}

	public static void main(String[] args) {
		new Test04();
		System.out.println("프로그램 정상 종료!!!");
	}

}

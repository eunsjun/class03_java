package day11;


import java.awt.*;
import javax.swing.*;

public class Test05 extends JFrame {
/*
		상속
			==> 이미 만들어진 클래스의 기능(멤버)을 그대로 부여받아서
				(변수와 함수의 기능을 그대로 복사 받아서)
				새로운 클래스를 만드는 방법
				==> 상속해준 클래스의 모든 기능을 상속 받은 클래스가 모두 가지고 있다.
				
				==> 소프트웨어 개발속도를 빠르게 하기 위해서...
				
				객체지향의 가장 큰 특징중 하나...
				
				객체지향언어는 부품단위(클래스)로 프로그램을 만든 후
				그 부품을 조립해서 원하는 결과를 얻어내는 언어다.
				
				
				상속은 
					만들고자 하는 부품과 가장 유사한 부품을 가지고와서
					먼저 그 기능을 모두 복사한 후
						1. 없는 기능은 추가하고
						2. 있는 기능중 수정할 내용을 수정한다.
						
				상속하는 형식]
					class 	클래스이름	extends		복사해올클래스이름 {
						복사해온 모든 기능이 (변수포함) 이 클래스에 들어있다.
					}
					
		*****
		상속은(extends) 오직 한번에 하나만 상속 받을 수 있다.
			class Test extends Test00, Test01 { ==> X 
					==> 안된다. 오직 한개만 상속 받아야 되기 때문에...
			
			}
			
		용어정리]
			상속해준 클래스		: super 클래스, 상위 클래스, 부모 클래스
			상속 받은 클래스	: sub 클래스, 하위 클래스, 자식 클래스
			
			is a 	: 상속 관계에 있는 클래스를 부르는 용어
						class Father {
						}
						class Son extends Father {
						}
						
						Son is a Father 	가 성립이 된다.
			
			has a	: 어떤 클래스 내부에 다른 클래스를 멤버로 가지고 있는 상태
						class Father {
						}
						class Son {
							Father f = new Father();
						}
						
						Son has a Father  	가 성립이 된다.
		
		
		상속 관계에 있는 경우 생성자의 역할
			결론]
				하위 클래스가 생성되는 순간
				상위 클래스가 자동 생성이 된다.
				==> 생성되는 순간 생성자 함수가 호출이 되므로
					결국 하위클래스를 생성하면 
					상위 클래스의 생성자 함수도 실행이 된다.
					
		따라서 상위클래스의 생성자 함수는 자동으로 호출된다.
		자동 호출되는 경우는 무조건 기본 생성자함수(매개변수가 없는 생성자 함수)가 호출된다.
		
		***
		참고 ]
			this()	==> 현재 실행되는 객체의(현재클래스의) 생성자 함수
			
			super()	==> 
						상위 클래스의 특별한 생성자 함수를 호출하는 기능을 가진 명령어..
						상위 클래스의 생성자 함수를 나타내는 예약어
						
						특징 ]
							1. 반드시 생성자 함수 내에서만 사용할 수 있다.
							2. 반드시 첫 문장에 와야 한다.
			
 */
	
	// 이것이 기본 생성자 함수
	public Test05() {
		super("여기는 슈퍼함수 호출");
		this.setDefaultCloseOperation( super.EXIT_ON_CLOSE );
		//this.setTitle("이것은 통닭인가 갈비인가???");
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	public Test05(String ttl) {
		this();
		this.setTitle(ttl);
	}

	public static void main(String[] args) {
		new Test05();
		
//		Object obj = new Test05();
	}

}

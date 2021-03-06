package day16;

import java.util.regex.*;
import java.util.*;
public class Test05 {
/*
	정규식 검사
		==> 주어진 문자열이 특정 규칙에 맞게 만들어졌는지 확인하는 검사
			
			예]
				주민번호가 6-7 로 구성되어 있는가?
				아이디가 영문자 + 숫자 + _ 로 구성되어 있는가??
				아이디가 최소 **글자 로 되어있는가??
				
		사용하는 클래스
			java.util.regex.Pattern
			==> 정규식 검사에 사용할 패턴을 만드는 클래스
			
			java.util.regex.Matcher
			==> 정규실 검사를 실제로 실행할 클래스
			
		
		검사방법]
			1. 패턴을 만들고
			2. 문자열을 검사한다.
			
			
		정규식 문법]
			==> 패턴 만들때 사용하는 문법
			
			1. c[a-z]*
				==> 글자를 기술하면 반드시 그 위치에 그 글자가 와야 한다.
					[] 안에 기록하면 그중에 하나가 와야한다는 의미
					* 갯수를 이야기하는데 0개 이상을 의미한다.
				==> 첫글자는 c 로시작하고 두번째 부터는 소문자가 0개이상 와도 된다.
			
			2. c[a-z]
				==> 첫글자는 c로 시작하고 다음글자는 소문자중 하나
				
			3. c[a-zA-Z]
				==> c 로 시작하고 이후는 알파벳 하나가 와야 한다.
			
			4. c[a-zA-Z0-9]
				==> c로 시작하고 다음글자는 알파벳이나 숫자가 와야한다.
					==> c\w 로 줄여서 사용도 한다.
					
			5. .*
				==> . 은 모든 문자를 (알파벳 그리고 한글까지 포함)를 의미한다.
				==> 어떤 글자가 와도 상관없다.
				
			6. c.
				==> c 로 시작하고 뒤에는 한글자의 문자가 아무거나 와도 상관없다.
			
			7. c.*
				==> c 로 시작하고 뒤에는 어떤 글자가 몇개든 상관없다.
				
			8. c\.
				==> c 로 시작하고 다음엔 . 이 와야 한다.
				
			9. c\d
				==> \d == [0-9]
				==> 첫글자는 c가 오고 두번째는 숫자 하나가 와야한다.
				
			10. c.*t
				==> c 로 시작하고 그 이후는 문자가 0개이상 와도 되고 그리고 t 로 끝나야 한다.
				
			11. [b|c].*
				==> b 또는 c 가 와야하고 이후에는 문자가 0개이상 와야한다.
				
			12. [^b|c]
				==> ^ 는 NOT 의 의미
				
				[^(b|c)]
			
			13. .*a.*
				==> a가 포함되면 된다.
				
			14. .*a.+
				==> * : 0 개 이상
					+ : 1 개 이상
			
			15. [b|c].{2}
				==> {} 안의 숫자는 글자 수를 의미
				
			16. .{2,3}
				==> {} 의 숫자는 글자 수를 의미하는데.
					첫숫자는 최소갯수
					두번째 숫자는 최대갯수
				
			17. ^, $
				==> ^ - 시작 표시
					$ - 끝을 알려주는 문자
					"rsd" <== rsdabcd, arsdabcd, abcdrsd
					
			18. ? 0개 또는 1개
				
			
			예]
				0[0-9]{2}-[0-9]{3,4}-[0-9]{4}	==> 전화번호
				0[0-9][0-9]-[0-9]{3,4}-[0-9]{4}
				==> ???	
					0\d{2}-\d{3,4}-\d{4}
		
			
		문제 1]
			아이디를 입력해서 입력받은 아이디가 지정형식에 맞는지 검사하는 프로그램을 작성하세요.
			단,
			아이디의 첫글자는 반드시 영문자로 시작
			두번째글자부터는 영문자 숫자 를 사용할 수있고
			글자수는 8자 이상이 되어야 한다.
			
		
		문제 2]
			문제1] 해결된 사람은
			Score 클래스의 한사람의 데이터를 입력하는데
			입력받을 때 정규식 검사를 해서
			바른경우만 입력하세요...
			
	숙제]
		Matcher 클래스 소속함수
		find(), start(), end(), ...
		
 */
	Scanner sc ;
	String name;
	public Test05() {
		sc = new Scanner(System.in);
		while(true){
			System.out.println("이름을 입력하세요!");
			name = sc.nextLine();
			if(getTest(name)) {
				System.out.println("Name : " + name);
				System.out.println(toString());
				System.out.println(this);
				break;
			}
		}
	}
	// [a-zA-Z0-9]	==> \\w - 한글제외
	// [0-9]		==> \\d
	public void getTest01() {
		String phone = "010-7777-7777";
		/*
		 *  1. 먼저 패턴을 만든다.
		 *  	방법]
		 				 Pattern 클래스를 이용해서 
		 				 검사하고 싶은 정규식 문법을 만든다.
		 				 
		 				 클래스는 생성자 함수를 호출해야 new 시킬 수 있다.
		 				 
		 				 그런데 Pattern 클래스는 생성자 함수가 없다.
		 				 
		 				 이런경우는 소속함수중 
		 				 	속성이 static 이면서
		 				 	반환값이 자기자신인(Pattern)
		 				 함수를 찾아서 호출하고 결과를 반환 받으면
		 				 객체를 얻을 수 있다. 
		 				 
		 				 Pattern 클래스의 경우 compile() 함수가 그런 기능을 가지고 있다.
		 */
		Pattern soo = Pattern.compile("0[0-9]{2}-[0-9]{3,4}-[0-9]{4}");
		Pattern soo1 = Pattern.compile("0\\d{2}-\\d{3,4}-\\d{4}");
		
		/*
				2. 해당 패턴에 맞는지 검사한다.
					문법 검사를 하는 함수가 matcher()
					이 함수는 검사 결과를 Matcher 객체로 반환 해준다.
		 */
		
		Matcher mat = soo1.matcher(phone);
		/*
		 		3. Matcher 객체에 담겨있는 검사결과 정보를 뽑아낸다.
		 			그 역할을 하는 함수가
		 				matches() 
		 			이다.
		 			
		 			검사 결과를 논리형으로 반환해주는 함수이다.
		 */
		
		boolean bool = mat.matches();
		
		if(bool) {
			System.out.println("*** 올바른 전화번호 입니다. ***");
		} else {
			System.out.println("### 전화번호 형식이 잘못되었습니다. ###");
		}
		
		Pattern p1 = Pattern.compile("\\w{0,10}");
		Scanner sc = new Scanner(System.in);
		Matcher m1 ;
		while(true) {
			System.out.println("이름을 입력하세요! : ");
			String name = sc.nextLine();
			m1 = p1.matcher(name);
			if(name.equals("quit")) break;
			
			if(m1.matches()) {
				System.out.println("OK!!!");
				break;
			} else {
				System.out.println("NO !!!!!");
				
			}
			
		}
	}
	
	// 이름 정규식 검사 함수
	public boolean getTest(String str) {
		return Pattern.compile("^[가-힣]{2,10}$").matcher(str).matches();
/*		
		Pattern pat = Pattern.compile("^[가-힣]{2,10}$");
		Matcher mat = pat.matcher(str);
		return mat.matches();
*/
	}
	
	public String toString() {
		return "Name : " + name ;
	}
	
	public static void main(String[] args) {
		new Test05();
	}

}

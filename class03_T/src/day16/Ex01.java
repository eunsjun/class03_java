package day16;

/*
	회원의 정보를 저장할 클래스를 만드세요.
		회원이름, 아이디, 이메일, 비밀번호, 주소, 전화번호, 생일
	을 저장할 VO 클래스를 만드세요.
	
	회원정보를 입력받아서
	정규식 검사를 하고
	검사가 통과한 경우에만 입력이 되게 
	프로그램을 작성하세요...
	
	참고]
		한글 : [가-힣]
 */

import java.util.*;
public class Ex01 {
/*
	StringTokenizer
		==> 하나의 문자열을 문자열 내에 포함되어있는 
			특정 문자를 기준으로 자르는 기능가진 클래스
			
			<== 네트워크 등을 이용하면
				여러개의 데이터가 한번에 들어올 수 있다.
				
				한번에 들어오는 데이터는 문자열로 넘어온다.
				이때 원하는 정보만 잘라서 볼 필요가 생긴다.
				
				예]
					채팅프로그램의 경우
					메세지를 입력하면 메시지, 글쓴이, 시간,...
					==> 이런경우 각 내용을 분리해서 처리를 해줘야 하는데...
						보낸사람@보낸시간@내용
						
		생성방법
			1. StringTokenizer(String str)
			==> 문자열을 공백을 중심으로 나누는 기능
			
			2. StringTokenizer(String str, String delim)
			==> str 문자열을 delim 을 기준으로 나눠주는 기능
			
			3. StringTokenizer(String str, String delim, boolean returnDelims)
			==> 2번의 기능에 분리문자도 하나의 문자로 처리한다.
			
			
		==> 분리된 결과는 버퍼(스텍)에 기억이 된다.
			이것은 한번 꺼내서 쓰면 더이상 사용할 수 없게된다.
			따라서 반드시 순서대로 꺼내야 한다.
			
		주요함수]
			countTokens()
			==> 나눠진 결과 수
			
			hasMoreElements()/hasMoreTokens()
			==> 아직 버퍼에 꺼내올 데이터가 남아 있는지 여부를 묻는 함수
			
			nextElement()/nextToken()
			==> 데이터를 꺼낼때 사용하는 함수
		
 */
	public Ex01() {
		// 문자열 준비
		String str = "가나다라/마바/사아자차";
		// 문자열을 , 를 기준으로 자른다.
		StringTokenizer token = new StringTokenizer(str, "/마바/");
		
		String[] arr = new String[token.countTokens()];
		int idx = 0;
		while(token.hasMoreTokens()) {
			arr[idx++] = token.nextToken();
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		new Ex01();
	}
}

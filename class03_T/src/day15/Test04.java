package day15;

public class Test04 {
/*
		String 클래스
			==> 문자열을 관리하는 기능을 모아놓은 클래스...
			
			****
			String 클래스의 가장 큰 단점
				==> String 클래스는 데이터가 수정되면 새로운객체를 하나 다시 만든다.
					따라서 수정이 잦은 문자열의 경우는 메모리 낭비가 심하다.
					
					==> 수정이 잦은 문자열의 경우 StringBuffer 로 만들고 수정해서
						맨 마지막에 한번만 String으로 만들어주면 된다.
						
				참고]
					클래스중 유일하게 함수를 사용하지 않고 + 연산이 가능하다.
					new 시키지 않아도 만들수 있다.
						예]	 String str = "abcd";
						
				숙제]
					String 클래스에 있는 함수 10개의 기능을 조사하세요.
					생성자 함수도 조사하세요...
					예]
						equals() : 문자열 두개의 데이터를 비교하는 함수
						String str = new String("abcd");
						String str1 = "abcd";
						System.out.println("str.equals(str1) : " + str.equals(str1));
						
						
						
		StringBuffer 클래스
			==> String 클래스와 동일하게 문자열을 관리하는 기능을 가지고 있는 클래스
				
				수정이 잦은 문자열을 다룰때 유용하다.
				<== 인스턴스가 한번만 만들어지므로...
				
				주의]
					StringBuffer buff = "abcd"; ==> X
					StringBuffer buff = new StringBuffer("abcd"); ==> O
					
					buff = buff + "efg";	==> X
					buff.append("efg");		==> O
					
			숙제2]
				StringBuffer 소속함수 5개의 기능을 조사하세요.
				
					
					
 */
	public Test04() {
	}

	public static void main(String[] args) {

	}

}

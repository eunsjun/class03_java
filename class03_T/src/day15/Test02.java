package day15;

public class Test02 {
/*
		toString()
			==> 자바는 주소를 내부적으로 사용하는데
				주소를 노출하지 않는 방법으로 사용하고 있다.
				
				주소를 출력하게 되면
					"클래스이름@해쉬코드값"
				의 형식으로 출력해준다.
				
				참고]
					해쉬코드	:
									자바는 주소를 내부적으로 해쉬테이블을 이용해서 관리한다.
									해쉬코드값은 그 주소를 관리하는 해쉬테이블의 코드값이 된다.
									
				문제는
					주소를 출력하려고 하는 순간
					주소 출력형식으로 만들어 내야 되는데
					==> 이 작업을 해주는 함수가 toString() 이다.
					
				결론]
					toString() 는 주소를 출력할 때 
					자동 호출되어서 출력할 내용을 만들어 주는 함수이다.
					
				따라서
					우리가 만드는 클래스에 출력할 내용을 
					다르게 하고 싶다면
					toString()를 오버라이딩 하면 된다.
					
					
		3. clone()
			==> 자기 자신을 깊은 복사해주는 함수
				
				참고]
				복사의 종류]
					1. 얕은 복사	: 주소만 복사해주는 복사 - 원본 데이터가 바뀌면 영향을 받는다.
					2. 깊은 복사	: 데이터를 복사해주는 복사	- 원본과 별개로 작동...
				
				이 함수는 protected 함수이므로
				상속을 받은 클래스나 같은 패키지에 있는 클래스에서만 사용이 가능...
				
		4. hashCode()
			==> 자바는 주소를 노축하지 않도록 해쉬테이블을 사용해서 주소를 관리하는데
				그 해쉬테이블의 주소를 관리하는 코드값을 알려주는 함수
 */
	public Test02() {
		Object[] obj = {"1234", 1234, 12.34f};
		System.out.println(obj.toString());
		
	}

	public static void main(String[] args) {
		new Test02();
		try {
			Test02 t2 = (Test02) new Test02().clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

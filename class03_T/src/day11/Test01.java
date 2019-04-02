package day11;

public class Test01 {

/*
		가변인자 <== 함수 생성 & 호출
			==> 함수를 만들때 
				매개변수는 타입과 갯수가 정해져야 한다.
				그래서 호출할 때도 동일한 타입과 갯수에 맞게 데이터를 입력해줘야 
				함수를 호출할 수 있었다.
				
			만약 데이터의 갯수를 지정할 수 없을 때
			사용할 수 있도록 만들어 놓은 형식...
			==> 데이터의 갯수에 상관없이 모든 데이터를 다 받을 수 있다.
		
		형식]
			반환값유형|타입		함수이름(변수형태 ... 변수이름){}
			
			예]
				void abc(int ... num){}
				
				==> abc(10, 20);
				==> abc(5, 6, 7, 8);
			
			*
			주의]
				가변인자 변수는 자동 배열 변수가 된다.
				따라서 배열변수처럼 다루어야 한다.
			
			주의]
				가변인자 변수는 앞에는 다른 매개변수가 와도 상관 없다.
				가변인자 변수 뒤에는 다른 배개변수가 오면 절대 안된다.
					public HW00_02(String sname, int no1, int no2, int no3, int no4) {
						this(sname);
						java = no1;
						oracle = no2;
						jsp = no3;
						spring = no4;
						
						// 총점계산해서 대입하기...
						setTotal();
					}
					
				==>
					public HW00_02(String sname, int ... no) {
						this(sname);
						java = no[0];
						oracle = no[1];
						jsp = no[2];
						spring = no[3];
						
						// 총점계산해서 대입하기...
						setTotal();
					}
		
 */
	// 입력받은 정수의 합을 구해주는 함수를 만드세요. 갯수는 상관없이 만드세요...
	
	int total;
	int total2;
	public Test01() {
		setTotal(1, 2, 7, 9);
		toPrint();
	}
	
	public void setTotal(int...no) {
		for(int i = 0; i < no.length ; i++ ) {
			total += no[i];
		}
		
		for(int num : no) {
			total2 += num;
		}
	}
	
	// total, total2의 내용을 출력해주는 함수
	public void toPrint() {
		System.out.println("Total : " + total);
		System.out.println("Total2 : " + total2);
	}

	public static void main(String[] args) {
		new Test01();
	}

}

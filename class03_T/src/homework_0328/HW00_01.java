package homework_0328;

public class HW00_01 {

/*
		두수를 입력 받아
		+ 연산을 하는 함수를 만들고
		실행해서
		반환값을 받아
		출력하세요...
*/
	public HW00_01() {
		int num = dosooplus(10, 20);
		printsoo(num);
		
		num = minusSoo(30, 5);
		printsoo(num);
		
	}
	public static void main(String[] args) {
		new HW00_01();
	}
	
	/*
	 *  함수 만드는 형식
	 *  		
	 *  	[접근지정자] 		[속성]		반환값타입|void		함수이름(매개변수리스트){
	 *  		함수내용.....
	 *  	}
	 */
	
	public int dosooplus(int no1, int no2) {
		System.out.println("no1 : " + no1);
		System.out.println("no2 : " + no2);
		return (no1 + no2);
	}
	
	public int minusSoo(int no1, int no2) {
		System.out.println("minusSoo no1 : " + no1);
		System.out.println("minusSoo no2 : " + no2);
		return (no1 - no2);
	}
	
	public void printsoo(int soo) {
		System.out.println("입력된 수 : " + soo);
		return;
	}
	
	public String strsoo(int soo) {
		return (soo + "");
	}

}

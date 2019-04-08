package day15;

/*
  	문제]
		Nemo 클래스를 만드는데
		가로와 세로의 길이가 같으면 같은 네모가 되도록하세요.
		그리고
		레퍼런스변수를 출력하면
			가로가 *** , 세로가 *** 인 사각형의 넓이는 **** 입니다.
		로 출력되게 하세요.
 */
public class HW01 {

	public HW01() {
		Object o1 = new String("abcd");
		Object o2 = new String("abcd");
		boolean bool = o1.equals(o2);	// 결과?? 이유는???
		
		Nemo nemo1 = new Nemo(4, 3);
		Nemo nemo2 = new Nemo(3, 4);
		System.out.println(nemo1);
		System.out.println(nemo2);
		System.out.println("nemo1.equals(nemo2) : " + nemo1.equals(nemo2));
	
		Object obj1 = new String("abcd");
		Object obj2 = "abcd";
		boolean bool2 = obj1.equals(obj2); // ==> true	<== equals() String클래스에서 오버라이딩 한 함수를 사용하기 때문에....
		
		
	}

	public static void main(String[] args) {
		new HW01();
	}

}

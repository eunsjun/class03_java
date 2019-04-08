package day15;

public class Test07 {

	public Test07() {
		try {
//			throw new MyException("그냥 던진 예외!!!");
			throw new MyException();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}

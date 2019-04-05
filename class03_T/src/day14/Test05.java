package day14;

public class Test05 {

	public Test05() {
		
		try {
			System.out.println("TRY 예외 발생 전");
			throw new ClassCastException(); // 예외 강제 발생
//			System.out.println("TRY 예외 발생 후");
		} catch(ClassCastException e) {
			System.out.println("CATCH 예외 발생 :  ClassCastException");
//			System.out.println(e);
			e.printStackTrace();
		} catch(RuntimeException e) {
			System.out.println("CATCH 예외 발생 :  Exception");
		} catch(Exception e) {
			System.out.println("CATCH 예외 발생 :  Exception");
		/*
		 * 위의 Exception catch 문에서 모든 예외가 걸러지기 때문에
		 * 이후의 예외들은 실행조차 되지 않기 때문에
		 * 의미가 없어서 에러가 발생한다.
		} catch(RuntimeException e) {
			System.out.println("CATCH 예외 발생 :  Exception");
		*/
		}
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}

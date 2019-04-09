package day16;

public class Test01 {
/*
		StringBuilder : StringBuffer와 동일한 역할을 하는 클래스
			==> 특징]
					주로 Thread 처리를 할때 동기화에 대해서 안정적으로 처리가 가능
 */
	public Test01() {
		StringBuilder build = new StringBuilder();
		
		build.append("SELECT ");
		build.append("	* ");
		build.append("FROM ");
		build.append("	emp ");
		build.append("WHERE ");
		build.append("	deptno = 10 ");
		
		System.out.println("질의 명령 build : " + build.toString());
	}

	public static void main(String[] args) {
		new Test01();
	}

}

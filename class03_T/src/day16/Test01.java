package day16;

public class Test01 {
/*
		StringBuilder : StringBuffer�� ������ ������ �ϴ� Ŭ����
			==> Ư¡]
					�ַ� Thread ó���� �Ҷ� ����ȭ�� ���ؼ� ���������� ó���� ����
 */
	public Test01() {
		StringBuilder build = new StringBuilder();
		
		build.append("SELECT ");
		build.append("	* ");
		build.append("FROM ");
		build.append("	emp ");
		build.append("WHERE ");
		build.append("	deptno = 10 ");
		
		System.out.println("���� ��� build : " + build.toString());
	}

	public static void main(String[] args) {
		new Test01();
	}

}

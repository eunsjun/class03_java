package day17;

import java.text.*;
public class Test08 {

	public Test08() {
		String sql = "INSERT INTO emp VALUES(1234, '������', '�л�', 2000)";
		/*
		 * ���߿��� �����͸� ���� ������ �ʹٸ�???
		 * 
		 * ����]
				1. MessageFormat���� �����Ͱ� �� �κ��� ����� ������ �����.
				
				2. parse() �Լ��� �̿��ؼ� ������ �κ��� �����ϸ� �ȴ�.
		 */
		
		MessageFormat form = new MessageFormat(
				"INSERT INTO emp VALUES({0}, {1}, {2}, {3})"
		);
		Object[] result = null;
		
		try {
			result = form.parse(sql);
			for(int i = 0 ; i < result.length ; i++ ) {
				System.out.println(result[i]);
			}
		} catch(Exception e) {
			System.out.println("ó������...!");
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}

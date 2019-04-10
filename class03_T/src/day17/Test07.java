package day17;

import java.text.*;
public class Test07 {
	
	/*
			name : ȫ�浿, tel : 010-1111-1234, age : 25
			name : ������, tel : 010-1234-1234, age : 24
	 */
	public Test07() {
		MessageFormat form = new MessageFormat("name : {0}, tel : {1}, age : {2}");
		// ������ ������ �״�� ���� 
		// ��ȭ�Ǵ� �κи� {0}, {1}, {2} �� ����Ѵ�.
		// ��ȣ�� �ԷµǴ� �������� ������ �ǹ��Ѵ�.
		Object[][] data = {{"ȫ�浿", "010-1111-1234", 25},{"������", "010-1234-1234", 24}};
		
		// ���
		for(int i = 0 ; i < data.length ; i++) {
			String result = form.format(data[i]);
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}

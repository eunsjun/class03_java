package day20;
/*
	���α׷��� ���õ� ������ �ڵ����� �̾Ƽ� ��������.
 */
import java.util.*;
public class Test07 {

	public Test07() {
		Properties prop = System.getProperties();
		// System.getProperties() ��
		// ���α׷��� ���õ� ������ Map���� ������ִ� �Լ�
		
		// ���� Ű�� �̰�
		Enumeration enu = prop.keys();
		// �̾ƿ� Ű�� ����ؼ� �����͸� �о��.
		while(enu.hasMoreElements()){
			String key = (String) enu.nextElement();
			String val = prop.getProperty(key);
			System.out.println(key + " : " + val);
		}
		
		// ����
		// ������ �ý��������� ���Ϸ� �����ϼ���.
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}

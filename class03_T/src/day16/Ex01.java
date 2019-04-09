package day16;

/*
	ȸ���� ������ ������ Ŭ������ ���弼��.
		ȸ���̸�, ���̵�, �̸���, ��й�ȣ, �ּ�, ��ȭ��ȣ, ����
	�� ������ VO Ŭ������ ���弼��.
	
	ȸ�������� �Է¹޾Ƽ�
	���Խ� �˻縦 �ϰ�
	�˻簡 ����� ��쿡�� �Է��� �ǰ� 
	���α׷��� �ۼ��ϼ���...
	
	����]
		�ѱ� : [��-�R]
 */

import java.util.*;
public class Ex01 {
/*
	StringTokenizer
		==> �ϳ��� ���ڿ��� ���ڿ� ���� ���ԵǾ��ִ� 
			Ư�� ���ڸ� �������� �ڸ��� ��ɰ��� Ŭ����
			
			<== ��Ʈ��ũ ���� �̿��ϸ�
				�������� �����Ͱ� �ѹ��� ���� �� �ִ�.
				
				�ѹ��� ������ �����ʹ� ���ڿ��� �Ѿ�´�.
				�̶� ���ϴ� ������ �߶� �� �ʿ䰡 �����.
				
				��]
					ä�����α׷��� ���
					�޼����� �Է��ϸ� �޽���, �۾���, �ð�,...
					==> �̷���� �� ������ �и��ؼ� ó���� ����� �ϴµ�...
						�������@�����ð�@����
						
		�������
			1. StringTokenizer(String str)
			==> ���ڿ��� ������ �߽����� ������ ���
			
			2. StringTokenizer(String str, String delim)
			==> str ���ڿ��� delim �� �������� �����ִ� ���
			
			3. StringTokenizer(String str, String delim, boolean returnDelims)
			==> 2���� ��ɿ� �и����ڵ� �ϳ��� ���ڷ� ó���Ѵ�.
			
			
		==> �и��� ����� ����(����)�� ����� �ȴ�.
			�̰��� �ѹ� ������ ���� ���̻� ����� �� ���Եȴ�.
			���� �ݵ�� ������� ������ �Ѵ�.
			
		�ֿ��Լ�]
			countTokens()
			==> ������ ��� ��
			
			hasMoreElements()/hasMoreTokens()
			==> ���� ���ۿ� ������ �����Ͱ� ���� �ִ��� ���θ� ���� �Լ�
			
			nextElement()/nextToken()
			==> �����͸� ������ ����ϴ� �Լ�
		
 */
	public Ex01() {
		// ���ڿ� �غ�
		String str = "�����ٶ�/����/�������";
		// ���ڿ��� , �� �������� �ڸ���.
		StringTokenizer token = new StringTokenizer(str, "/����/");
		
		String[] arr = new String[token.countTokens()];
		int idx = 0;
		while(token.hasMoreTokens()) {
			arr[idx++] = token.nextToken();
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		new Ex01();
	}

}

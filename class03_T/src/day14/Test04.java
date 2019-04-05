package day14;

import java.util.*;
public class Test04 {
/*
		����ó��
			==> ���α׷������δ� ������ ������
				(������ ���� ������ ���� ������..)
				�������� ������ ����� ���� � ���ؼ� 
				���α׷��� �����ϴ� ���� �߻��ϴ� ������ 
					"���� ����(Run Time Error)" 
				��� ǥ���ϰ�
				�̰��� �ڹٿ����� 
					"���� (Exception)"
				�̶�� �θ���.
				
				������
				�̷� ���ܴ� �����ڰ� �����ؼ� �̷� ������ �߻����� ���
				��ó�ϴ� ������� ���α׷��� ������ �ϰ�
				��ó�� ���ܰ� �߻����� ���
				��ó�ϴ� ����� ���α׷��� 
				"���� ó��" ��� �Ѵ�.
				
				***
				����ó���� ���ִ� ������ 
				���α׷��� �������� ���Ḧ ���ؼ�....
				
			�ڹٿ����� �̷� ������(���� �߻� ������ �����ڰ� �˰� �־�� �Ѵ�.)��
			�ذ��ϱ� ���ؼ� ����ó�� ������ ���� �Ѵ�.
			
			����]
				
				(1)
				try{
					(2)
					���๮
					(3)
				} catch (???){
					(4)
				} [finally {
					(5)
				}]
				
				(6)
				
			�������
				���� �߻� ��� 			: 1 -> 2 -> 4 -> 5 -> 6
				���� �߻� �ȳ��� ��� 	: 1 -> 2 -> 3 -> 5 -> 6
		
		
		�ڹ��� ����ó�� ����
		==>		���ܰ� �߻��ϸ� JVM�� �߻��� ���� ������ �м��� ��
				���ܿ� ���� ������ Ŭ������ ����
				catch �κп� �� Ŭ������ �ּҸ� �����Ѵ�.
				
			catch �� �ǹ�
				���ܰ� �߻��ϸ� �� ������ ������ �޾Ƽ�
				�����ڰ� �� ������ �̿��ؼ� ���ϴ� ó���� ���־�� �Ѵ�.
				
			���� catch
				try {} �ȿ� ���� �߻� ��Ұ� �������� �������� ���� ��Ҹ� ������ �ִµ�...
				�̶� �ݵ�� � ���ܶ��������� �����ؾ� �Ѵٸ�
				�ش� ���ܵ��� �����ؼ� ó������� �� ���̴�.
				
				***
				���� catch ���� ��� ������ ������ ���� �������� ����ϴ� ���� ��Ģ�̴�.
				
		finally ����
		==> ���� �߻� ���ο� ������� ó������� �� ���ɵ��� ���� ����...
			���ܰ� �߻��ϴ��� ������ ���� ����� �� ������� ��� �ȴ�.
			
	���� ���� ����ϱ�
		==> 
			1. �������� Ŭ���� ������ ����ϸ� �ȴ�.
				����]
					System.out.println(��������Ŭ��������);
					
			2. ���ܺ���.printStackTrace() �� �̿��ϴ� ���
				==> ������ ���� + ���� �߻���ġ �� ��θ� �����ؼ� ���
				
		
		
		 ���ݱ��� ������ ����ó���� 
		 ���ܰ� �߻��ϸ� �����ڰ� �װ��� �����ؼ� ���������� �����ϵ��� ����� ��ġ����
		 ���������� �����ϵ��� ����� ���� 
		 �ϴ� �ſ� ��ư�
		 �� ��쵵 ���� �ʴ�.
		 
		 �ٸ� ���ܸ� ó���ϴ� ���� ������
		 ������ ������ �˾Ƽ� ����ڿ��� 
		 ������ ������ �˷��ְ�
		 �� ���α׷��� ���������� ����ǵ��� �ϴ� ���� ������ ��찡 ����.
		 
		 
		 
					
				
 */
	public Test04() {
		int num = 0;
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���!");
//		int num = sc.nextInt();
		//String sno = sc.next();
		/* num = Integer.parseInt(sno) */;
		
		String sno = null;
		try{
			num = Integer.parseInt(sno);
			System.out.println("****");
		} catch(NullPointerException e) {
			System.out.println("### 2");
		} catch(NumberFormatException e) {
			System.out.println("### 1");
		} catch(RuntimeException e) {
			System.out.println("### 3");
		} catch(Exception e) {
			System.out.println("###");
		}
		
		/*
		try{
			num = Integer.parseInt(sno);
			str = "�Է��� ���ڴ� : " + num;
			System.out.println(num + " �� �Է� �޾ҽ��ϴ�.");
		} catch(Exception e) {
			str = "�߸� �Է��߽��ϴ�.";
		} finally {
			// ���ܰ� �߻��ϴ��� ������ �ݵ�� ����ߵ� �͵��� �����ϴ� �κ�...
			sc.close();
			System.out.println("����� ���� ������ ������ ����Ǵ� �κ�...");
		}
		
		System.out.println(str);
		*/
		/*
		System.out.println("�Է��� ���ڴ� : " + num);
		*/
	}

	public static void main(String[] args) {
		new Test04();
		System.out.println("���α׷� ���� ����!!!");
	}

}
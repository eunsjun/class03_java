package day11;


import java.awt.*;
import javax.swing.*;

public class Test05 extends JFrame {
/*
		���
			==> �̹� ������� Ŭ������ ���(���)�� �״�� �ο��޾Ƽ�
				(������ �Լ��� ����� �״�� ���� �޾Ƽ�)
				���ο� Ŭ������ ����� ���
				==> ������� Ŭ������ ��� ����� ��� ���� Ŭ������ ��� ������ �ִ�.
				
				==> ����Ʈ���� ���߼ӵ��� ������ �ϱ� ���ؼ�...
				
				��ü������ ���� ū Ư¡�� �ϳ�...
				
				��ü������� ��ǰ����(Ŭ����)�� ���α׷��� ���� ��
				�� ��ǰ�� �����ؼ� ���ϴ� ����� ���� ����.
				
				
				����� 
					������� �ϴ� ��ǰ�� ���� ������ ��ǰ�� �������ͼ�
					���� �� ����� ��� ������ ��
						1. ���� ����� �߰��ϰ�
						2. �ִ� ����� ������ ������ �����Ѵ�.
						
				����ϴ� ����]
					class 	Ŭ�����̸�	extends		�����ؿ�Ŭ�����̸� {
						�����ؿ� ��� ����� (��������) �� Ŭ������ ����ִ�.
					}
					
		*****
		�����(extends) ���� �ѹ��� �ϳ��� ��� ���� �� �ִ�.
			class Test extends Test00, Test01 { ==> X 
					==> �ȵȴ�. ���� �Ѱ��� ��� �޾ƾ� �Ǳ� ������...
			
			}
			
		�������]
			������� Ŭ����		: super Ŭ����, ���� Ŭ����, �θ� Ŭ����
			��� ���� Ŭ����	: sub Ŭ����, ���� Ŭ����, �ڽ� Ŭ����
			
			is a 	: ��� ���迡 �ִ� Ŭ������ �θ��� ���
						class Father {
						}
						class Son extends Father {
						}
						
						Son is a Father 	�� ������ �ȴ�.
			
			has a	: � Ŭ���� ���ο� �ٸ� Ŭ������ ����� ������ �ִ� ����
						class Father {
						}
						class Son {
							Father f = new Father();
						}
						
						Son has a Father  	�� ������ �ȴ�.
		
		
		��� ���迡 �ִ� ��� �������� ����
			���]
				���� Ŭ������ �����Ǵ� ����
				���� Ŭ������ �ڵ� ������ �ȴ�.
				==> �����Ǵ� ���� ������ �Լ��� ȣ���� �ǹǷ�
					�ᱹ ����Ŭ������ �����ϸ� 
					���� Ŭ������ ������ �Լ��� ������ �ȴ�.
					
		���� ����Ŭ������ ������ �Լ��� �ڵ����� ȣ��ȴ�.
		�ڵ� ȣ��Ǵ� ���� ������ �⺻ �������Լ�(�Ű������� ���� ������ �Լ�)�� ȣ��ȴ�.
		
		***
		���� ]
			this()	==> ���� ����Ǵ� ��ü��(����Ŭ������) ������ �Լ�
			
			super()	==> 
						���� Ŭ������ Ư���� ������ �Լ��� ȣ���ϴ� ����� ���� ���ɾ�..
						���� Ŭ������ ������ �Լ��� ��Ÿ���� �����
						
						Ư¡ ]
							1. �ݵ�� ������ �Լ� �������� ����� �� �ִ�.
							2. �ݵ�� ù ���忡 �;� �Ѵ�.
			
 */
	
	// �̰��� �⺻ ������ �Լ�
	public Test05() {
		super("����� �����Լ� ȣ��");
		this.setDefaultCloseOperation( super.EXIT_ON_CLOSE );
		//this.setTitle("�̰��� ����ΰ� �����ΰ�???");
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	public Test05(String ttl) {
		this();
		this.setTitle(ttl);
	}

	public static void main(String[] args) {
		new Test05();
		
//		Object obj = new Test05();
	}

}
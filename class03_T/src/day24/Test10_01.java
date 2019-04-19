package day24;

import java.io.*;
public class Test10_01 {
/*
	Test10에서 만든 friend01.txt파일을 읽어보자
 */
	public Test10_01() {
		// 1. 기본 스트림 준비
		FileInputStream fin  = null ;
		// 2. 보조 스트림 준비
		DataInputStream din = null ;
		
		try {
			fin = new FileInputStream("C:\\share\\Lesson\\Java\\test\\friend01.txt");
			din = new DataInputStream(fin);
			/*
			 * 주의 사항
			 		DataOutputStream에서
			 		저장 순서가
			 			이름, 나이, 신장, 성별, 전화, 메일 순서로 저장했으므로
			 		그 순서대로 꺼내야 한다.
			 */
			
			String name = din.readUTF();
			int age = din.readInt();
			float height = din.readFloat();
			boolean gen = din.readBoolean();
			String tel = din.readUTF();
			String mail = din.readUTF();
			
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("신장 : " + height);
			System.out.println("성별 : " + gen);
			System.out.println("전화 : " + tel);
			System.out.println("메일 : " + mail);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				din.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test10_01();
	}

}

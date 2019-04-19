package day24;

import java.io.*;
public class Test10 {
/*
	보조스트림 2
		DataInputStream/DataOutputStream
		==> 많이 사용하는 스트림은 아니다.
			기능 향상은 없고
			대신
			보통 스트림은 반드시 byte[]로만 데이터를 처리한다.
			문자 데이터가 아닌 다른 형태의 데이터는
			문제가 있을 수 있다.
			==> 자바의 데이터형을 byte[] 변환하지 않고
				직접 외부 장치에 입출력하는 기능을 추가한 것이다.
				
		잘 사용하지 않는 이유
		<== 
			DataOutput을 이용한 경우는 DataInput으로 받아야 한다.
			순서가 지켜져야 한다.
			(저장할 때 int, float 
			==>
			꺼낼때도
				int, float 의 순서대로 꺼내야 한다.)
 */
	
/*
	파일에 
	친구의 정보를 저장하자.
		친구정보
			이름 		String
			나이		int
			신장		float
			성별		boolean <== woman : true | man : false
			전화번호	String
			메일주소	String
 */
	public Test10() {
		// 기본 스트림 준비
		FileOutputStream fout = null;
		// 보조스트림 준비
		DataOutputStream dout = null;
		
		try {
			fout = new FileOutputStream("C:\\share\\Lesson\\Java\\test\\friend01.txt");
			dout = new DataOutputStream(fout);
			String name = "조원용";
			int age = 26;
			float height = 182.f;
			boolean gen = false;
			String tel = "010-9876-5432";
			String mail = "cho@increpas.com";
			
			// DataInput/Output 의 특징은 자바의 데이터를 변환하지 않고 사용할 수 있다.
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeFloat(height);
			dout.writeBoolean(gen);
			dout.writeUTF(tel);
			dout.writeUTF(mail);
			
			
			System.out.println("파일 저장 완료");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
				dout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}

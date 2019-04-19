package day24;

import java.io.*;
public class Test06 {
// 파일 복사하기...
	public Test06() {
		/*
			할일]
				스트림은 단방향이다.
				복사라는 개념은 한곳에서 읽어서 
				다른곳에서 읽은데로 쓰면 된다.
				따라서 스트림은 두개가 있어야 된다.
		 */
		// 스트림준비
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			fin = new FileInputStream("C:\\share\\Lesson\\Java\\test\\test01.txt");
			fout = new FileOutputStream("C:\\share\\Lesson\\Java\\test\\test01_01.txt");
			// 한곳에서 읽어서 그대로 다른곳에 쓴다.
			// 그런데 몇번 읽어야 될지 모른다.
			while(true) {
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				if(len == -1) {
					break;
				}
				fout.write(buff, 0, len);
			}
			System.out.println("*** Copy Mission Complete! ***");
			
		} catch(Exception e) {
			
		} finally {
			try {
				fout.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}

package day24;

import java.io.*;
public class Test08 {
/*
	API Documentation 폴더의
		( C:\share\Lesson\Java\doc\docs\api )
	파일의 목록을 알아내보자.
 */
	public Test08() {
		// 1. 목록을 알아내고 싶은 폴더를 파일로 만든다.
		File dir = new File("C:\\share\\Lesson\\Java\\doc\\docs\\api");
		
		String[] list = dir.list();
		/*
		 * for(String f : list) { System.out.println(f); }
		 */
		for(int i = 0 ; i < list.length ; i++ ) {
			System.out.printf("%2d. %s\n", (i+1),list[i]);
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}

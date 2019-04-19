package day24;

import java.io.*;
public class Test08_01 {
/*
	API Documentation 폴더의
		( C:\share\Lesson\Java\doc\docs\api )
	파일의 목록을 알아내보자.
 */
	
/*
	지금 구한 목록은 이름으로 오름차순으로 정렬을 해서
	폴더와 파일이 섞여있다.
	이것을 폴더와 파일을 구분해서
	폴더먼저 출력이 되게 하고
	이후 파일이 출력이 되도록
	정렬해서 출력하세요.
 */
	public Test08_01() {
		// 1. 목록을 알아내고 싶은 폴더를 파일로 만든다.
		File dir = new File("C:\\share\\Lesson\\Java\\doc\\docs\\api");
		
		File[] list = dir.listFiles();
		for(int i = 0 ; i < list.length ; i++ ) {
			File fileinfo = list[i];
			String fileName = fileinfo.getName();	// 파일 이름 알아내는 함수
			long len = fileinfo.length();	// 파일 크기 구해주는 함수
			System.out.printf("%2d. %27s - %d\n", (i+1),fileName, len);
		}
	}

	public static void main(String[] args) {
		new Test08_01();
	}

}

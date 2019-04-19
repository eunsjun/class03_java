package day24;

import java.io.*;
public class Test08_02 {
/*
	API Documentation 폴더의
		( C:\share\Lesson\Java\doc\docs\api )
	파일의 목록을 알아내보자.
 */
	public Test08_02() {
		// 1. 목록을 알아내고 싶은 폴더를 파일로 만든다.
		File dir = new File("C:\\share\\Lesson\\Java\\doc\\docs\\api\\resources\\fonts");
		
		// 확장자가( . 이후에 붙은 문자열을 이야기하고 파일의 타입을 결정해준다.) 
		// svg인 파일만 골라서 출력 하고 싶다.
		String[] list = dir.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				/*
					매개변수 설명
						File dir	: 현재 파일의 정보를 알려준다.
						String name	: 현재 파일의 이름만 알려준다.
						
					accept() 함수 자동 호출되는 함수다.
					목록을 구하는 파일을 하나씩 발견할때마다 이 함수가 호출된다.
					이 함수는 반환값을 	true  를 반환하면 목록에 포함시키고
										false 를 반환하면 목록에서 제외시킨다.
				 */
				
				String tmp = name.substring(name.indexOf('.') + 1);
				
				if(tmp.equals("svg")) {
					return true;
				} else {
					return false;
				}
				
				/*
				if(name.endsWith("svg")) {
					return true;
				} else {
					return false;
				}
				*/
			}
		});
		
		// 리스트 출력
		for(int i = 1 ; i <= list.length ; i++) {
			System.out.printf("%2d. %s\n", i, list[i-1]);
		}
	}

	public static void main(String[] args) {
		new Test08_02();
	}

}


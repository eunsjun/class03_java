package day20;

import java.util.*;
import java.io.*;
public class Test06 {
/*
	Properties 로 Map 데이터를 사용하고 파일에 저장하자.
 */
	public Test06() {
		Properties prop = new Properties();
		prop.put("name", "전영수");
		prop.put("age", "24");
		prop.put("tel", "010-1111-1111");
		prop.put("addr", "서울 관악구 신림동");
		
		// 이제 파일로 저장을 해보자.
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("src/etc/Result.txt");
			prop.store(fout, "주석에 사용할 적당한 내용");
			System.out.println("저장 완료!");
		} catch(Exception e) {
			System.out.println("저장 에러...");
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}

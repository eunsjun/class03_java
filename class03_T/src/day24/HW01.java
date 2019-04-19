package day24;

import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class HW01 {
/*
	문제]
		../java/doc/docs/index.html 파일을 
		../java/test/index.html
		로 복사하세요...
 */
	FileInputStream fin ;
	FileOutputStream fout;
	String result="";
	
	public HW01() {
		String path = "";
		String outPath = "";
		execRun();
	}

	// 파일 내용 읽기 함수
	public String getFile(String path) {
		StringBuffer buff = new StringBuffer();
		try{
			fin = new FileInputStream(path);
			while(true) {
				byte[] tmp = new byte[1024];
				int len = fin.read(tmp);
				String str = new String(tmp, 0 , len);
				buff.append(str);
			}
		} catch(Exception e) {
			
		} finally {
			try {
				fin.close();
			} catch(Exception e) {}
		}
		
		
		return buff.toString();
	}
	// 파일 내용 쓰기 함수
	public void setFile(String path, String str) {
		
		try {
			fout = new FileOutputStream(path);
			byte[] buff = str.getBytes();
			fout.write(buff);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			}catch(Exception e) {}
		}
	}
	// 파일 복사 함수
	
	// 명령 입력 함수
	public String getRun() {
		String str = "";
		System.out.println("*********************");
		System.out.println("**** 1. 파일 읽기 ***");
		System.out.println("**** 2. 파일 쓰기 ***");
		System.out.println("**** 3. 파일 복사 ***");
		System.out.println("**** q. 종     료 ***");
		System.out.println("*********************");
		System.out.println("명령 코드를 입력하세요 : ");
		int ch = 0 ;
		
		try{
			ch = System.in.read();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		str = str + (char) ch;
		return str;
	}
	
	// 명령 구분 처리함수
	public void execRun() {
		String str = getRun();
		JFileChooser choice = new JFileChooser();
		int kind = 0 ;
		File file = null;
		switch(str) {
		case "1":
			kind = choice.showOpenDialog(choice);
			if(kind == JFileChooser.APPROVE_OPTION) {
				file = choice.getSelectedFile();
			}
			String path = file.getAbsolutePath();
			
			System.out.println(path);
			result = getFile(path);
			break;
		case "2":
			kind = choice.showSaveDialog(choice);
			if(kind == JFileChooser.APPROVE_OPTION) {
				file = choice.getSelectedFile();
			}
			
			break;
		case "3":
			
			break;
		case "q":
			return;
		}
	}
	
	public static void main(String[] args) {
		new HW01();
	}

}

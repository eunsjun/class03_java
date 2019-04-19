package day24;

import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class HW01 {
/*
	����]
		../java/doc/docs/index.html ������ 
		../java/test/index.html
		�� �����ϼ���...
 */
	FileInputStream fin ;
	FileOutputStream fout;
	String result="";
	
	public HW01() {
		String path = "";
		String outPath = "";
		execRun();
	}

	// ���� ���� �б� �Լ�
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
	// ���� ���� ���� �Լ�
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
	// ���� ���� �Լ�
	
	// ��� �Է� �Լ�
	public String getRun() {
		String str = "";
		System.out.println("*********************");
		System.out.println("**** 1. ���� �б� ***");
		System.out.println("**** 2. ���� ���� ***");
		System.out.println("**** 3. ���� ���� ***");
		System.out.println("**** q. ��     �� ***");
		System.out.println("*********************");
		System.out.println("��� �ڵ带 �Է��ϼ��� : ");
		int ch = 0 ;
		
		try{
			ch = System.in.read();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		str = str + (char) ch;
		return str;
	}
	
	// ��� ���� ó���Լ�
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

package day07;


import java.util.*;
public class Test01 {
/*
 *   	향상된 for 명령문 (for each 문)
 *   
 *   		형식]
 *   			
 *   			for(데이터타입 변수이름 : 시퀀스자료형변수이름){
 *   				실행문....
 *   			}
 *   
 *   		
 */
	public static void main(String[] args) {
		char[] ch = new char[10];
		
		for(int i = 0 ; i < ch.length ; i++ ) {
			ch[i] = (char)('H' + i);
		}
		
		for(char c : ch) {
			System.out.println("### " + c);
		}
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		
		System.out.println(list.toString());
		
		for(int num : list) {
			System.out.print(num + ", ");
		}
		
	}
}

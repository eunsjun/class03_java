package day24;

import java.io.*;
import java.util.*;
public class Test07 {
	/*
	 * File ==> 이것은 클래스다. 스트림은 아니다. ==> 데이터를 입력, 출력하는 기능은 가지고 있지 않다. 그 파일에 대한 정보를
	 * 처리하기 위한 클래스
	 * 
	 * 생성방법 File(String pathname) ==> 파일의 경로와 이름을 지정해서 만든다.
	 * 
	 * File(String parent, String child) ==> 파일의 경로와 이름을 따로 지정해서 만든다.
	 * 
	 * File(File parent, String child) ==> 파일의 정보를 이용하고 파일의 이름만 다시 지정해서 만든다.
	 * 
	 * 
	 * 참고] 자바에서 File 은 파일 뿐만 아니라 폴더도 파일로 간주한다. 예] File f = new File("c:\\");
	 * 
	 * File(URI uri) ==> 네트워크에서 다른 시스템에 있는 파일 정보를 만든다.
	 * 
	 * URI : 통합 자원 식별자(Uniform Resource Identifier, URI)는 인터넷에 있는 자원을 나타내는 유일한 주소
	 * URL : URL(Uniform Resource Locator, 문화어: 파일식별자, 유일자원지시기)은 네트워크 상에서 자원이 어디
	 * 있는지를 알려주기 위한 규약
	 * 
	 * 참고함수] 1. 정보를 알아내는 함수
	 * 
	 * getName() : 파일의 이름만 알아내는 함수 getParent() : 폴더이름만 알아내는 함수 exists() : 파일의 존재여부를
	 * 확인해주는 함수 length() : 파일의 크기를 알아내는 함수 ....
	 * 
	 * 2. 외부작업을 하기 위한 함수 ==> 데이터입출력 이외에 파일 전체에 대해서 필요한 작업을 할 수 있는 함수들...
	 * 
	 * delete() : 파일 삭제 mkdir() : 폴더를 만드는 기능(하나만 만드는 기능) mkdirs() : 폴더를 만드는데 계층으로
	 * 만드는 함수 예] c:\ABCD 라는 폴더는 가지고 있지 않는 경우
	 * 
	 * c:\ABCD\ab\a
	 * 
	 * renameTo() : 파일 이름 변경 list() : 폴더에 존재하는 파일들의 목록 구해주는 함수 ...
	 * 
	 * 
	 * 참고] String[] list() <== 파일 이름만 알아내 주는 함수 
	 * File[] listFiles() <== 파일의 정보를 알아내
	 * 주는 함수 ==> 일반적인 파일의 목록을 알아내는 함수
	 * 
	 * 
	 * String[] list(FilenameFilter filter) 
	 * File[] listFiles(FileFilter filter)
	 * File[] listFiles(FilenameFilter filter) 
	 * ==> 필터링을 해서 리스트를 구할 수 있다. 
	 * 필요한 파일만 골라서
	 * 목록을 구할 수 있다.
	 * 
	 */

	/*
	 * 1. c:\Data\kimtaehyung 폴더 하나를 강제로 만든다.
	 */
	public Test07() {
		// 자바에서는 폴더도 파일로 취급하므로 파일로 폴더를 만들자.
//		1.
/*
		File file = new File("c:\\Data\\kimtaehyung");
		file.mkdir();
*/

/*
//		2. 계층을 이룬 폴더를 만들어보자. c:\Data\kimtaehyung\java\lesson\source
		File file = new File("c:\\Data\\kimtaehyung\\java\\lesson\\source");
		file.mkdirs();
*/
		
//		3. 삭제할 파일을 File 로 만든다.( ==> 나중에 지울거니까 없으면 못지우니까...)

/*
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("c:\\Data\\kimtaehyung\\sample.txt");
			byte[] buff = new byte[1024];
			fout.write(buff);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch(Exception e) {}
		}
		File file = new File("c:\\Data\\kimtaehyung\\sample.txt");
		file.delete();
*/
		
//		4. 특정 파일의 이름을 다른 이름으로 변경해보자.
		
//			a. 현재 파일과 바꿀이름의 파일을 둘다 File로 만든다.
		File file1 = new File("c:\\Data\\kimtaehyung\\sample.txt");
		File file2 = new File("c:\\Data\\kimtaehyung\\test01.txt");
//			b. 바꾸면 된다.( renameTo() )
		file1.renameTo(file2);
	}
	
	public static void main(String[] args) {
		new Test07();
	}

}

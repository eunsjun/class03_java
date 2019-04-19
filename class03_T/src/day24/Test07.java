package day24;

import java.io.*;
import java.util.*;
public class Test07 {
	/*
	 * File ==> �̰��� Ŭ������. ��Ʈ���� �ƴϴ�. ==> �����͸� �Է�, ����ϴ� ����� ������ ���� �ʴ�. �� ���Ͽ� ���� ������
	 * ó���ϱ� ���� Ŭ����
	 * 
	 * ������� File(String pathname) ==> ������ ��ο� �̸��� �����ؼ� �����.
	 * 
	 * File(String parent, String child) ==> ������ ��ο� �̸��� ���� �����ؼ� �����.
	 * 
	 * File(File parent, String child) ==> ������ ������ �̿��ϰ� ������ �̸��� �ٽ� �����ؼ� �����.
	 * 
	 * 
	 * ����] �ڹٿ��� File �� ���� �Ӹ� �ƴ϶� ������ ���Ϸ� �����Ѵ�. ��] File f = new File("c:\\");
	 * 
	 * File(URI uri) ==> ��Ʈ��ũ���� �ٸ� �ý��ۿ� �ִ� ���� ������ �����.
	 * 
	 * URI : ���� �ڿ� �ĺ���(Uniform Resource Identifier, URI)�� ���ͳݿ� �ִ� �ڿ��� ��Ÿ���� ������ �ּ�
	 * URL : URL(Uniform Resource Locator, ��ȭ��: ���Ͻĺ���, �����ڿ����ñ�)�� ��Ʈ��ũ �󿡼� �ڿ��� ���
	 * �ִ����� �˷��ֱ� ���� �Ծ�
	 * 
	 * �����Լ�] 1. ������ �˾Ƴ��� �Լ�
	 * 
	 * getName() : ������ �̸��� �˾Ƴ��� �Լ� getParent() : �����̸��� �˾Ƴ��� �Լ� exists() : ������ ���翩�θ�
	 * Ȯ�����ִ� �Լ� length() : ������ ũ�⸦ �˾Ƴ��� �Լ� ....
	 * 
	 * 2. �ܺ��۾��� �ϱ� ���� �Լ� ==> ����������� �̿ܿ� ���� ��ü�� ���ؼ� �ʿ��� �۾��� �� �� �ִ� �Լ���...
	 * 
	 * delete() : ���� ���� mkdir() : ������ ����� ���(�ϳ��� ����� ���) mkdirs() : ������ ����µ� ��������
	 * ����� �Լ� ��] c:\ABCD ��� ������ ������ ���� �ʴ� ���
	 * 
	 * c:\ABCD\ab\a
	 * 
	 * renameTo() : ���� �̸� ���� list() : ������ �����ϴ� ���ϵ��� ��� �����ִ� �Լ� ...
	 * 
	 * 
	 * ����] String[] list() <== ���� �̸��� �˾Ƴ� �ִ� �Լ� 
	 * File[] listFiles() <== ������ ������ �˾Ƴ�
	 * �ִ� �Լ� ==> �Ϲ����� ������ ����� �˾Ƴ��� �Լ�
	 * 
	 * 
	 * String[] list(FilenameFilter filter) 
	 * File[] listFiles(FileFilter filter)
	 * File[] listFiles(FilenameFilter filter) 
	 * ==> ���͸��� �ؼ� ����Ʈ�� ���� �� �ִ�. 
	 * �ʿ��� ���ϸ� ���
	 * ����� ���� �� �ִ�.
	 * 
	 */

	/*
	 * 1. c:\Data\kimtaehyung ���� �ϳ��� ������ �����.
	 */
	public Test07() {
		// �ڹٿ����� ������ ���Ϸ� ����ϹǷ� ���Ϸ� ������ ������.
//		1.
/*
		File file = new File("c:\\Data\\kimtaehyung");
		file.mkdir();
*/

/*
//		2. ������ �̷� ������ ������. c:\Data\kimtaehyung\java\lesson\source
		File file = new File("c:\\Data\\kimtaehyung\\java\\lesson\\source");
		file.mkdirs();
*/
		
//		3. ������ ������ File �� �����.( ==> ���߿� ����Ŵϱ� ������ ������ϱ�...)

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
		
//		4. Ư�� ������ �̸��� �ٸ� �̸����� �����غ���.
		
//			a. ���� ���ϰ� �ٲ��̸��� ������ �Ѵ� File�� �����.
		File file1 = new File("c:\\Data\\kimtaehyung\\sample.txt");
		File file2 = new File("c:\\Data\\kimtaehyung\\test01.txt");
//			b. �ٲٸ� �ȴ�.( renameTo() )
		file1.renameTo(file2);
	}
	
	public static void main(String[] args) {
		new Test07();
	}

}

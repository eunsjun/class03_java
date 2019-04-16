package day21;


import java.util.*;
import java.sql.*;
import etc.*;
public class Test03_jdbc {
/*
	JDBC
		==> �ڹ� ���α׷��� �̿��ؼ� �����ͺ��̽��� ��Ʈ�� �� �� �ִ�
			�ܺ� API �̴�.
			
		������]
			�����ͺ��̽��� �� �����ͺ��̽��� ���� DBMS�� ���ؼ� ������ �����ȴ�.
			�� �����ͺ��̽����� ���� ����� ó���ϴ� ���(DBMS)�� �ٸ���.
			���� �����ͺ��̽�����
			�ش� �����ͺ��̽��� DBMS�� ���� 
			���α׷� ����� �ٸ��� �ؾ� �Ѵ� ��п� �̸���.
			
		�ذ� ���]
			�ڹ� �ȿ� DBMS�� ����� ���Ұ�
			�����ڴ� �ڹ��� DBMS ���Ը� ����� �������� �� ���Ҵ�.
			(�����ڴ� �Ѱ��� ������θ� ó���ϵ��� �س��Ҵ�.)
			
			�ڹ� ���� �ִ� DBMS�� ���� �����ͺ��̽��� �����ؼ� ó���ϵ��� �� ���Ҵ�.
			
			==>
			�� ������ �ذ��ϱ� ���� �ڹ��� DBMS�� �ٷ� JDBC �̴�.
			�츮�� JDBC�� ���ٴ� ������
			�ᱹ
			�츮�� JDBC���Ը� ����� ������
			JDBC�� �˾Ƽ� �ʿ��� �����ͺ��̽��� DBMS���� ����� �����ϰ� �ȴ�.
			�������� ���� �� ���̴�.
			
		����]
			JDBC�� ���� DBMS�� �����ϴ� ���α׷��� 
			�ش� �����ͺ��̽��� ����� ȸ�翡�� �����ϰ� �ִ�.
			
			�츮�� ��� 
				ojdbc6.jar
			���� �̴�. 
			
	�ڡڡ�
	�����ͺ��̽� ������ ���ؼ� ���� �ؾ��� ��(�ڹٰ����ڰ�...)
		1. 	����Ϸ��� �����ͺ��̽��� JDBC�� �����ϴ� ���α׷��� ã�´�.
			�� ���α׷��� "JDBC Driver" ��� �θ���.
			
		2. 	ã�Ƴ� �ܺ� API�� ��Ŭ������ ����ؼ�
			��Ŭ�������� �� �ܺ� API�� ��� �� �� �ֵ��� ��ġ�� �ؾ� �Ѵ�.
			
			(�ܺ� API ����ϴ� ���)
				
				1). ������Ʈ���� Properties �޴��� �����Ѵ�.
				2). ���� â���� Java Build Path�� ����
				3). ��� â���� 3��° ���� Libraries�� ����
				4). Add External JARs ��ư�� �����ؼ� �ٿ���� ����̹��� �����Ѵ�.
				
		
	����]
		�������̽��� ����� ���� ����
			==> ������ �����ϴ� ����� ������ DBMS ���� �ٸ��Ƿ�
				�����ϴ� ���� �Լ��� ����� �ű⿡ �µ��� �����ϱ� ���ؼ�...
				
				
		JDBC ���α׷� ��� ���
			0. JDBC Driver�� ���Ѵ�.
			1. ����̹��� �ε��Ѵ�.
				==>
					Class.forName()
			2. �����ͺ��̽��� ������ �Ѵ�.
				
				Connection con = DriverManager.getConnection();
				
				
-------------------------------- ��������� �����ͺ��̽����� �ణ�� �޶�����.
			
			3. JDBC�� ���� DBMS ���̿� ����� ������ �� �ִ� ������ ������ �Ѵ�.
				(����Ŭ�� ���� �����ͺ��̽��̴�.
				��, ���α׷��� �����ϴ� ��ǻ�Ϳ� �����ͺ��̽��� �ִ� ��ǻ�Ͱ� �ٸ� �� �ִ�.)
				
				����ϴ� �������̽� 	Statement
				
				����� ���
					Statement stmt = con.createStatement();
					
				����]
					���Ǹ� �����ϴ� ���
						==> Statement�� ���Ǹ� �Ǿ ������ ���
					
					1. execute(String sql)
						==> ���� ���� �� JDBC ���� �������� �ʴ´�.
							��ȯ���� boolean �ε�
							�̰��� ���ǰ� ����Ǿ����� �˷��ִ� ���� �ƴϰ�
							�����ͺ��̽��� JDBC���� ����� �޾Ҵ�����
							�˷��ִ� ���
							���� ���� ����� ���� ���οʹ� ���� �����ϴ�.
							
						�ַ� ���࿩�ο� ������� ���
							CREATE, INSERT INTO, ... �ַ� ����ϴ� ���
							
					�ڡڡ�
					2. executeQuery(String sql)
						��ȯ���� ResultSet �ε�
						���� ����� ���� ��� ź���ϴ� �ζ��� ���̺��� �����ϴ� Ŭ����...
						
						100% SELECT ���� ��ɿ� ���ȴ�.
						
						
					3. executeUpdate(String sql)
						��ȯ���� int �ε�
						�ǹ̴� ���� ����� ����� ��� ��ȭ�� �������� ������ ��ȯ���ش�.
						
						��]
							update �� �����ߴµ� ��� �����Ͱ� ������ �Ǿ�����...
							delete �� �����ߴµ� ��� �����Ͱ� ������ �Ǿ�����...
							
						�ַ� ���� ����� ���� ��� ���θ� �Ǵ��ؾ� �� ���
						����ϴ� ���
							UPDATE, DELETE,...
				
		
 */
	
	Connection con;
	PreparedStatement pstmt;
	
	public Test03_jdbc() {
		try {
			/*
				1. JDBC�� �ܺ� �����ͺ��̽��� ������ ����̹��� 
					���α׷����� ������ �;� �Ѵ�.
					�ܺ� Ŭ������ �ε��ϴ� �Լ�
						Class.forName()
					
					����̹����� �ܺ� Ŭ���� �̸��� ���ݾ� �ٸ���.
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ==> JDBC�� �ش� ����̹��� �̿��ؼ� ���� �õ��Ѵ�.
			System.out.println("*** ����̹� �ε� ���� ***");
			
			// ����Ŭ�� ���� �õ�
			/*
				������ �����ͺ��̽��� ���� �����ϴ� ����� �ణ�� �ٸ���.
				�˻��ؼ� �� �����ͺ��̽��� �´� ���ӹ���� ���ϸ� �� ���̴�.
				
				�����ϴ� ��ɾ�� JDBC���� ����ϸ� �ȴ�.
					DriverManager.getConnection();
			 */
			
//			String url = "jdbc:oracle:thin:@192.168.7.3:1521:xe";
//			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// url �� �����ͺ��̽��� ���� ���ݾ� �ٸ���.
			
			/*
				����]
					sqlplus���� �ּҸ� �Է��ؼ� �����ϴ� ���
						sqlplus ���̵�/���@localhost:1521/xe
			 */
			
			con = DriverManager.getConnection(url, "increpas", "increpas");
			System.out.println("*** ���� ���� ***");
			/*
				������ �Ǹ� �����ڸ� �����ϴ� ������ ������ ���ش�.
				�� ������ �����ϴ� Ŭ������ Connection �̴�.
				
				con = DriverManager.getConnection(url, ���̵�, ��й�ȣ);
				=====================================================
				��������� �����ͺ��̽��� ���� �޶����� �����̴�.
				���ĺ��ʹ� ��� �����ϰ� ����Ѵ�.
				
				JDBC���� ����� ������ JDBC�� �ش� DBMS���� ����� �����Ѵ�.
				
			 */
			
			// 3. Statement�� �����.
//			Statement stmt = con.createStatement();
			// ���� ����� �����.
			/*
				Test01 ���̺� ���� �ð����� ���̿� �̸��� �Է��Ϸ��� �Ѵ�.
				���� ����� ���ڿ��� ���� �ϹǷ� String Ÿ������ ����� �ȴ�.
			 */
//			String sql = "INSERT INTO test01 values('������', 24, sysdate)";
//			String sql = "INSERT INTO test01 values('���ؼ�', 31, sysdate)";
//			String sql = "DELETE FROM test01 WHERE name = '������'";
			
			
			
			/*
				JDBC�� ���� ����� ;(�����ݷ�)���� �������� �ʴ´�.
				���� ; �� ���̸� ������ �߻��� �Ѵ�.
			 */
			// ���Ǹ���� ������
			// ������ ����� Statement�� �Ǿ ������ �ȴ�.
//			stmt.execute(sql);
			
//			int cnt = stmt.executeUpdate(sql);
			/*
			 * System.out.println("������ ������ ���� : " + cnt); 
			 * System.out.println("�Է��� �����߽��ϴ�.");
			 */
			
			
			/*
			
			// pstmt ������ �Է�
			
			String sql = "INSERT INTO test01 values(?, ?, sysdate)";
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			ArrayList<String> name = new Class03().getName();
			int[] age = {26, 28, 21, 27, 24, 32, 33, 25, 26, 24, 18, 26, 24, 26, 31};
			
			for(int i = 0 ; i < name.size(); i++ ) {
				pstmt.setString(1, name.get(i));
				pstmt.setInt(2, age[i]);
				pstmt.execute();
			}
			System.out.println("*** �Է¼��� ***");
			
			*/
			
			/*
				PreparedStatement 
					���Ǹ���� �⺻Ʋ�� ����� ����
					���� �Է��� �����Ͱ� �ٲ�� ���
					
					���� ���
						String sql = "INSERT INTO test01 values('������', 24, sysdate)";
						
						�� ��� �̸��� ���̴� �Ź� ��ü���شٸ�
						�� ���� ����� ���� �ٽ� ������ �� �� ���� ���̴�.
					
					���� PreparedStatement �� ���鶧 �ݵ�� �⺻ ����� ���� ���� ����� �ʿ��ϴ�.
					
					ResultSet �̶� - ���� ����� ����� �����ϴ� Ŭ����
					
						Type
							A. ResultSet�� TYPE
								1) TYPE_FORWARD_ONLY 		: scroll�� �Ұ����� forward only ��
								2) TYPE_SCROLL_INSENSITIVE 	: scroll �� �����ϳ�, ����� ������ ������� �ʴ´�.
								3) TYPE_SCROLL_SENSITIVE 	: scroll �� �����ϰ�, ����� ���׵� ���� ��
								
							
							B. CONCURRENCY�� TYPE
								1) CONCUR_READ_ONLY		: ResultSet Object �� ������ �Ұ���
								2) CONCUR_UPDATABLE 	: ResultSet Object �� ������ ����
					
			 */
			String sql1 = "SELECT * FROM test01 where age > ?";
			
			PreparedStatement pstmt1 = con.prepareStatement(sql1, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			Scanner sc = new Scanner(System.in);
			int no ;
			while(true) {
				System.out.println("��ȸ�� �ּҳ��̸� �Է��ϼ���!");
//				String sno = sc.nextLine();
				try{
//					no = Integer.parseInt(sno);
					no = sc.nextInt();
					break;
				} catch(Exception e) {
					System.out.println("�߸��Է��߳׿�!");
					if(sc.hasNext()) {
						sc.nextLine();
					}
					continue;
				}
			}
			sc.close();
			
			pstmt1.setInt(1, no);
			ResultSet rs = pstmt1.executeQuery();
			
			int num = 1 ;
			while(rs.next()) {
//				String irum = rs.getString("name");
//				int nai = rs.getInt("age");
				int nai = rs.getInt(2);
				String irum = rs.getString(1);
				System.out.println(num++ +". "+ irum + " | " + nai);
			}
			
			try {
//				stmt.close();
				pstmt.close();
				con.close();
			} catch(Exception e) {}
		} catch(Exception e) {
			System.out.println("### �����ͺ��̽� ���� ���� ###");
		}
	}

	public static void main(String[] args) {
		new Test03_jdbc();
	}

}

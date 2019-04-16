package day21;


import java.util.*;
import java.sql.*;
import etc.*;
public class Test03_jdbc {
/*
	JDBC
		==> 자바 프로그램을 이용해서 데이터베이스를 컨트롤 할 수 있는
			외부 API 이다.
			
		문제점]
			데이터베이스는 그 데이터베이스가 가진 DBMS에 의해서 성능이 결정된다.
			각 데이터베이스마다 질의 명령을 처리하는 방법(DBMS)이 다르다.
			따라서 데이터베이스마다
			해당 데이터베이스의 DBMS에 따라서 
			프로그램 방식을 다르게 해야 한다 결론에 이른다.
			
		해결 방법]
			자바 안에 DBMS를 만들어 놓았고
			개발자는 자바의 DBMS 에게만 명령을 내리도록 해 놓았다.
			(개발자는 한가지 방식으로만 처리하도록 해놓았다.)
			
			자바 내에 있는 DBMS가 실제 데이터베이스와 연결해서 처리하도록 해 놓았다.
			
			==>
			이 문제를 해결하기 위한 자바의 DBMS가 바로 JDBC 이다.
			우리가 JDBC를 배운다는 개념은
			결국
			우리가 JDBC에게만 명령을 내리면
			JDBC가 알아서 필요한 데이터베이스의 DBMS에게 명령을 전달하게 된다.
			개발자의 수고가 덜 것이다.
			
		참고]
			JDBC와 실제 DBMS를 연결하는 프로그램은 
			해당 데이터베이스를 만드는 회사에서 제공하고 있다.
			
			우리의 경우 
				ojdbc6.jar
			파일 이다. 
			
	★★★
	데이터베이스 연결을 위해서 먼저 해야할 일(자바개발자가...)
		1. 	사용하려는 데이터베이스와 JDBC를 연결하는 프로그램을 찾는다.
			이 프로그램을 "JDBC Driver" 라고 부른다.
			
		2. 	찾아낸 외부 API를 이클립스에 등록해서
			이클립스에서 이 외부 API를 사용 할 수 있도록 조치를 해야 한다.
			
			(외부 API 등록하는 방법)
				
				1). 프로젝트에서 Properties 메뉴를 선택한다.
				2). 왼쪽 창에서 Java Build Path를 선택
				3). 가운데 창에서 3번째 탭인 Libraries를 선택
				4). Add External JARs 버튼을 선택해서 다운받은 드라이버를 선택한다.
				
		
	참고]
		인터페이스로 만들어 놓은 이유
			==> 세션을 관리하는 방법이 각가의 DBMS 마다 다르므로
				접속하는 순간 함수의 기능을 거기에 맞도록 조절하기 위해서...
				
				
		JDBC 프로그램 사용 방법
			0. JDBC Driver를 구한다.
			1. 드라이버를 로딩한다.
				==>
					Class.forName()
			2. 데이터베이스에 접속을 한다.
				
				Connection con = DriverManager.getConnection();
				
				
-------------------------------- 여기까지가 데이터베이스마다 약간씩 달라진다.
			
			3. JDBC와 실제 DBMS 사이에 명령을 전달할 수 있는 도구를 만들어야 한다.
				(오라클은 서버 데이터베이스이다.
				즉, 프로그램이 동작하는 컴퓨터와 데이터베이스가 있는 컴퓨터가 다를 수 있다.)
				
				사용하는 인터페이스 	Statement
				
				만드는 방법
					Statement stmt = con.createStatement();
					
				참고]
					질의를 실행하는 방법
						==> Statement에 질의를 실어서 보내는 방법
					
					1. execute(String sql)
						==> 질의 실행 후 JDBC 에게 보고하지 않는다.
							반환값이 boolean 인데
							이것은 질의가 실행되었는지 알려주는 것이 아니고
							데이터베이스가 JDBC에게 명령을 받았는지만
							알려주는 기능
							따라서 질의 명령의 실행 여부와는 전혀 무관하다.
							
						주로 실행여부에 관계없는 명령
							CREATE, INSERT INTO, ... 주로 사용하는 명령
							
					★★★
					2. executeQuery(String sql)
						반환값이 ResultSet 인데
						질의 명령의 실행 결과 탄생하는 인라인 테이블을 관리하는 클래스...
						
						100% SELECT 질의 명령에 사용된다.
						
						
					3. executeUpdate(String sql)
						반환값이 int 인데
						의미는 질의 명령이 실행된 결과 변화된 데이터의 갯수를 반환해준다.
						
						예]
							update 를 실행했는데 몇개의 데이터가 변경이 되었는지...
							delete 를 실행했는데 몇개의 데이터가 삭제가 되었는지...
							
						주로 질의 명령의 실행 결과 여부를 판단해야 할 경우
						사용하는 명령
							UPDATE, DELETE,...
				
		
 */
	
	Connection con;
	PreparedStatement pstmt;
	
	public Test03_jdbc() {
		try {
			/*
				1. JDBC와 외부 데이터베이스를 연결할 드라이버를 
					프로그램에서 가지고 와야 한다.
					외부 클래스를 로딩하는 함수
						Class.forName()
					
					드라이버마다 외부 클래스 이름이 조금씩 다르다.
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ==> JDBC가 해당 드라이버를 이용해서 연결 시도한다.
			System.out.println("*** 드라이버 로딩 성공 ***");
			
			// 오라클에 접속 시도
			/*
				각각의 데이터베이스들 마다 접속하는 방법이 약간씩 다르다.
				검색해서 각 데이터베이스에 맞는 접속방법을 구하면 될 것이다.
				
				접속하는 명령어는 JDBC에게 명령하면 된다.
					DriverManager.getConnection();
			 */
			
//			String url = "jdbc:oracle:thin:@192.168.7.3:1521:xe";
//			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// url 도 데이터베이스들 마다 조금씩 다르다.
			
			/*
				참고]
					sqlplus에서 주소를 입력해서 접속하는 방법
						sqlplus 아이디/비번@localhost:1521/xe
			 */
			
			con = DriverManager.getConnection(url, "increpas", "increpas");
			System.out.println("*** 접속 성공 ***");
			/*
				접속이 되면 접속자를 관리하는 세션을 제공을 해준다.
				이 세션을 관리하는 클래스가 Connection 이다.
				
				con = DriverManager.getConnection(url, 아이디, 비밀번호);
				=====================================================
				여기까지가 데이터베이스들 마다 달라지는 내용이다.
				이후부터는 모두 동일하게 사용한다.
				
				JDBC에게 명령을 내리면 JDBC가 해당 DBMS에게 명령을 전달한다.
				
			 */
			
			// 3. Statement를 만든다.
//			Statement stmt = con.createStatement();
			// 질의 명령을 만든다.
			/*
				Test01 테이블에 현재 시간으로 나이와 이름을 입력하려고 한다.
				질의 명령은 문자열로 전달 하므로 String 타입으로 만들면 된다.
			 */
//			String sql = "INSERT INTO test01 values('전영수', 24, sysdate)";
//			String sql = "INSERT INTO test01 values('허준석', 31, sysdate)";
//			String sql = "DELETE FROM test01 WHERE name = '전영수'";
			
			
			
			/*
				JDBC는 질의 명령을 ;(세미콜론)으로 종료하지 않는다.
				따라서 ; 을 붙이면 에러가 발생을 한다.
			 */
			// 질의명령을 보내고
			// 보내는 방법은 Statement에 실어서 보내면 된다.
//			stmt.execute(sql);
			
//			int cnt = stmt.executeUpdate(sql);
			/*
			 * System.out.println("삭제된 데이터 갯수 : " + cnt); 
			 * System.out.println("입력이 성공했습니다.");
			 */
			
			
			/*
			
			// pstmt 데이터 입력
			
			String sql = "INSERT INTO test01 values(?, ?, sysdate)";
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			ArrayList<String> name = new Class03().getName();
			int[] age = {26, 28, 21, 27, 24, 32, 33, 25, 26, 24, 18, 26, 24, 26, 31};
			
			for(int i = 0 ; i < name.size(); i++ ) {
				pstmt.setString(1, name.get(i));
				pstmt.setInt(2, age[i]);
				pstmt.execute();
			}
			System.out.println("*** 입력성공 ***");
			
			*/
			
			/*
				PreparedStatement 
					질의명령의 기본틀은 만들어 놓고
					이후 입력할 데이터가 바뀌는 경우
					
					예를 들면
						String sql = "INSERT INTO test01 values('전영수', 24, sysdate)";
						
						이 경우 이름과 나이는 매번 교체해준다면
						이 질의 명령은 이후 다시 재사용을 할 수 있을 것이다.
					
					따라서 PreparedStatement 는 만들때 반드시 기본 골격을 가진 질의 명령이 필요하다.
					
					ResultSet 이란 - 질의 명령의 결과를 저장하는 클래스
					
						Type
							A. ResultSet의 TYPE
								1) TYPE_FORWARD_ONLY 		: scroll이 불가능한 forward only 형
								2) TYPE_SCROLL_INSENSITIVE 	: scroll 이 가능하나, 변경된 사항은 적용되지 않는다.
								3) TYPE_SCROLL_SENSITIVE 	: scroll 도 가능하고, 변경된 사항도 적용 됨
								
							
							B. CONCURRENCY의 TYPE
								1) CONCUR_READ_ONLY		: ResultSet Object 의 변경이 불가능
								2) CONCUR_UPDATABLE 	: ResultSet Object 의 변경이 가능
					
			 */
			String sql1 = "SELECT * FROM test01 where age > ?";
			
			PreparedStatement pstmt1 = con.prepareStatement(sql1, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			Scanner sc = new Scanner(System.in);
			int no ;
			while(true) {
				System.out.println("조회할 최소나이를 입력하세요!");
//				String sno = sc.nextLine();
				try{
//					no = Integer.parseInt(sno);
					no = sc.nextInt();
					break;
				} catch(Exception e) {
					System.out.println("잘못입력했네요!");
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
			System.out.println("### 데이터베이스 연결 실패 ###");
		}
	}

	public static void main(String[] args) {
		new Test03_jdbc();
	}

}

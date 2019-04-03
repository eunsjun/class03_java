package day12;

/*
	★★★
	은닉화 (캡슐화)
		: 	프로그램에 있어서 가장 중요한 요소는 데이터이다.
			즉, 변수가 프로그램에서 핵심적인 요소가 된다.
			무결성 데이터를 유지할 수 있는것이 가장 중요한 개념이 된다.
			
			은닉화란
				변수를 사용자가 함부로 변경하지 못하도록
				(결점이 있는 데이터가 입력되지 못하도록,
				데이터의 결점이 생기지 않도록)
				방지하는 기술 을 은닉화라 한다.
				
			방법]
				1. 중요한 데이터가 기억될 변수는 접근 지정자를 private 로 하고
					==> 외부에서 변수에 접근을 못하게 된다.
						클래스 내부에서만 접근 가능한 상태가 된다.
						
				2. 	대신 이 변수의 값을 읽거나 수정할 경우에는
					클래스 내부에서 함수에서 처리해 준다.
					이때 함수의 접근지정자는 외부에서 호출 가능하게 public 으로 한다.
	
	
 */

/*
		우리가 만든 데이터를 저장하고 한꺼번에 모든 데이터를 외부에 넘겨줄 수 있도록 만든 클래스를
		VO 클래스 또는 데이터 빈(Bean) 클래스, DTO 클래스라 부른다.
		저 전은석은 VO 클래스로 부릅니다.
 */


// 문제 ] 우리반 학생 한명의 과목 성적을 저장할 변수를 만들고 은닉화하세요.
public class Test05 {
	private String name;
	private int javaScore;
	private int oracleScore;
	private int jspScore;
	private int springScore;
	private int webScore;
	private int jsScore;
	private int total;
	/*
	 * // 자바점수 입력 함수 public void setJavaScore(int javaScore) { this.javaScore =
	 * javaScore ; } // 자바점수 읽는 함수 public int getJavaScore() { return
	 * this.javaScore; }
	 */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}
	public int getOracleScore() {
		return oracleScore;
	}
	public void setOracleScore(int oracleScore) {
		this.oracleScore = oracleScore;
	}
	public int getJspScore() {
		return jspScore;
	}
	public void setJspScore(int jspScore) {
		this.jspScore = jspScore;
	}
	public int getSpringScore() {
		return springScore;
	}
	public void setSpringScore(int springScore) {
		this.springScore = springScore;
	}
	public int getWebScore() {
		return webScore;
	}
	public void setWebScore(int webScore) {
		this.webScore = webScore;
	}
	public int getJsScore() {
		return jsScore;
	}
	public void setJsScore(int jsScore) {
		this.jsScore = jsScore;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal() {			// 
		this.total = javaScore + oracleScore + jspScore + 
					springScore + webScore + jsScore ;
	}
}

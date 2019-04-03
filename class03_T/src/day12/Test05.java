package day12;

/*
	�ڡڡ�
	����ȭ (ĸ��ȭ)
		: 	���α׷��� �־ ���� �߿��� ��Ҵ� �������̴�.
			��, ������ ���α׷����� �ٽ����� ��Ұ� �ȴ�.
			���Ἲ �����͸� ������ �� �ִ°��� ���� �߿��� ������ �ȴ�.
			
			����ȭ��
				������ ����ڰ� �Ժη� �������� ���ϵ���
				(������ �ִ� �����Ͱ� �Էµ��� ���ϵ���,
				�������� ������ ������ �ʵ���)
				�����ϴ� ��� �� ����ȭ�� �Ѵ�.
				
			���]
				1. �߿��� �����Ͱ� ���� ������ ���� �����ڸ� private �� �ϰ�
					==> �ܺο��� ������ ������ ���ϰ� �ȴ�.
						Ŭ���� ���ο����� ���� ������ ���°� �ȴ�.
						
				2. 	��� �� ������ ���� �аų� ������ ��쿡��
					Ŭ���� ���ο��� �Լ����� ó���� �ش�.
					�̶� �Լ��� ���������ڴ� �ܺο��� ȣ�� �����ϰ� public ���� �Ѵ�.
	
	
 */

/*
		�츮�� ���� �����͸� �����ϰ� �Ѳ����� ��� �����͸� �ܺο� �Ѱ��� �� �ֵ��� ���� Ŭ������
		VO Ŭ���� �Ǵ� ������ ��(Bean) Ŭ����, DTO Ŭ������ �θ���.
		�� �������� VO Ŭ������ �θ��ϴ�.
 */


// ���� ] �츮�� �л� �Ѹ��� ���� ������ ������ ������ ����� ����ȭ�ϼ���.
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
	 * // �ڹ����� �Է� �Լ� public void setJavaScore(int javaScore) { this.javaScore =
	 * javaScore ; } // �ڹ����� �д� �Լ� public int getJavaScore() { return
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

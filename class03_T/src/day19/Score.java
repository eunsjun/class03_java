package day19;

public class Score implements Comparable {
	private String name;
	private int java, oracle, jsp, spring, web, js, total;
	private float avg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getOracle() {
		return oracle;
	}
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getJs() {
		return js;
	}
	public void setJs(int js) {
		this.js = js;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal() {
		this.total = java + oracle + jsp + spring + web + js;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public void setAvg() {
		this.avg = Math.round(total / 6f * 100) / 100;
	}
	public void setCalc() {
		setTotal();
		setAvg();
	}
	public String toString() {
		return "Name : " + name + 
				"\nTotal : " + total +
				"\nAverage : " + avg +
				"\nJava : " + java +
				"\nOracle : " + oracle + 
				"\nJsp : " + jsp +
				"\nSpring : " + spring + 
				"\nWeb : " + web + 
				"\nJs : " + js;
	}

	@Override
	public int compareTo(Object o) {
		// 이 함수는 Comparable 인터페이스가 가지고 있는 단 하나의 함수이다.
		// Comparable 인터페이스를 구현(implements)하면 반드시 이 함수를 오버라이드 해줘야 한다.
		// 이때 개발자 비교할 대상을 정하고 그 처리내용을 정수로 반환해주면 된다.
		
		// 비교기준을 정하고
		// 그런데 그비교기준은 Object o(Score) 내부에 있을 것이다.
		/*
				Score score = new Score();
				...
				
				Score score1 = new Score();
				....
				
				score.compareTo(score1) ==> 반환값은 정수
				
		 */
		// 따라서 o 에 있는 변수들 중 하나를 정해서 비교 기준을 만들면 될 것이다.
		
		/*
			<, > 연산자는 기본타입에서는 사용 가능 하지만
			레퍼런스 타입에서는 사용 할 수 없다.
			그래서 compareTo() 함수를 만들어서 
			비교 처리를 하게되어 있다.
		 */

		// 우선 이름으로 정렬하도록 해보자.(내림차순)
		String name1 = this.name;
		String name2 = ((Score)o).getName();
		return -(name1.compareTo(name2));	
		// 여기서 사용하는 compareTo() 함수는 
		// String 클래스가 가지고 있는 compareTo() 함수이다.
	}

}

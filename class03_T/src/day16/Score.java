package day16;

public class Score {
	private String name;
	private int java, oracle, jsp, spring, web, js, total;
	private float avg;
	
	public Score() {
	}
	
	public Score(String name) {
		this.name = name;
	}
	
	public Score(String name, int java, int oracle, int jsp, int spring, int web, int js) {
		this(name);
		this.java = java;
		this.oracle = oracle;
		this.jsp = jsp;
		this.spring = spring;
		this.web = web;
		this.js = js;
		setTotal();
		setAvg();
	}
	
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
		this.total = java + oracle + jsp + spring + web + js ;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public void setAvg() {
		this.avg = total / 6f;
	}
	
	// equals() Overriding
	public boolean equals(Object o) {
		return (this.name).equals(((Score)o).getName());
		// this.name == ((String)o).getName()  ==> ÁÖ¼Òºñ±³  X
	}
	
	// toString() Overriding
	public String toString() {
		/*
		 * Àü¿µ¼ö : 90, 90, 90, 90, 90, 90
			ÃÑÁ¡ : 540, 
			Æò±Õ : 90.0
		 */
		return (this.name + " : " + java + ", " + oracle + ", " + 
				jsp + ", " + spring + ", " + web + ", " + js +
				"\r\nÃÑ Á¡ : " + total + "\r\nÆò ±Õ : "+ avg);
	}
	
}

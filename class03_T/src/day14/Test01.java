package day14;

public class Test01 {

	public Test01() {
		Grand g = new Son();
//		g.xyz(); ==> X
		g.abc();
		Father f = new Son();
		f.xyz();
	}

	public static void main(String[] args) {
		new Test01();
	}

}

class Grand{
	void abc() {
		System.out.println("### 여기는 할부지 abc() ");
	}
}

class Father extends Grand {
	void abc() {
		System.out.println("*** 여기는 아부지 abc() ");
	}
	void xyz() {
		System.out.println("### 아부지 xyz() ");
	}
}

class Son extends Father{
	void xyz() {
		System.out.println("*** 아들 xyz()");
	}
}
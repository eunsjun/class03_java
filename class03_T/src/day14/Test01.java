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
		System.out.println("### ����� �Һ��� abc() ");
	}
}

class Father extends Grand {
	void abc() {
		System.out.println("*** ����� �ƺ��� abc() ");
	}
	void xyz() {
		System.out.println("### �ƺ��� xyz() ");
	}
}

class Son extends Father{
	void xyz() {
		System.out.println("*** �Ƶ� xyz()");
	}
}
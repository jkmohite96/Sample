package sample;

public class TestMainClass implements A1 {

	public static void main(String[] args) {
		System.out.println(A2.name);
	}

	@Override
	public int method3() {
		System.out.println("inside method3");
		return 0;
	}

	@Override
	public void method1() {
		System.out.println("inside method1");
	}

	@Override
	public int method2() {
		System.out.println("inside method2");
		return 0;
	}

	@Override
	public int method1(int a) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

interface A1 extends A2{  //--Pure abstract
	String name="value1"; //Public static final
	int method1(int a); // public and abstract
	public int method2();
}

interface A2{  //--Pure abstract
	String name="value2"; //Public static final
	void method1(); // public and abstract
	public int method3();
}

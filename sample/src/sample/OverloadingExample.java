package sample;

public class OverloadingExample {

	//Var args..  java 1.5  -- Low priority
	
	public void method1(double... b){  //int [] a
		System.out.println("your business logic");
	}
	
	public void method1(int[] b){  //int [] a
		System.out.println("your business logic");
	}
	
	public void method1(int a){
		System.out.println("inside method a...");
	}
	
	/*public static void main(String[] args) {
		OverloadingExample ob = new OverloadingExample();
		//method1((int)10.0);
		ob.method1();
		ob.method1(10);
		ob.method1(20.0,30.0);
		ob.method1(10,10,10,10);
	}*/
	
	
	final synchronized public static void main(String... a) {
		OverloadingExample ob = new OverloadingExample();
		//method1((int)10.0);
		ob.method1();
		ob.method1(10);
		ob.method1(20.0,30.0);
		ob.method1(10,10,10,10);
	}

	
}

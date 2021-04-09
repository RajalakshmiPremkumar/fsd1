package programs.java.day4;

class Outer {
	
	void outerMethod() {
		System.out.println("Inside OuterMethod");
		
					class Inner{
						Inner(){}
						void innerMethod() {
							System.out.println("Inside InnerMethod");
							f();
						}
					}
		
		
					Inner y = new Inner();
					y.innerMethod();

}
	

	public void f() {
		System.out.println("I am inside F method");
		
	}
}

public class Method_Local_Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Outer x = new Outer();

			x.outerMethod();
	}

}

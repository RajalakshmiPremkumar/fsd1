package programs.java.day2;

public class MethodOverload {

	
	public void area(int b, int h) {
		System.out.println("Area of triangle is " + (0.5*b*h));
	}
	

	public void area(int r) {
		System.out.println("Area of Circle is " + (3.14*r*r));
	}
	
	public void area(float g, int c) {
		
		
		System.out.println("The value of float var g "+ g + " and int c is" + c);
	}
	
public void area(int h, float g, char m) {
		
		
		System.out.println("The value of float var  is "+ g + " and int val is " + h + " and char val is " + m );
	}
	public static void main(String[] args) {
		// Method Overloading function
		
		MethodOverload obj = new MethodOverload();
		obj.area(2,4);
		obj.area(3);
		obj.area(3,2.1f,'A');
		obj.area(6.8f,7);

	}

}

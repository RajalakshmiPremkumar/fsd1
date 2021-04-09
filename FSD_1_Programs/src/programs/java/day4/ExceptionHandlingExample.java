package programs.java.day4;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =1;
		int b=0;
		int c;
		
		try {
			c= a/b;
			System.out.println("Value of c by division is "+ c);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number cannot be divided by zero");
		}
		catch(Exception e) {
			System.out.println("Generic exception");
		}
	finally {
		System.out.println("Inside Finally");
	}
		c= a=b;
		
		System.out.println("Value of c by addition is "+ c);
	}

}

package programs.java.day2;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b= 4;
		
		int c= minFunction(a,b);
		System.out.println("Minimun value is " + c);
		
		
	}

	public static int minFunction(int x1, int x2) {
		
		int min;
		
		if(x1<x2)
			min = x1;
		else
			min = x2;
		
		return min;
		
		
	}
	
	
}

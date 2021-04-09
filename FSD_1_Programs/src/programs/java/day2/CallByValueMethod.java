package programs.java.day2;

public class CallByValueMethod {
	
	int val = 100;
	int operation(int val) {
		
		
		
		val= val*10/100;
		return val;
		
		}
	
	public static void main(String args[]) {
		
		
		
		 CallByValueMethod obj = new CallByValueMethod();
		 
		 System.out.println("Value before making operation" + obj.val);
		 
		 int f = obj.operation(168);
		 
		 System.out.println("Value after making operation" + f);
		
	}

}

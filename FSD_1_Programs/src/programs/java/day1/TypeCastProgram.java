package programs.java.day1;

public class TypeCastProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//--TYPE CASTE BETWEEN INT AND LONG---//
	
		int i = 100;
		long l = 70000;
		System.out.println("long value" + l);
		
		int o = (int) l; //explicit type cast from long to int
		
		char t = (char) i;
		
		
		//--TYPE CASTE BETWEEN DOUBLE AND FLOAT---//
		
		double d = 190.0;
		float r = (float)d;
		System.out.println("float value" + r);
		System.out.println("double value" + d);
		
		
		//--TYPE CASTE BETWEEN DOUBLE-->LONG--> INT---//
		
		
		double d2 = 1000.046543;
		System.out.println("double value" + d2);
		long l2  = (long)d2;
		int i2 = (int) l2;
		System.out.println("double value" + d2);
		System.out.println("long  value" + l2);
		System.out.println("int  value" + i2);
		
		
		
		
		
		
		
		
		
		
		

	}

}

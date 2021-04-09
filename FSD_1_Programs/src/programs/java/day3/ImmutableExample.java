package programs.java.day3;


public class ImmutableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String S = "preethi";
		
				String F = "preethi";
		
		if(S.equals(F)) 
			System.out.println("True");
		else
			System.out.println("False");
		
		
		if(S ==F)
			System.out.println("True");
		else
			System.out.println("False");
		
		//String Buffer
		
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("String Buffer Value: " + sb);
		sb.insert(1, "Java");
		System.out.println("String Buffer Value afetr Inserting java @ 1: " + sb);
		
		sb.append("Java");
		System.out.println("String Buffer Value afetr Apppending java " + sb);
		
		
		sb.replace(1, 3, "Java");
		
		System.out.println("After Replacing" + sb);
		
		sb.delete(1,3);
		System.out.println("After Deleting" + sb);
		
		sb.reverse();
		
		
		StringBuilder ss = new StringBuilder("Core");
		System.out.println(">>>>" + ss);
		
		
}

}

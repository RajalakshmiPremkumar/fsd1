package programs.java.day3;

public class Member_Inner {
	
	 int dat1 =20;
	
	void display()
	{
		
		System.out.println("Outer Class Display");
		
	}

	
	
	
	class Inner{
		
		public int  display()
		{
			
			System.out.println("Inner Class Display: ");
		
			return dat1;
	
		
		}
		
		void avl()
		{
			System.out.println("Outer Class Available method");
		}
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Member_Inner mm = new Member_Inner();
		Member_Inner.Inner inobj = mm.new Inner();
		System.out.println(inobj.display());
		
		

	}

}

package programs.java.day2;

public class ConstructorExample {
	
	int id;
	String name;
	
	public ConstructorExample() {
		id = 10;
		name = "Raji";
		System.out.println("Initialised value inside Default constructor");
		
	}
		void display() {
			System.out.println("ID is " + id + " and Name is " + name);
	
		}
	public static void main(String[] args) {
		// Default Constructor example
		
		ConstructorExample s1 = new ConstructorExample();
		s1.display();
		
		

		
		
		
		

	}

}

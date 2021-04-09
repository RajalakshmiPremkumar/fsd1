package programs.java.day2;

public class ParameterConstruct {

	
	int id;
	String name;
	
	
	public ParameterConstruct() {
		System.out.println("Inside Default constructor");
	}
	public ParameterConstruct(int id, String name) {
		
		this.id= id;
		this.name = name;
		
		
	}
		void display() {
			System.out.println("ID is " + id + " and Name is " + name);
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParameterConstruct s1 = new ParameterConstruct(11,"Raji");
		ParameterConstruct s2 = new ParameterConstruct(22,"Preethi");
		
		s1.display();
		s2.display();
		
		
	}

}

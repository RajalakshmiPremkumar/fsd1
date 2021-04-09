package programs.java.accessmodifier.package1;

public class TestB {
	
	public void methodPublic() {
		System.out.println("Public method of TestB");
		
		
	}
	
	public void methodProtected() {
		System.out.println("protected method of TestB");
		
		
	}
	
	public static void main(String args[]) {
		new TestA().methodPublic();
		new TestA().methodProtected();
		new TestA().methodDefault();
		
		System.out.println("Value of long"+ new TestA().k);
		
		
}
	
	

}

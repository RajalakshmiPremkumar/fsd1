package programs.java.accessmodifier.package2;
import programs.java.accessmodifier.package1.TestB;

public class TestD extends TestB {
	
	
	
	
	public static void main(String[] args) {
		new TestB().methodPublic();
		
		// works, accessing super class protected method using subclass
		new TestB().methodProtected();
	}
}
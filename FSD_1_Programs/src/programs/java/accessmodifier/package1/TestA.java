package programs.java.accessmodifier.package1;

public class TestA {

	private int y= 10;
	long k = 1000;
	
	
	public void methodPublic() {
		methodPrivate();
		
		
	}
	
	protected void methodProtected() {
		methodPrivate();
		
	}
	void methodDefault() {
		methodPrivate();
		
	}
	
	private void methodPrivate() {
		System.out.println("Class TestA: Method Private");
		System.out.println("value of private variable Y:" + y);
		System.out.println("value of default long variable:"+ k);
		
		
		
	}

}

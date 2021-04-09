package programs.java.day2;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Hi");
		al.add("How r u");
		al.add("Hi");
		
		
		System.out.println("ArrayList is"+ al);
		
		al.remove(1);
		
		System.out.println("ArrayList is"+ al);
		al.add(2,"Happy");
		
		ListIterator<String> li = al.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		
	
	}

}

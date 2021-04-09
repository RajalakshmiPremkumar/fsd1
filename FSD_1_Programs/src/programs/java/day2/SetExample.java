package programs.java.day2;
import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		// Example of se
		
		TreeSet<String> tt = new TreeSet<String>();
		
		tt.add("d");
		tt.add("a");
		tt.add("r");
		tt.add("d");
		tt.add("s");
		tt.add("q");
		tt.add("p");
		tt.add("f");
		tt.add("F");
		
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Blue");
		hs.add("Black");
		hs.add("Blue");
		hs.add("Bye");
		hs.add("Hello");
		hs.add("hru");
		hs.add("Apple");
		hs.add("Grey");
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("America");
		lhs.add("Canada");
		lhs.add("Australia");
		lhs.add("Switzerland");
		lhs.add("Bermuda");
		lhs.add("India");
		lhs.add("England");
		lhs.add("Nepal");
		
		System.out.println("TreeSet is" + tt);
		System.out.println("HashSet is" + hs);
		System.out.println("LinkedHashSet is" + lhs);
		
		System.out.println("Size of HashSet is" + hs.size());
		
		System.out.println("Does HashSet cointains U is" + hs.contains("u"));
		
		System.out.println("Does Treeset cointains F is" + tt.contains("F"));
		
		
		
		System.out.println("TreeSetempty is" + tt.isEmpty());
		
		System.out.println("Remove the country from lhs" + lhs.remove("Nepal"));
		
		hs.clear();
		
		System.out.println("HashSet is" + hs);
		
		System.out.println("is HashSet empty " + hs.isEmpty());
		
		
		
		

		
		

	}

}

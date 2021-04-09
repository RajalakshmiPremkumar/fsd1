package programs.java.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Pattern.matches("geeks*o*","geekso"));
		
		System.out.println(Pattern.matches("[a-zA-Z0-9+_%]+@\\S+.\\S+","rajalakshmi_p02@gmail.com"));
		System.out.println(Pattern.matches("[a-zA-Z0-9+_%]+@[a-z]+.[a-z]+","rSriram1@g.in"));

	}

}

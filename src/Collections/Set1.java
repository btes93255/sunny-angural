package Collections;

import java.util.Set;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		Set<String> s=new TreeSet<String>();
		s.add("Sunny");
		s.add("Rahul");
		s.add("Akshit");
		System.out.println("Without sorting::");
		for(String j:s) {
			System.out.println(j);
		}
	}
}

package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class set {
	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<>();
        name.add("sunny");
        name.add("sahil");
        name.add("xyz");
        name.add("sahil");
        
//        Set<String> s=new HashSet<>();
//        for(String i:name){
//            if(s.add(i)==false){
//                System.out.println(i);
//            }
//        }
        Set<String> s=new HashSet<>();
        System.out.println("Before::");
        for(String i:name){
            s.add(i);
            System.out.println(i);
        }
        System.out.println("After::");
        for(String j:s) {
        	System.out.println(j);
        }
        
	}
}

package Collections;

import java.util.Collections;
import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		 Vector<Integer> v=new Vector<Integer>();
	        v.add(4);
	        v.add(5);
	        v.add(2);
	        v.add(1);
	        v.add(7);  
	        System.out.print("Capacity of vector:");
	        System.out.println(v.capacity());
//	        v.remove(1);
	        System.out.println("UnSorted:");
	        for(Object i:v){
	            System.out.println(i);
	        }
//	        Collections.sort(v);
//	        System.out.println("Sorted:");
//	        for(Object i:v){
//	            System.out.println(i);
//	        }
	}
}

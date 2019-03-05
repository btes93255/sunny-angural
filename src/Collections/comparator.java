package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparator {

	public static void main(String[] args) {
		ArrayList<Integer> c=new ArrayList<>(); 
        c.add(889);
        c.add(323);
        c.add(267);
        c.add(598);
        c.add(991);
        Comparator<Integer> com=new comimple();
        Collections.sort(c,com);
      
        for(int i:c){
        	System.out.println(i);
        }

	}

}

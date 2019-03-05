package Collections;

import java.util.ArrayList;


public class c1 {
	public static void main() {
		ArrayList<Object> value=new ArrayList<Object>();
        value.add(5);
        value.add("xyz");
        value.add(5);
        //Iterator i=value.iterator();
       // while(i.hasNext()){
         //   System.out.println(i.next());
        //}
        for(Object i:value){
            System.out.println(i);
        }
	}
}

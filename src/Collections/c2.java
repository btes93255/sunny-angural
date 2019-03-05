package Collections;

import java.util.ArrayList;
//import java.util.Iterator;


public class c2 {

	public static void main(String[] args) {
		ArrayList<Integer> value=new ArrayList<>();
        value.add(5);
        value.add(7);
        value.add(8);
        value.add(1,6);//add 6 in b/w 5&7
        //Iterator i=value.iterator();
       // while(i.hasNext()){
         //   System.out.println(i.next());
        //}
        value.remove(2);
        for(Object i:value){
            System.out.println(i);
        }
        
      

	}

}

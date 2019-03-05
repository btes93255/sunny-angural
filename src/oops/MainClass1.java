package oops;

import java.io.IOException;

public class MainClass1 {
    static int x=10;
    static
    {
        x=10;
        System.out.println(x);
    }
    
    
    
    public static void main(String[] c)throws IOException {
        System.out.println(c[0]+" "+c[1]);
        Student1[] s=new Student1[3];
        for(int i=0;i<s.length;i++){
            s[i]=new Student1();
        }
        
        Student1 s4=new Student1("Sunny",86.0f,'m');
        /*for(int i=0;i<s.length;i++){
            //System.out.println(s[i].roll_no+" "+ s[i].name+" "+s[i].marks);
            
            s[i].display();
        }*/
        s4.display();
        Student1 s5=new Student1(s4);
        //s5.name="Rahul";
        s5.display();
        //
        //System.out.println(s2.roll_no+" "+ s2.name+" "+s2.marks);
    Student1.message();
    }

}


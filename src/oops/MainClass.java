package oops;
import java.io.*;
public class MainClass {
	public static void main(String []args)throws IOException {
		Student s1=new Student();
		//Student s2=new Student();
		s1.cal_total();
		s1.cal_average();
		s1.find_grade();
		/*s2.cal_total();
		s2.cal_average();
		s2.find_grade();*/
		s1.display();
		//s2.display();
	}
}

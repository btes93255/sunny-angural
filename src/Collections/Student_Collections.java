package Collections;
import oops.Student1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Student_Collections {

	public static void main(String[] args) throws IOException {
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		Student1 s3=new Student1();
		ArrayList<Student1> s=new ArrayList<Student1>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		//System.out.println(s1);
		System.out.println("Unsorted ::");
		for(Student1 a:s) {
			System.out.println(a.getRoll_no()+" "+a.getName()+"  "+a.getGender()+"  "+a.getMarks());
		}
		
		System.out.println("");
		Collections.sort(s,new sortbymarks());
		System.out.println("Sorted By Marks ::");
		for(Student1 a:s) {
			System.out.println(a.getRoll_no()+" "+a.getName()+"  "+a.getGender()+"  "+a.getMarks());
		}
		
		System.out.println("");
		Collections.sort(s,new sortbyname());
		System.out.println("Sorted By Name ::");
		for(Student1 a:s) {
			System.out.println(a.getRoll_no()+" "+a.getName()+"  "+a.getGender()+"  "+a.getMarks());
		}
		
	}

}

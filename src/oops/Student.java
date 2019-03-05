package oops;

import java.io.*;

public class Student {
		
		int rollno;
		String name;
		double eng_marks,math_marks,science_marks,total_marks,average;
		char grade;
		
		//static String trainer="xyz";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Student() throws IOException{
			System.out.println("Enter data for student ");
			System.out.println("Enter ur rollno ::");
			rollno=Integer.parseInt(br.readLine());
			System.out.println("Enter ur name ::");
			name=br.readLine();
			System.out.println("Enter ur eng_marks(/100) ::");
			eng_marks=Double.parseDouble(br.readLine());
			System.out.println("Enter ur math_marks(/100) ::");
			math_marks=Double.parseDouble(br.readLine());
			System.out.println("Enter ur science_marks(/100) ::");
			science_marks=Double.parseDouble(br.readLine());
			}
		 void cal_total() {
			 total_marks=eng_marks+math_marks+science_marks;
		 }
		 void cal_average() {
			 average=total_marks/3;
		 }
		 void find_grade() {
			 if(average>=70) 
				 grade='A';
			 else if(average<70 && average>=50) 
				 grade='B';
			 else if(average<50 && average>=35)  
				 grade='C';
			 else 
				 grade='F';
		 }
		 void display() {
			 System.out.println("Name ::"+ name);
			 System.out.println("Rollno ::"+ rollno);
			 System.out.println("Total marks ::"+ total_marks);
			 System.out.println("Average ::"+ average);
			 System.out.println("Grade ::"+ grade);
		 }
}

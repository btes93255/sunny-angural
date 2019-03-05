package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Student1{
    private int roll_no;//instance variables
    
    private float marks;
    private char gender;
    private String name;
    int i=1;
    static String trainer_nm="Shikhi";
    //InputStreamReader b=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //Scanner br=new Scanner(System.in); 
    
    
    public Student1()throws IOException {
    	//System.out.println("Enter data for Student " + i);
    	//i++;
    	System.out.println("Enter your roll_no");
    	this.roll_no=Integer.parseInt(br.readLine());
    	System.out.println("Enter your gender");
    	//gender=(char)br.read();
    	this.gender=br.readLine().charAt(0);
    	System.out.println("Enter your name");
    	this.name=br.readLine();
    	System.out.println("Enter your marks");
    	this.marks=Float.parseFloat(br.readLine());
    }


    public int getRoll_no() {
		return roll_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}


	public float getMarks() {
		return marks;
	}


	public void setMarks(float marks) {
		this.marks = marks;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	Student1(String name,float marks,char gender) {
    	this.name=name;
    	this.marks=marks;
    	this.gender=gender;
    }	

    Student1(Student1 s4)throws IOException {
    	this("Rohit",77,'m');//call the agrumented const.
    	name=s4.name;
    	marks=s4.marks;
    	gender=s4.gender;
	}
    
    void display()/*instance method */{
        int x=10;
        System.out.println(roll_no +" "+ name+" "+marks+" "+gender+" "+Student1.trainer_nm);
        }
    static void message() {
        System.out.println("Hello");
        //System.out.println(roll_no +" "+ name);-error
    }


	


	
    
}
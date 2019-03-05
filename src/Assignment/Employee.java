package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	int empid;
	String empname;
	int total_leaves;
	double total_salary;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	Employee() throws IOException{
		System.out.println("Enter employee id:: ");
		empid=Integer.parseInt(br.readLine());
		System.out.println("Enter employee name:: ");
		empname=br.readLine();
	}
	
	void calculate_balance_leaves() {
		
	}
	boolean avail_leave(int no_of_leaves,char type_of_leave) {
		return false;
	}
	void calculate_salary() {
		
	}
}


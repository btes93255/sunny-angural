package Assignment;

import java.io.IOException;

public class TemporaryEmployee extends Employee{
	double basic,hra,pf;
	TemporaryEmployee() throws IOException {
		System.out.println("Enter your salary ::");
		basic=Double.parseDouble(br.readLine());
		total_leaves=10;
	}
	void calculate_balance_leaves()//override
	{
		System.out.println("total leaves="+total_leaves);
	}
	boolean avail_leave(int no_of_leaves,String type_of_leaves)//override
	{
		if(type_of_leaves=="paid") {
			if(no_of_leaves<=total_leaves) {
				total_leaves=total_leaves-no_of_leaves;
				return true;
			}
			else
				return false;
		}
		
		else if(type_of_leaves=="sick") {
			if(no_of_leaves<=total_leaves) {
				total_leaves=total_leaves-no_of_leaves;
				return true;
			}
			else
				return false;
		}
		
		else if(type_of_leaves=="casual") {
			if(no_of_leaves<=total_leaves) {
				total_leaves=total_leaves-no_of_leaves;
				return true;
			}
			else
				return false;
		}
		else 
			return false;
	}
	void calculate_salary()//override
	{
		pf=(12/100)*basic;
		hra=(50/100)*basic;
		total_salary=basic+hra-pf;
		System.out.println("total_salary ::"+total_salary);
	}
}
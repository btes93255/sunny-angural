package Assignment;

import java.io.IOException;

public class PermanentEmployee extends Employee {
	int paid_leave,sick_leave,casual_leave;
	double basic,hra,pf;
	PermanentEmployee() throws IOException {
		System.out.println("Enter your salary ::");
		basic=Double.parseDouble(br.readLine());
		paid_leave=3;
		sick_leave=3;
		casual_leave=2;
		total_leaves=paid_leave+sick_leave+casual_leave;
	}
	
	void print_leave_details() {
		System.out.println("paid leaves="+paid_leave);
		System.out.println("sick leaves="+sick_leave);
		System.out.println("casual leaves="+casual_leave);
		System.out.println("total leaves="+total_leaves);
	}
	void calculate_balance_leaves()//override
	{
		total_leaves=paid_leave+sick_leave+casual_leave;
		System.out.println("total leaves="+total_leaves);
	}
	boolean avail_leave(int no_of_leaves,String type_of_leaves)//override
	{
		if(type_of_leaves=="paid") {
			if(no_of_leaves<=paid_leave) {
				paid_leave=paid_leave-no_of_leaves;
				return true;
			}
			else
				return false;
		}
		
		else if(type_of_leaves=="sick") {
			if(no_of_leaves<=sick_leave) {
				sick_leave=sick_leave-no_of_leaves;
				return true;
			}
			else
				return false;
		}
		else if(type_of_leaves=="casual") {
			if(no_of_leaves<=casual_leave) {
				casual_leave=casual_leave-no_of_leaves;
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

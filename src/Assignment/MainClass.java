package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PermanentEmployee p=new PermanentEmployee();
		char ch='y';
		do
		{
		System.out.println(" 1: View Leave Balance\n 2:Print Leave Details\n 3: Avail Leave\n 4: Calculate Total Salary");
		int choice=Integer.parseInt(br.readLine());
		
		switch(choice)
		{
		case 1:
			p.calculate_balance_leaves();
			break;
		case 2:
			p.print_leave_details();
			break;
		case 3:
			
			System.out.println("Enter no. of leaves you want to avail");
			int no=Integer.parseInt(br.readLine());
			System.out.println("Enter type of leave");
			char type=br.readLine().charAt(0);
			boolean x=p.avail_leave(no, type);
			if(x)
			{
				System.out.println("Leave Granted");
			}
			else
				System.out.println("Insufficient Leave Balance");{
				
			}
			
			break;
			case 4:
				p.calculate_salary();
				break;
		
		
		}
		System.out.println("Do you want to continue y/n");
		ch=br.readLine().charAt(0);
		}while(ch=='y');		
	}
}

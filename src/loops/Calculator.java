package loops;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		String c;
		int a,b,option;
		Scanner sn=new Scanner(System.in);
		System.out.print("Do u want to switch on the calculator. If yes then press any key :: ");
		c=sn.next();
		do {
			System.out.println("Operations performed ::");
			System.out.println("1. Addition.");
			System.out.println("2. Subtraction.");
			System.out.println("3. Multiplication.");
			System.out.println("4. Division.");
			System.out.print("enter the operationu want to perform ::");
			option=sn.nextInt();
			System.out.println("Operation select ::"+option);
			
			switch(option){
			case 1:
				System.out.println("Enter two nos :: ");
				a=sn.nextInt();
				b=sn.nextInt();
				System.out.println("Addition ::"+(a+b));
				System.out.println("if u want to continue press 'y' otherwise press any key ::");
				c=sn.next();
				break;
				
			case 2:
				System.out.println("Enter two nos :: ");
				a=sn.nextInt();
				b=sn.nextInt();
				System.out.println("Subtraction ::"+(a-b));
				System.out.println("if u want to continue press 'y' otherwise press any key");
				c=sn.next();
				break;
			
			case 3:
				System.out.println("Enter two nos :: ");
				a=sn.nextInt();
				b=sn.nextInt();
				System.out.println("Multiplication ::"+(a*b));
				System.out.println("if u want to continue press 'y' otherwise press any key");
				c=sn.next();
				break;
				
			case 4:
				System.out.println("Enter two nos :: ");
				float f1=sn.nextFloat();
				float f2=sn.nextFloat();
				System.out.println("Division ::"+(f1/f2));
				System.out.println("If u want to continue press 'y' otherwise press any key");
				c=sn.next();
				break;
				
			default:
				System.out.println("This is a wrong choice.");
				System.out.println("if u want to continue press 'y' otherwise press any key");
				c=sn.next();
				break;
			}
			
		}while(c!="y");
	}
}

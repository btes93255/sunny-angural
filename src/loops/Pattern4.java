package loops;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String []args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter no ::");
		int no=sn.nextInt();
		for(int i=0;i<no;i++) {
			for(int j=(no-1);j>i;j--) 	
				System.out.print(" ");
			for(int k=0;k<=i;k++)
				System.out.print("* ");
			System.out.println();
		}
	}
}

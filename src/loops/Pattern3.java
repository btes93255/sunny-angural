package loops;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String []args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter no ::");
		int n=sn.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(i%2==0) {
					if(j%2==0) 
						System.out.print("1");
					else
						System.out.print("0");
				}
				else {
					if(j%2==0) 
						System.out.print("0");
					else
						System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}

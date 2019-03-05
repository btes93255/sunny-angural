package loops;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String []args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter no ::");
		int n=sn.nextInt();
		int m=97;
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--)
				System.out.print(" ");
			for(int k=0;k<=i;k++) {
				System.out.print((char)m);
				m++;
			}
			m-=2;
			for(int l=0;l<i;l++) {
				System.out.print((char)m);
				m--;
			}
			m=97;
			System.out.println();
		}
		
	}
}

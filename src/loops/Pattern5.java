package loops;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter no ::");
		int n=sn.nextInt();
		int k=3;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j>=3) {
					System.out.print(k);
					k+=2;
				}
				else
					System.out.print(j);
			}
			k=3;
			System.out.println();
		}

	}

}

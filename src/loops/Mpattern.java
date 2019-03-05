package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mpattern {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int m=(2*n)-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(j==0 || j==m-1 || i==j || j==m-i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

package loops;

import java.io.*;

public class Npattern {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

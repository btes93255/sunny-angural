package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Frequency {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char[] no= {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println("Enter the no ::");
		String s=br.readLine();
		
		int k=0;
		for(int i=0;i<no.length;i++) {
			for(int j=0;j<s.length();j++) {
				
				
				if(s.charAt(j)==no[i]) {
					//System.out.println("hi"+i);
					k+=1;
				}
			}
			System.out.println("Frequency of "+i+" :: "+k);
			k=0;
		}
	}
}

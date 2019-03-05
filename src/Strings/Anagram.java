package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the strings ::");
		String s=br.readLine();
		String s1=br.readLine();
		int l=s.length();
		int l1=s1.length();
		int found=0;
		if(l==l1) {
			for(int i=0;i<l;i++) {
				found=0;
				for(int j=0;j<l;j++) {
					if(s.charAt(i)==s.charAt(j)) {
						found=1;
						break;
					}
				}
			}
			if(found==1)
				System.out.println("given strings are anagram");
			else
				System.out.println("given strings are anagram");
		}
	}
}

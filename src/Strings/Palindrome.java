package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string:: ");
		String s=br.readLine();
		int l=s.length();
		String s1=new String();
		
		for(int i=l-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		if(s1.equals(s)) 
			System.out.println(s+" is palindrome");
		else
			System.out.println(s+" is not palindrome");
		
		
		
	}
}

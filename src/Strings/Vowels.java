package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vowels {
		public static void main(String[] args) throws IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the string:: ");
			String s=br.readLine();
			int l=s.length();
			
			for(int i=0;i<l;i++) {
				if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
					System.out.println(s.replace(s.charAt(i), '*'));
				}
			}
		}
}

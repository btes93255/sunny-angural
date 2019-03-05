package mypack1;

import mypack.*;

public class MainClass {

	public static void main(String[] args) {
		CheckValue c=new CheckValue();
		System.out.println(c.checkint(1210));
		System.out.println(c.checkString("i love"));
		
		Palindrome p=new Palindrome();
		System.out.println(p.checkString("malayalam"));
		System.out.println(p.checkint(12121));

	}

}

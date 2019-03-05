package mypack;

public class Palindrome implements Check {
	public boolean checkString(String s) {
		int l=s.length();
		String s1=new String();
		
		for(int i=l-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		if(s1.equals(s)) 
			return true;
		else 
			return false;
	}
	
	public boolean checkint(int i) {
		int n=i;
		int temp,k=0;

		while(i!=0){
			temp=i%10;
			i=i/10;			
			k=(k*10)+temp;
		}

		if(k==n)
			return true;
		else
			return false;
	}
}

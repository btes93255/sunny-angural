package mypack;

public class CheckValue implements Check {
	public boolean checkString(String s) {
		int l=s.length();
		boolean flag=false;
		for(int j=0;j<l;j++) {
			if(s.charAt(j)==' ') {
				flag=true;
				break;
			}
				else
				flag=false;
		}
		if(flag==true) 
			return true;
		else
			return false;
	}
	
	public boolean checkint(int i) {
		boolean flag=false;
		String s=String.valueOf(i);
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)=='0') {
				flag=true;
				break;
			}
			else
				flag=false;
		}
		
		if(flag==true) 
			return true;
		else
			return false;
	}
}

package Arrays;

public class Cmdline {

	public static void main(String[] c) {
		int temp=0;
		for(int i=0;i<c.length;i++) {
			temp+=Integer.parseInt(c[i]);
		}
		System.out.println(temp);
	}

}

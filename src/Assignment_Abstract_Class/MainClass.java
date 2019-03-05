package Assignment_Abstract_Class;

import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
			Figure f[]=new Figure[6];
			
			for(int i=0;i<f.length;i++) {
				if(i<2)
					f[i]=new Circle();
				else if(i>=2 && i<4)
					f[i]=new Rectangle();
				else
					f[i]=new Triangle();
			}
	}

}

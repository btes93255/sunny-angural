package Assignment_Abstract_Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle extends Figure {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	Circle() throws IOException{
		System.out.println("Enter radius");
		dim1=Double.parseDouble(br.readLine());
	}
	void findArea() {
		area=3.14*dim1*dim1;
	}
	
	void findPerimeter() {
		perimeter=2*3.14*dim1;
	}
	
	public void tostring() {
		System.out.println("[area of circle= " + area + ", perimeter of circle= " + perimeter + "]"); 
	}
}

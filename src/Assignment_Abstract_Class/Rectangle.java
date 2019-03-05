package Assignment_Abstract_Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle extends Figure {
	double dim2;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	Rectangle() throws IOException{
		System.out.println("Enter length");
		dim1=Double.parseDouble(br.readLine());
		
		System.out.println("Enter breadth");
		dim2=Double.parseDouble(br.readLine());
	}
	void findArea() {
		area=dim1*dim2;
	}
	
	void findPerimeter() {
		perimeter=2*(dim1+dim2);
	}
	public void tostring() {
		System.out.println("[area of rectangle= " + area + ", perimeter of rectangle= " + perimeter + "]"); 
	}
	
	
}

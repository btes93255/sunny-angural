package Assignment_Abstract_Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle extends Figure {
	double dim2,dim3;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	Triangle() throws IOException{
		System.out.println("Enter sides");
		dim1=Double.parseDouble(br.readLine());
		dim2=Double.parseDouble(br.readLine());
		dim3=Double.parseDouble(br.readLine());
		
	}
	void findPerimeter() {
		perimeter=dim1+dim2+dim3;
	}
	
	void findArea() {
		area=(dim1*dim2)/2;
	}
	
	public void tostring() {
		System.out.println("[area of Triangle= " + area + ", perimeter of Triangle= " + perimeter + "]"); 
	}
}

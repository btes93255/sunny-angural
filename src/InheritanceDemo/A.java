package InheritanceDemo;

public class A  //super/parent/base
{
	int x;

	A(int x){
		this.x=x;
		System.out.println("in parent class overloaded constructor");
	}
	void sum(int x, int y){
		System.out.println(x+y);
	}
	void sum(int x, int y,int z){
		System.out.println(x+y);
	}
	void show(){
		System.out.println("hello");
	}
}
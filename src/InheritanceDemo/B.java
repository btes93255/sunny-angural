package InheritanceDemo;

class B extends A//sub/child/derived
{
    int y;
    B(){
    	//hidden super() call to parent's default constructor
    	super(10);
    	y=20;
    	System.out.println("in Child class constructor");
    }
    B(String y){
    	super(10);
    	//hidden super() call to parent's default constructor
    	System.out.println("in Child class overloaded constructor");
    }
    void show()//overriding
    {    
    	super.show();
    	System.out.println("hi"+x);
    }
    void mul(int x, int y){
    	System.out.println(x*y);
    }
}


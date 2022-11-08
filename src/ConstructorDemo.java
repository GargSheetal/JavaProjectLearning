
public class ConstructorDemo {
	
	int x;
	int y;
	
	ConstructorDemo()	//default constructor which doesn't take any parameters
	{
		x=10;
		y=20;
	}
	
	ConstructorDemo(int a, int b)
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo cd1=new ConstructorDemo();	// Invokes default constructor
		cd1.display();
		
		ConstructorDemo cd2=new ConstructorDemo(100, 200);	//invokes parameterized constructor	
		cd2.display();
	}

}

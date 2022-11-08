

// Method overloading is creating methods with the same name with different types of parameters. 
// Method is called based on number and data type of parameters.


public class MethodOverloading {

	void add(int a, int b)	//1
	{
		System.out.println(a+b);
	}
	
	void add(int a, double b)	//2
	{
		System.out.println(a+b);
	}
	
	void add(double a, double b)	//3
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c)	//4
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading mo=new MethodOverloading();
		
		mo.add(10, 20); //1
		mo.add(20.15, 44.50); //3
		mo.add(50, 10.76); //2
		mo.add(10, 20, 30); //4
		
	}

}

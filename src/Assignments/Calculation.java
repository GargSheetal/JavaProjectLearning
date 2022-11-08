package Assignments;

public class Calculation {

	int sum(int a, int b)	//1
	{
		return(a+b);
	}
	
	int sum(int a, int b, int c)	//2
	{
		return(a+b+c);
	}
	
	double sum(double a, double b)	//3
	{
		return(a+b);
	}
	
	double sum(double a, double b, double c)	//4
	{
		return(a+b+c);
	}
	
	
	
	public static void main(String[] args) {
		
		Calculation cal=new Calculation();
		var res1=cal.sum(10, 20);	//1
		var res2=cal.sum(10.20, 50.55);	//3
		var res3=cal.sum(10, 20, 30);	//2
		var res4=cal.sum(10.10, 20.20, 30.30);	//4
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}

}

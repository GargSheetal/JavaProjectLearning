package Assignments;

public class CalculationAssignment {

	int x;
	int y;
	int z;
	
	CalculationAssignment(int a, int b, int c)
	{
		x=a;
		y=b;
		z=c;
	}
	
	int sum()
	{
		return(x+y+z);
	}
	
	public static void main(String[] args) {
		
		CalculationAssignment ca=new CalculationAssignment(100, 200, 300);
		System.out.println(ca.sum());
		
		
	}

}

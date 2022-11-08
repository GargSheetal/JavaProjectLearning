
public class Calculation {

	int x=10;
	int y=20;
	
	/*void sum() // Case1- method is not taking any parameters and not returning any values
	{
		System.out.println(x+y);
	}*/
	
	/*int sum() // Case2- method is not taking any parameters but is returning values
	{
		return(x+y);
	}*/
	
	/*void sum(int a, int b) // Case3- method is taking parameters but not returning any values
	{
		System.out.println(a+b);
	}*/
	
	int sum(int a, int b) // Case4- method is taking parameters and returning values
	{
		return(a+b);
	}
	
	public static void main(String[] args) {
		
		Calculation cal=new Calculation();
		//cal.sum(); //Case1
		
	/*	int res=cal.sum(); //Case2
		System.out.println(res);
		System.out.println(cal.sum()); */
		
	//	cal.sum(100, 200); // Case3
		
		System.out.println(cal.sum(100, 200)); //Case4
		
	}

}


//Finally block always executes:
// 1) Exception does'nt occur.
// 2) Exception occur but is not handled.
// 3) Exception occurs and handled.


package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Program has started");
		
		int a=100;
		
		try
		{
			System.out.println(a/0);
		}
		catch(Exception e)
		{
			System.out.println("ENTERED INTO CATCH BLOCK");
		}
		finally
		{
			System.out.println("ENTERD INTO FINALLY BLOCK");
		}	
		
		System.out.println("Program has exited");

	}

}

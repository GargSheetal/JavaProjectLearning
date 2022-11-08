
// Exception Handling:
// In Java exception is an event that disrupts the normal flow of the program.
// Types of Exceptions
// 1) Checked: Exceptions identified by the compiler. They are intimated at the design time itself.
//		Examples: Interrupted Exception, IOException, FileNotFoundException etc.
// 2) Unchecked: Not identified by the compiler. They throw error at the run time.
//		Examples: Arithmetic Exception, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException



package exceptionHandling;

public class ExceptionExamples {

	public static void main(String[] args) {
		
		System.out.println("Program has started");
		System.out.println("Program is in progress");
		
	/*	int a=100;
		try
		{
			System.out.println(a/0);	// Arithmetic exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("Entered into catch block");
		}	*/
		
		// One try block can have multiple catch blocks
		
		String s=null;
		try
		{
			System.out.println(s.length());		//NullPointerException
		}
		catch(Exception e)
		{
			System.out.println("Entered into catch block");
		}
		
		String x="abc";
		//int i=Integer.parseInt(x);	//NumberFormatException
		
		int b[]=new int[5];
		//b[10]=50;	//ArrayIndexOutOfBoundException
		
		System.out.println("Program is finished");
		System.out.println("Program has exited");
		
	}

}


// Checked Exceptions can be handled in two ways:
// try catch 
// throws keyword--> throws keyword is added at the method level


package exceptionHandling;

public class CheckedExceptionExamples {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Program has started");
		System.out.println("Program is in progress");
		
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}*/
		
		Thread.sleep(5000);
		
		System.out.println("Program has completed");
		System.out.println("Program has exited");
		
		

	}

}

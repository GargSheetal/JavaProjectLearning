package InheritancePackage;

final class Bike // final class cannot be extended to other classes as parent class
{
	final void run()	// final method and cannot be changed in child class
	{
		System.out.println("Running.......");
	}
	
}

/*class Honda extends Bike //compile time error
{
	void run()	//compile time error
	{
		System.out.println("Started.......");
	}
	
}*/

public class FinalMethodDemo {

	
	public static void main(String[] args) {	
		
	}

}

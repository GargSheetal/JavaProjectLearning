package InheritancePackage;

public class Animal {

	String color="White";
	
	void eating()
	{
		System.out.println("Eating...........");
	}
	
	Animal()
	{
		System.out.println("Animal constructor is created");
	}
	
}

class Dog extends Animal
{
	String color="Black";
	
	/*void displaycolor()
	{
	System.out.println(color);
	System.out.println(super.color); // super keyword is used to invoke immediate parent class instance variable
	}	*/
	
	/*void eating()
	{
		System.out.println("Eating Bread...........");
		super.eating(); 	// super keyword is used here to invoke immediate parent class method.
	}	*/
	
	Dog()
	{
		super();	// used to invoke parent class constructor. 
					// Although the parent class constructor is invoked automatically at the time of object creation of child class.
		System.out.println("Dog constructor is created");
	}
	
}
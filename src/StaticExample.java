
//Static methods can access static stuff directly without creating any object
// Static method can also access non static stuff through object creation
// Non static methods can access both static and non-static stuff directly.

//	System.out.println();
// ----------------------
// Example: 
//	class Test
//  {
//		Static String s="Welcome";
//	 }

//  Test.s.length();   7

//  class System
//	{
//		static Printstream out;
//	}
//		System.out.println();



public class StaticExample {

	static int a=10; 	// static variable
	int b=20; 	// non-static variable
	
	static void m1()	//static method
	{
		System.out.println("This is m1 - static method");
	}
	
	void m2() 	//Non static method
	{
		System.out.println("This is m2 - non-static method");
	}
	
	void m3()
	{
		System.out.println("This is m3--Non static method");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);
		m1();
		
		System.out.println(StaticExample.a); // another method to call object or method even when the main method is in some other class
		StaticExample.m1();
			
		//System.out.println(b);	incorrect because b is non static variable
		// m2(); 	// incorrect as m2 is non-static method;
		
		StaticExample se=new StaticExample();
		System.out.println(se.b);	//non static variable through object creation
		se.m2();	// non static method
		
		se.m3();	
		
	}

}

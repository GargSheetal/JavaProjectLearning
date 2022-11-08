
//Interface:
//-----------
// An interface is java is a blueprint of a class
// It contains final and static variables.
// It contains abstract methods. These methods contains only the definition and not the body of the method.
// Methods in interface are public by default.
// Interface supports the functionality of multiple inheritance.
// We can define interface with interface keyword.
// A class extends another class, an interface extends another interface but a class implements an interface.
// we can create object reference for interface but we cannot instantiate interface.



package Interface;

interface A
{
	int a=10; // by default the variables in interfaces are static and final
	
	void m1(); // abstract method, it is public by default
}


public class Test implements A
	{
		public void m1()
		{
			System.out.println(a);
		}
	
	public static void main(String[] args) {
	
		/*Test t=new Test();
		t.m1();
		*/
		
		A a=new Test();
		a.m1();
		
	}

}

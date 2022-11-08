
//Inheritance --> acquiring the properties of one class by another class.
// 5 types of inheritance: Single, Multilevel, Hierarchical, Multiple, Hybrid  
// Single: A---> B (B acquiring the properties and behavior of B by using extend keyword)
// Multilevel: A-->B-->C 
//Hierarchical: A-->B   A-->C    A-->D (all the child classes have a single parent class)


package InheritancePackage;

class A	// This is parent class/ Super class/ Base class
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A	// This is child class/ Sub class/ Derived class
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}

class C extends B
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}

public class InheritanceExamples {
	
	public static void main(String[] args) {
		
		/*A aobj=new A();
		aobj.a=100;
		aobj.display();
		
		B bobj=new B();
		bobj.a=10;	//A
		bobj.b=20;	//B
		
		bobj.display();	//A
		bobj.print();	//B	*/
		
		C cobj=new C();
		cobj.a=10;
		cobj.b=20;
		cobj.c=30;
		
		cobj.display();
		cobj.print();
		cobj.show();
		
		
	}

}


// Access Modifiers: Define the scope of variables and methods. 4 types:
// 1) private: it can be accessed only within the class
// 2) default: if we don't specify any modifier, it is treated as default. Default modifier is accessible only within the package.
// 3) protected: it is accessible within the package and outside the package but through inheritance only.
// 4) public: can be accessed anywhere within the class, package, outside the package.

package AccessModifiers;

 class A
{
	//private int data=10;
	//private void m1() {}
	
	/*int data=10; // default variable, accessible only within the package
	void m1()	// default method, accessible only within the package	
	{
		System.out.println(data);
	}*/
	
	protected int data=10; 
	protected void m1()	
	{
		System.out.println(data);
	}
	
}

public class Simple {


	public static void main(String[] args) {
		
		A aobj=new A();
		aobj.data=20;	// compile time error
		aobj.m1();	// compile time error
	}

}

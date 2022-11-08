
public class OperatorTypes {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		//Arithmetic operators---> + - * / %
		
		int c=a+b;
		
		System.out.println("--------------------Arithmetic Operators-------------------");
		System.out.println("Sum of a and b is:" + c);
		System.out.println("Sum of a and b is:" + (a+b));
		System.out.println("Diff of a and b is:" + (b-a));
		System.out.println("Mul of a and b is:" + (a*b));
		System.out.println("Div of a and b is:" + (a/b));
		System.out.println("Mod Div of a and b is:" + (a%b));
		
		//Relational(comparison) operators-----> == < > <= >= !=
		//Always return boolean value
		
		System.out.println("--------------------Relational Operators-------------------");
		System.out.println(a==b); //false
		System.out.println(a>b);	//false
		System.out.println(a<b);	//true
		System.out.println(a>=b);	//false
		System.out.println(a<=b);	//true (one of the condition is true)
		System.out.println(a!=b);	//true
		
		//Logical operators----> && || !
		//works bet 2 boolean values
		//& ---> both values should be true for the result to be true, else it will be false
		//|| ---> if one of the value is true, the result will be true, else it will be false
		//! ---> 
		
		boolean x=true;
		boolean y=false;
		
		System.out.println("--------------------Logical Operators-------------------");
		System.out.println(x&&y); //false
		System.out.println(x||y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true
		
		//Increment/Decrement Operators ++ --
		
		a=10;
		a++;    //a=a+1;
		
		System.out.println("--------------------Increment/Decrement Operators-------------------");
		System.out.println(a);
		
		b=20;
		b--; //b=b-1;
		System.out.println(b);

		
		//Swapping values of two variables
		
		int m=10;
		int n=20;
		
		System.out.println(m);
		System.out.println(n);
		
		int o;
		o=m;
		m=n;
		n=o;
		System.out.println("-------------Swapping Value------------");
		System.out.println(m);
		System.out.println(n);
		
		
		

		
	}

}

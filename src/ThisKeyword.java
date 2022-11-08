
public class ThisKeyword {

	int a, b;	//instance or class variables
	
	void setValues(int a, int b)	// method or external variables
	{
		this.a=a;
		this.b=b;
	}
	
	void printvalues()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		
		ThisKeyword th=new ThisKeyword();
		th.setValues(10, 20);
		th.printvalues();
	}

}

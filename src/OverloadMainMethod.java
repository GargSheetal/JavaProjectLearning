
public class OverloadMainMethod {

	public void main(int x)
	{
		System.out.println(x);
	}
	
	public void main(int x, int y)
	{
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		
		OverloadMainMethod mo=new OverloadMainMethod();
		
		mo.main(100);
		mo.main(100, 200);
	}
		
}

package InheritancePackage;

public class FinalVariableDemo {

	final int speed=40; // final variable, its value cannot be changed
	
	
	public static void main(String[] args) {
		
		FinalVariableDemo fm=new FinalVariableDemo();
		// fm.speed=100; // compile time error
		System.out.println(fm.speed);
		
		
	}

}

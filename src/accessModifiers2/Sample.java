
package accessModifiers2;
import accessModifiers3.ABC;

/*
public class Sample extends ABC{

	public static void main(String[] args) {
		
		Sample s=new Sample();
		s.data=100;
		s.m1();

	}

}
*/

public class Sample{

	public static void main(String[] args) {
		
	/*	Sample s=new Sample();
		s.data=100;
		s.m1();*/
		
		ABC s=new ABC();
		s.data=100;
		s.m1();

	}

}

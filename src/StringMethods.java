
public class StringMethods {

	public static void main(String[] args) {
		
		String s="Welcome";
		String s1=" to java";
		
		System.out.println(s.length()); //length of string
		
		System.out.println(s.concat(s1)); //joining of strings
		
		
		s="    Welcome     ";
		System.out.println(s);
		System.out.println("After trimming the string is: " + s.trim()); //trim spaces in the string
		
		
		//charAt()
		s="Welcome";
		
		System.out.println(s.charAt(3));  //returns character based on index value
		
		//contains() ---> returns true/false 
		s="Welcome";
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("com"));
		
		//equals()
		
		s="Welcome";
		//s1="Welcome";
		System.out.println(s.equals(s1));
		System.out.println(s.equals("Wel come"));
		System.out.println(s.equals("welcome"));
		
		//equalsIgnoreCase()
		
		System.out.println(s.equalsIgnoreCase("welcome"));
		
		//replace()
		s="Welcome to Java";
		System.out.println(s.replace('o', 'i'));
		System.out.println(s.replace("Java", "Selenium"));
		
		//substring() ----> extracts substring from the main string
		s="Welcome";
		System.out.println(s.substring(0,4));
		
		//toLowerCase()
		s="WElCOME";
		System.out.println(s.toLowerCase());
		
		//toUpperCase()
		s="welcome";
		System.out.println(s.toUpperCase());
		
		
	}

}

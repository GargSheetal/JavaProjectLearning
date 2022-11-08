
// Derived Data types (Collections)
// ArrayList: 
// HashMap: values are stored in (key, value) pair. Key can not be duplicated.

package derivedDataTypes;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// How to declare ArrayList:
		
		ArrayList list = new ArrayList(); //we can store any data type element in it
		
		//ArrayList <Integer> list=new ArrayList <Integer>();	// it will store only Integer values
		
		//ArrayList <String> list=new ArrayList <String>();	// it will store only string values
		
		// Adding values to ArrayList:
		list.add("John");	//0
		list.add("David");	//1
		list.add("Scott");	//2
		list.add("Smith");	//3
		list.add(100);
		list.add('A');
		
		// Size of ArrayList:
		System.out.println(list.size());	// 4
		System.out.println("Before removing elements:"+ list);
		
		
		// Removing elements from ArrayList:
		
		list.remove(2);	//removes Scott
		System.out.println(list.size());
		System.out.println("After removing elements:"+ list);
		
		//inserting new elements/values in ArrayList at a specific location
		list.add(1, "Sam");
		System.out.println(list.size());	//4
		System.out.println("After inserting an element:"+ list);
		
		//Reading individual values in ArrayList using for loop(Advanced for loop)
		//Object type variable can store any data type value/element
		
		for(Object s:list)
		{
			System.out.println(s);
		}
		
	}

}

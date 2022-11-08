
// Cannot insert any values in the middle of HashMap as it do not have index concept

//JDBC: Java Database Connectivity

package derivedDataTypes;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaring HashMap:
		
		//HashMap hm=new HashMap();
		
		HashMap <Integer, String> hm=new HashMap<Integer, String>();	//Key is Integer, Value is String
		
		//Adding Pairs in HashMap:
		
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "David");
		hm.put(104, "Smith");
		hm.put(105, "Kim");
		
		System.out.println(hm);
		
		//Removing pair for HashMap:
		
		hm.remove(103);
		System.out.println("After removing a pair:"+ hm);
		
		// Reading pairs using for loop
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey() + "  " + m.getValue());
		}
			
		
		
	}

}


public class SingleDimentionalArray {

	public static void main(String[] args) {
		
		/*int a[] = new int[5]; //declaring array with fixed size of 5
		
		//inserting values in array
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		int a[]= {100, 200, 300, 400, 500}; // declaring array without specifying size
		
		System.out.println("length of the array is: " + a.length); 	//print length/size of an array
		
		System.out.println(a[2]);	//printing specific value
		
		//printing the values of array
		
	/*	for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}*/
		
		
		//Reading values using advanced/Enhanced for loop
		
		for(int i:a)
		{
			System.out.println(i);	//100 200 300 400 500		
		}
		
	}

}

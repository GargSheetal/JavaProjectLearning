
public class MultiDimentionalArray {

	public static void main(String[] args) {
		
		int a[][] = new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
			
	//	int a[][]= { {100,200}, {300,400}, {500,600} };
		
		System.out.println("Number of rows: " + a.length);
		
		System.out.println("Number of columns: " + a[0].length);
	
		
	/*	for(int i=0; i<a.length; i++)	//outer for loop for rows		0 1 2
		{
			for(int j=0; j<a[i].length; j++)//inner for loop for columns	0 1 (first inner for loop complete by incrementing values each time and
														// when it becomes false then the loop is exited and value of outer for loop is incremented)
			{
				System.out.println(a[i][j]);		//100 200 300 400 500 600
			}
			
		}	
		*/
		
		//Enhanced for loop
		
		for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.println(i);
			}
		}
		
		
	}

}


public class EmployeeMain {

	public static void main(String[] args) 
	{
		Employee emp1=new Employee();	//creating object of Employee class
		emp1.eId=101;
		emp1.eName="David";
		emp1.sal=25000;
		emp1.deptNo=10;
		emp1.job="Manager";
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eId=102;
		emp2.eName="John";
		emp2.sal=50000;
		emp2.deptNo=20;
		emp2.job="CEO";
		emp2.display();
		
	}

}

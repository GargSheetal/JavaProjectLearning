package Assignments;

public class StudentAssignment {
	
	int sId;
	String sName;
	double sub1;
	double sub2;
	double sub3;
	
	void getStuData(int id, String name)
	{
		sId=id;
		sName=name;
	}
	
	void getStuMarks(double m1, double m2, double m3)
	{
		sub1=m1;
		sub2=m2;
		sub3=m3;	
	}
	
	void totalMarks()
	{
		//return(sub1+sub2+sub3);
		System.out.println(sId+"  "+ sName +"  "+ (sub1+sub2+sub3));
	}
	
	void display()
	{
		System.out.println(sId +"  "+sName);
	}
	
	
	public static void main(String[] args) {
		
		StudentAssignment stu1=new StudentAssignment();
		stu1.getStuData(111, "David");
		stu1.display();
		
		stu1.getStuMarks(50.56, 75.89, 90.00);
		//System.out.println("Total marks are: "+stu1.totalMarks());
		stu1.totalMarks();
		
	}

}

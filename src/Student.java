
public class Student {

	int sId;
	String sName;
	char grade;
	
	//Constructor
	Student(int id, String name, char g)
	{
		sId=id;
		sName=name;
		grade=g;
	}
	
	//Method
	void getValues(int id, String name, char g)
	{
		sId=id;
		sName=name;
		grade=g;
	}
	
	void display() {
		System.out.println(sId + "  " + sName + "  " + grade);
	}
	
	
}


public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1=new Student(1010, "John", 'A'); // 3 Assigning values by using constructor
		
		// 1 Assigning values using reference variables
	/*	stu1.sId=1010;
		stu1.sName="John";
		stu1.grade='A'; */
		
		// 2 Assigning values by using method
		//stu1.getValues(1010, "john", 'A');
		
		stu1.display();
		
	}

}

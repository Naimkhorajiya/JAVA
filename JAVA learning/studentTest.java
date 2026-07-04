//1. Example – Student Class

class student
{
	int rollno;
	String name;
	int age;

	void showDetails()
	{
		System.out.println("Roll no.: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age); 
	}	
}

public class studentTest
{
	public static void main(String[]args)
	{
		student s = new student();
		s.rollno = 11;
		s.name = "Dhruvi";
		s.age = 19;

		s.showDetails();
	}
}
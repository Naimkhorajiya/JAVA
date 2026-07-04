//default constructor

class student
{
	int rollno;
	String name;

	student()
	{
		rollno = 04;
		name = "Dhuli";	
	}
	
	void display()
	{
		System.out.println("Rollno: "+rollno);
		System.out.println("Name: "+name);
	}
}

class main
{
	public static void main(String[]args)
	{
		student s = new student();
		s.display();
	}
}
//Parameterized Constructor

class student
{
	int rollno;
	String name;

	student(int r, String n)
	{
		rollno = r;
		name = n;
	}
	
	void display()
	{
		System.out.println("Rollno: "+rollno);
		System.out.println("Name: "+name);
	}
}

class ParameterizedConstructor
{
	public static void main(String[]args)
	{
		student s = new student(11, "Dhuli");
		s.display();
	}
}

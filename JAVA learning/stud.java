//default construvctor using this keyword

class student
{
	int rollno;
	String name;

	student(int r, String n)
	{
		this.name = name;
		this.roll = roll;
	}

	student()
	{
		this("Dhuli", 11);
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
	}
}

class this1
{
	public static void main(string[]args)
	{
		student s = new student();
		s.display();
	}
}
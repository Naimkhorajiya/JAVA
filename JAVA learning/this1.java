//default constructor using this keyword

class student
{
	String name;
	int rollno;
	
	student(String n, int r)	
	{
		this.name = n;
		this.rollno = r;
	}
	student()
	{
		this("Dhuli",11);
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
	}
}
class this1
{
	public static void main(String[]args)
	{
		student s = new student();
		s.display();
	}
}
//Parameterized constructor using this keyword


class student
{
	String name;
	int rollno;
	
	student(String name,int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
	}	
}
class this2
{
	public static void main(String[]args)
	{
		student s = new student("Dhuli",11);
		s.display();
	}
}
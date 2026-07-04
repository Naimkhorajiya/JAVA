//default constructor

class student
{
	int rollno;
	String name;

	student()
	{
		rollno = 04; //rollno ને initialize કર્યુ
		name = "Dhuli";	//name ને initialize કર્યુ
	}
	
	void display()
	{
		System.out.println("Rollno: "+rollno);
		System.out.println("Name: "+name);
	}
}

class DefaultConstructor //main class 
{
	public static void main(String[]args)
	{
		student s = new student(); //object create કર્યે|
		s.display();//display (method call)
	}
}

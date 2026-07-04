class Student 
{
    int id;
    String name;

    Student(int i, String n) 
	{
        id = i;
        name = n;
    }

    void display() 
	{
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}

class Q9
{
    public static void main(String r[] ) {
        Student s = new Student(5, "Raj");
        s.display();
    }
}

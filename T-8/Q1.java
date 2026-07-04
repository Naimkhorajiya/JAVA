class Student 
{
    int id;
    String name;

    Student() 
	{
        id = 5;
        name = "Raj Patel";
    }

    void display() 
	{
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}

class Q1
{
    public static void main(String r[]) {
        Student s = new Student();
        s.display();
    }
}

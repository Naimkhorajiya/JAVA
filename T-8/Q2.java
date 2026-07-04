import java.util.Scanner;

class Employee {
    int id;
    String name;

    Employee() 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
    }

    void display() 
	{
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class Q2 
{
    public static void main(String[] args) 
	{
        Employee e = new Employee();
        e.display();
    }
}

import java.util.Scanner;

class EmployeeSalary 
{
    String employeeName;
    double salary;

    EmployeeSalary() 
	{
        employeeName = "Raj";
        salary = 30000;
    }

    void updateSalary() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter updated salary: ");
        salary = sc.nextDouble();
    }

    void display() 
	{
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

class Q8
{

    public static void main(String[] args) {
        EmployeeSalary e = new EmployeeSalary();
        e.updateSalary();
        e.display();
    }
}

import java.io.*;
import java.util.Scanner;

class Employee {
    int id;          
    String name;     

  
    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
    }


    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}


public class EmployeeDemo {
    public static void main(String[] args) {

        Employee emp = new Employee();

       
        emp.inputDetails();

      
        emp.display();
    }
}
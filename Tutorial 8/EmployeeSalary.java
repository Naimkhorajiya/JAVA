class EmployeeSalary {
    String employeeName;
    double salary;

    EmployeeSalary() {
        employeeName = "Alice";
        salary = 50000;
    }

    void updateSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter updated salary for " + employeeName + ": ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("Employee Name: " + employeeName + ", Salary: $" + salary);
    }
}
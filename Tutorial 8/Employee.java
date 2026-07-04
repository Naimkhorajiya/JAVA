class Employee {
    int id;
    String name;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
    }

    void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
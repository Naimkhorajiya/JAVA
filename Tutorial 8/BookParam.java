class BookParam {
    String title;
    String author;
    double price;

    BookParam(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Book Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

// Main class to test all
public class MainClasses {
    public static void main(String[] args) {
        System.out.println("1. Student with default constructor:");
        Student student1 = new Student();
        student1.display();

        System.out.println("\n2. Employee with user input:");
        Employee emp = new Employee();
        emp.input();
        emp.display();

        System.out.println("\n3. Rectangle with default constructor:");
        Rectangle rect = new Rectangle();
        rect.displayArea();

        System.out.println("\n4. Circle with radius input and area calculation:");
        Circle circle = new Circle();
        circle.display();

        System.out.println("\n5. Laptop with user input:");
        Laptop laptop = new Laptop();
        laptop.input();
        laptop.display();

        System.out.println("\n6. Book with user input:");
        Book book = new Book();
        book.input();
        book.display();

        System.out.println("\n7. Car with default constructor:");
        Car car = new Car();
        car.display();

        System.out.println("\n8. EmployeeSalary with updated salary input:");
        EmployeeSalary es = new EmployeeSalary();
        es.updateSalary();
        es.display();

        System.out.println("\n9. Student with parameterized constructor:");
        StudentParam student2 = new StudentParam(202, "Emily");
        student2.display();

        System.out.println("\n10. Rectangle with parameterized constructor:");
        RectangleParam rect2 = new RectangleParam(7, 4);
        rect2.displayArea();

        System.out.println("\n11. Book with parameterized constructor:");
        BookParam book2 = new BookParam("Java Programming", "Jane Smith", 29.99);
        book2.display();
    }
}
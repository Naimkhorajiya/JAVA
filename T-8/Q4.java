import java.util.Scanner;

class Circle 
{
    double radius;

    Circle(double r) 
	{
        radius = r;
    }

    void displayArea() 
	{
        double area = 3.14f * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

class Q4
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        
        Circle c = new Circle(r);
        c.displayArea();
        
    }
}

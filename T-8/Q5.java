import java.util.Scanner;

class Laptop 
{
    String model;
    double price;

    Laptop() 
	{
        model = "";
        price = 0.0;
    }

    void inputDetails() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Laptop Model: ");
        model = sc.nextLine();
        System.out.print("Enter Laptop Price: ");
        price = sc.nextDouble();
    }

    void display() 
	{
        System.out.println("Laptop Model: " + model);
        System.out.println("Laptop Price: " + price);
    }
}

class Q5
{

    public static void main(String a[] ) 
	{
        Laptop l = new Laptop();
        l.inputDetails();
        l.display();
    }
}

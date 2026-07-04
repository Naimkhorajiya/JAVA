class Car 
{
    String brand;
    int year;

    Car() 
	{
        brand = "Toyota";
        year = 2022;
    }

    void display() 
	{
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Year: " + year);
    }
}

class Q7
{
    public static void main(String r[] ) 
	{
        Car c = new Car();
        c.display();
    }
}

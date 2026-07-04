class Rectangle 
{
    int length, breadth;

    Rectangle() 
	{
        length = 10;
        breadth = 5;
    }

    void displayArea() 
	{
        int area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
}

class Q3
{

    public static void main(String a[]) {
        Rectangle r = new Rectangle();
        r.displayArea();
    }
}

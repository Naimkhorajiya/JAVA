class Rectangle 
{
    int length, breadth;

    Rectangle(int l, int b) 
	{
        length = l;
        breadth = b;
    }

    void displayArea() 
	{
        int area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
}

class Q10
{

    public static void main(String a[]) 
	{
        Rectangle r = new Rectangle(12, 8);
        r.displayArea();
    }
}

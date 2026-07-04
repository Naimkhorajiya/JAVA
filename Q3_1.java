import java.io.*;
import java.util.Scanner;
class Rectangle
{
	Scanner sc= new Scanner(System.in);
	int l;
	int b;
	Rectangle()
	{
		System.out.println("Area");
	}
	void input()
	{
		System.out.println("Enter Length:");
		l=sc.nextInt();
		System.out.println("Enter Breath:");
		b=sc.nextInt();
	}
	void display()
	{
		System.out.println("Area:" +(l*b));

	}

}
class Q3_1
{
	public static void main(String k[])
	{
		Rectangle r1= new Rectangle();
		r1.input();
		r1.display();
	}
}
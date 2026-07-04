//EXAMPLE OF CLASS AND OBJECT
import java.io.*;
class fruit
{
	void show()
	{
	System.out.println("Kiwi"+"\nOrange"+"\nGraphes"+"\nPineple"+"\nmango");
	}
}
class shop
{
	public static void main(String a[])
	{
	fruit f = new fruit();
	f.show();
	}
}
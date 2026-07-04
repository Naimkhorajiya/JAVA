
import java.io.*;
import java.util.Scanner;
class stud
{
	Scanner sc= new Scanner(System.in);
	String nm;
	int r;
	void input()
	{
		System.out.println("Enter Name:");
		nm= sc.nextLine();
		System.out.println("Enter Rollno:");
		r= sc.nextInt();
	}
void display()
	{
	System.out.println("Rollno:"+r);
	System.out.println("Name:"+nm);
	}
}
class master
{
	public static void main(String a[])
	{
	stud s1=new stud();
	stud s2=new stud();
	s1.input();
	s1.input();	
	s2.display();
	s2.display();
	}
}




		
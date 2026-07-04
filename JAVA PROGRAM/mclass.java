//example of
//static keyword
//static datamember
//static member function

import java.io.*;
class temp
{
	int a=10;
	static int b=10;

	void show()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	static void show1()
	{
		//System.out.println(a);
		//System.out.println(b++);
	}
}

class mclass
{
	public static void main(string j[])
	{
		temp.show1();
		temp t =new temp();
		t.show();
		t.show1();
	}
}
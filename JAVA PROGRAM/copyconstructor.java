//copy constructor

import java.io.*;
class temp
{
	int i;
	temp()//default
	{
	}
	temp(int i)// parameter
	{
		this.i=i;
	}	
	temp(temp t2)
	{
		i=t2.i;
	}
	void show()
	{
		System.out.pritln(i);
	}
class mclass
	public static void main(String k[])
	{
		temp t = new temp();
		temp t1 = new temp(10);
		temp t3 = new temp(t1);
	}
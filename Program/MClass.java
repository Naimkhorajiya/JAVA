//parameterized
import java.io.*;
class temp{
	int r;
	String nm;
	float f;
	temp(float f,int r,String nm){
	this.r = r;
	this.nm = nm;
	this.f = f;
	}
	void display(){
	System.out.println(r);
	System.out.println(nm);
	System.out.println(f);
		}
}
class MClass{
	public static void main(String l[]){
	temp t = new temp(23.87f,10,"Naim");
	t.display();
	}
}
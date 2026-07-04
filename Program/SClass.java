//parameterized Name saving id acc,rupes
import java.io.*;
class temp{
	String nm;
	int id;
	String Current;
	int Acc;
	float R;

	temp(String nm,int id,String Current,int Acc,float R){
	
	this.nm = nm;
	this.id =id;
	this.Acc =Acc;
	this.R =R;
	}
	void display(){
	
	System.out.println(nm);
	System.out.println(id);
	System.out.println(Acc);
	System.out.println(R);
		}
}
class SClass{
	public static void main(String l[]){
	temp t = new temp("Naim",123123,"Current",1000.78);
	t.display();
	}
}
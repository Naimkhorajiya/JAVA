//hierarchical inheritance

import java.io.*;
class Flower{
	int a = 10;
	int b = 20;
}
class lilly extends Flower{
	void show(){
		System.out.println(a*a);
	}
}
class lotus extends Flower {
	void display(){
		System.out.println(b*b*b);
	}
}
class temp{
	public static void main(String args){
	lilly l = new lilly();
	l.show();
	lotus l1 = new lotus();
	l1.display();
	}
}
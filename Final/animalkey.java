//final keyword --cannot change value
import java.io.*;
class animalkey{
	final int a = 10;
	void show(){
	System.out.println(a);
	}
}
class cat extends animal{
	void show(){
	a=11;
	System.out.println(a);
	}
}
class temp1{
	public static void main(String k[]){
	cat c = new cat();
	c.show();
	}
}
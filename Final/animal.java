//final method
import java.io.*;
class animal{
	final void show(){
	System.out.println("cat");
}
}
class cat extends animal{
	void show(){
	System.out.println("cat");
	}
}

class temp{
	public static void main(String n[]){
		cat c = new cat();
		c.show();
	}
}
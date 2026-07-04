import java.io.*;
abstract class A{
	abstract void show();
}
class B extends A{
	void show(){
	System.out.println("BCA");
}
}
class temp{
	public static void main(String k[]){
	A a1=new B();
	a1.show();
}
}
//multi level with over loading
import java.io.*;
class A{
	void dis1(){
	System.out.println("A");
}
}
class B extends A{
	void dis2(){
	System.out.println("B");
}
}
class C extends B{
	void dis3(){
	System.out.println("C");
}
}
class temp1{
	public static void main(String j[]){
	C c1 = new C();
	c1.dis1();
	c1.dis2();	
	c1.dis3();
}
}

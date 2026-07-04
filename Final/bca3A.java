//final class - does not allow inheritance
import java.io.*;
final class bca3A{

	int a =10;
}
class bca extends bca3A{
	void show(){
	System.out.println(a);
}
}
class temp{
	public static void main(String k[]){
	bca a = new bca();
	a.show();
}
}
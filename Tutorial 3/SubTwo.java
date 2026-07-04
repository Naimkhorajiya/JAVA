import java.io.*;
import java.util.Scanner; 
	class SubTwo{
	public static void main(String [] args){
	int a,b,sub;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number of A:");
	a = sc.nextInt();
	System.out.println("Enter Number of B:");
	b = sc.nextInt();
	sub = a-b;
	System.out.println("The substraction of " +a+"And"+b+"is:"+sub);

}
}
import java .io.*;
import java.util.Scanner; 
class AddTwoNum {
    public static void main(String[] args) {
     int a,b,sum;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number of A:");
	a = sc.nextInt(); 
	System.out.println("Enter a Number of B:");
	b = sc.nextInt();
	sum = a+b;
System.out.println("The sum of :" + a + " and " + b + " is: " +sum);
      // inputScanner.close();
    }
}
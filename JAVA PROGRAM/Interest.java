import java.io.*;
import java.util.Scanner;

class Interest
{
	public static void main(String h[])
	{
		Scanner scanner = new Scanner(System.in);

       		System.out.print("Enter a number: ");
        	int p = scanner.nextInt();

       		System.out.print("Enter a number: ");
        	int n = scanner.nextInt();

       		System.out.print("Enter a number rates: ");
        	float r = scanner.nextFloat();


		float ans;
		ans=(p*r*n)/100;
		System.out.println("SI:"+ans);
	} 
}
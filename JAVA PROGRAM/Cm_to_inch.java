import java.io.*;
import java.util.Scanner;

class Cm_to_inch
{
	public static void main(String h[])
	{
		Scanner scanner = new Scanner(System.in);

       		System.out.print("Enter a number of Centimetre: ");
        	float cm = scanner.nextFloat();

		float ans;
		ans=cm/2.54f;
		System.out.println("centimetre:"+ans);
	} 
}
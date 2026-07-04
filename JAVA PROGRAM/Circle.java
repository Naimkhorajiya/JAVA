import java.io.*;
import java.util.Scanner;

class Circle 
 {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int r = scanner.nextInt();


        double area = 3.14 * r * r;

        System.out.println("Area of the circle : " + area);
    }
}
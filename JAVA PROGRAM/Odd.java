
import java.util.Scanner;

public class Odd{

    
    public static boolean isOdd(int number) {
        
        if (number % 2 != 0) {
            return true; // Yes, it's odd
        } else {
            return false; // Nope, it's even
        }
    }

   
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Please enter a number: ");
        int userNumber = scanner.nextInt();

       
        if (isOdd(userNumber)) {
            System.out.println(userNumber + " is odd.");
        } else {
            System.out.println(userNumber + " is not odd.");
        }

       
        scanner.close();
    }
}

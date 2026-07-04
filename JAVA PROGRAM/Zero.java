import java.util.Scanner;

public class Zero {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Please enter a number: ");
        double number = scanner.nextDouble();

      
        if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is not zero.");
        }

       
        scanner.close();
    }
}

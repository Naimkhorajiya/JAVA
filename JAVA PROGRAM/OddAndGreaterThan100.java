import java.util.Scanner;

public class OddAndGreaterThan100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is odd and greater than 100
        if (number % 2 != 0 && number > 100) {
            System.out.println("The number is odd and greater than 100.");
        } else {
            System.out.println("The number is NOT both odd and greater than 100.");
        }

        scanner.close();
    }
}

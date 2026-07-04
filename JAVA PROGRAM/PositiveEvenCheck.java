import java.util.Scanner;

public class PositiveEvenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

     
        if (number > 0 && number % 2 == 0) {
            System.out.println("The number is positive and even.");
        } else {
            System.out.println("The number is NOT both positive and even.");
        }

        scanner.close();
    }
}

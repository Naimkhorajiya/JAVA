import java.util.Scanner;

public class ThreeDigitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

       
        if ((number >= 100 && number <= 999) || (number <= -100 && number >= -999)) {
            System.out.println("The number is a 3-digit number.");
        } else {
            System.out.println("The number is NOT a 3-digit number.");
        }

        scanner.close();
    }
}

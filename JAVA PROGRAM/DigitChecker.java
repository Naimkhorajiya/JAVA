import java.util.Scanner;

public class DigitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

       
        if (Character.isDigit(ch)) {
            System.out.println("It is a digit.");
        } else {
            System.out.println("It is NOT a digit.");
        }
    }
}

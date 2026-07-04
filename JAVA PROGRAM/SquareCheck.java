import java.util.Scanner;

public class SquareCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();

        System.out.print("Enter the breadth: ");
        int breadth = scanner.nextInt();

      
        if (length == breadth) {
            System.out.println("It can form a square.");
        } else {
            System.out.println("It cannot form a square.");
        }

        scanner.close();
    }
}

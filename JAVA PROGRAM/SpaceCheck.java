import java.util.Scanner;

public class SpaceCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); 

       
        if (ch == ' ') {
            System.out.println("The character is a space.");
        } else {
            System.out.println("The character is NOT a space.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class HuminiteStringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the first text:");
        String input1 = scanner.nextLine();

        System.out.println("Enter the second text:");
        String input2 = scanner.nextLine();

      
        if (input1.equals(input2)) {
            System.out.println("The texts are equal.");
        } else {
            System.out.println("The texts are not equal.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class DrivingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

      
        if (age >= 18) {
            System.out.println("You are eligible for a driving license.");
        } else {
            System.out.println("You are NOT eligible for a driving license.");
        }

        scanner.close();
    }
}

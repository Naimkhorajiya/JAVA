import java.util.Scanner;

public class PassFailChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        
        if (marks >= 35) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

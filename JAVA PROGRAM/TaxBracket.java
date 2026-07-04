import java.util.Scanner;

public class TaxBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your annual salary: ");
        double salary = scanner.nextDouble();

       
        if (salary < 250000) {
            System.out.println("No Tax.");
        } else if (salary <= 500000) {
            System.out.println("Tax Bracket: 5%");
        } else if (salary <= 1000000) {
            System.out.println("Tax Bracket: 20%");
        } else {
            System.out.println("Tax Bracket: 30%");
        }

        scanner.close();
    }
}

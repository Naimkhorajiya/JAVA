import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeap = true;
            }
        }

      
        boolean divisibleBy400 = (year % 400 == 0);

       
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        if (divisibleBy400) {
            System.out.println(year + " is divisible by 400.");
        } else {
            System.out.println(year + " is not divisible by 400.");
        }
    }
}

public class Division {
    public static void main(String[] args) {

        int dividend = 25;
        int divisor = 5;
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            int result = dividend / divisor;
            System.out.println("The result of " + dividend + " divided by " + divisor + " is: " + result);
        }
    }
}